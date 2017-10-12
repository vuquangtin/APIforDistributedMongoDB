package basicoperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/*
 * 
 * @ Description:ping工具类
 * 
 */
public class Ping {
	/*
	 * @ Return:ture可用，false不可用
	 */
	public static boolean ping(String ip) throws Exception {
		int timeOut = 3000;
		boolean status = InetAddress.getByName(ip).isReachable(timeOut);
		return status;
	}
	
	public static void ping2(String ip) throws Exception {
		String line = null;
		try {
			Process process = Runtime.getRuntime().exec("ping " + ip);
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static boolean ping(String ip, int pingTimes, int timeOut) {
		BufferedReader bufferedReader = null;
		Runtime runtime = Runtime.getRuntime();
		String pingCommand = "ping " + ip + "-n" + pingTimes + "-w" + timeOut;
		try {
			System.out.println(pingCommand);
			Process process = runtime.exec(pingCommand);
			if(process == null) {
				return false;
			}
			bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			int connectedCount = 0;
			String line = null;
			while((line = bufferedReader.readLine()) != null) {
				connectedCount += getCheckResult(line);
			}
			return connectedCount == pingTimes;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		} finally {
			try{
				bufferedReader.close();
			} catch (IOException ioe) {
				// TODO: handle exception
				ioe.printStackTrace();
			}
		}
	}
	
	private static int getCheckResult(String line) {
		Pattern pattern = Pattern.compile("(\\d+ms)(\\s+)(TTL=\\d+)", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(line);
		while(matcher.find()) {
			return 1;
		}
		return 0;
	}
}
