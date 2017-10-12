package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private int port;
	private boolean running = false;
	private long receiveTimeDelay = 3000;
	
	public Server(int port) {
		this.port = port;
	}
	
	public void start() {
		if(running) {
			return;
		}
		new Thread(new ConnWatchThread()).start();
	}
	
	public void stop() {
		if(running) {
			running = false;
		}
	}
	
	class ConnWatchThread implements Runnable {
		public void run() {
			try {
				ServerSocket serverSocket = new ServerSocket(port, 5);
				while(running) {
					Socket socket = serverSocket.accept();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
				Server.this.stop();
			}
		}
	}
	
	class ReplyThread implements Runnable {
		Socket socket;
		boolean run = true;
		long lastReceiveTime = System.currentTimeMillis();
		
		public ReplyThread(Socket socket) {
			this.socket = socket;
		}
		
		public void run() {
			while(running && run) {
				if(System.currentTimeMillis()-lastReceiveTime > receiveTimeDelay) {
					// TODO: handle the client is down
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
							OutputStream outputStream = socket.getOutputStream();
							PrintWriter printWriter = new PrintWriter(outputStream);
							lastReceiveTime = System.currentTimeMillis();
							printWriter.print("reply at:"+Long.toString(lastReceiveTime));
							printWriter.flush();
							socket.shutdownOutput();
						} else {
							Thread.sleep(10);
						}
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}
		}
		
		private void overThis() {
			if(run) {
				run = false;
			}
			if(socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			System.out.println("client is down");
		}
	}
}
