package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	private String serverIp;
	private int port;
	private Socket socket;
	private boolean running = false;
	private long lastSendTime;
	
	public Client(String serverIp, int port) {
		this.serverIp = serverIp;
		this.port = port;
	}
	
	public void start() throws UnknownHostException, IOException {
		if(running) {
			return;
		}
		socket = new Socket(serverIp, port);
		lastSendTime = System.currentTimeMillis();
		running = true;
		new Thread(new CheckAliveThread()).start();
		new Thread(new ReceiveThread()).start();
	}
	
	public void stop() {
		if(running) {
			running = false;
		}
	}
	
	class CheckAliveThread implements Runnable {
		long checkDelay = 10;
		long keepAliveDelay = 2000;
		public void run() {
			while(running) {
				if(System.currentTimeMillis()-lastSendTime > keepAliveDelay) {
					try {
						OutputStream outputStream = socket.getOutputStream();
						PrintWriter printWriter = new PrintWriter(outputStream);
						printWriter.print("check server at:"+Long.toString(lastSendTime));
						printWriter.flush();
						socket.shutdownOutput();
					} catch (IOException e) {
						// TODO: handle exception
						e.printStackTrace();
						Client.this.stop();
					}
					lastSendTime = System.currentTimeMillis();
				} else {
					try {
						Thread.sleep(checkDelay);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
						Client.this.stop();
					}
				}
			}
		}
	}
	
	class ReceiveThread implements Runnable {
		long receiveTimeDelay = 3000;
		public void run() {
			while(running) {
				if(System.currentTimeMillis()-lastSendTime > receiveTimeDelay){
					// TODO: handle the server is down
					overThis();
				} else {
					try {
						InputStream inputStream = socket.getInputStream();
						if(inputStream.available() > 0) {
							InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
							BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
							String info = "";
							String line = null;
							while((line = bufferedReader.readLine()) != null) {
								info += line;
							}
							System.out.println(info);
						} else {
							Thread.sleep(10);
						}
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
						Client.this.stop();
					}
				}
			}
		}
		
		private void overThis() {
			System.out.println("server is down");
		}
	}
}
