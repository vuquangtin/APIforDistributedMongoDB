package faulttolerant;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ReadPreference;
import com.mongodb.ServerAddress;
import com.mongodb.connection.Server;

/*
 * 
 * @ Description:连接mongos 需要上层维持各个mongos状态以及提供mongos数据库集请求入口 ip和端口
 * 
 */

public class Connect {
	
	/*
	 * 连接新的mongos数据库集请求入口
	 */
	public static MongoClient connectMongos(String ip, int port) {
		ServerAddress serverAddress = new ServerAddress(ip, port);
		List<ServerAddress> addressesList = new ArrayList<ServerAddress>();
		addressesList.add(serverAddress);
		MongoClient client = new MongoClient(addressesList);
		return client;
	}
	
	/*
	 * 连接新的mongos数据库集请求入口，设置读偏好优先读secondary结点，负载平衡
	 */
	public static MongoClient connectMongosWithreadPreference(String ip, int port) {
		ServerAddress serverAddress = new ServerAddress(ip, port);
		List<ServerAddress> addressesList = new ArrayList<ServerAddress>();
		addressesList.add(serverAddress);
		MongoClientOptions options = MongoClientOptions.builder().readPreference(ReadPreference.secondary()).build();
		MongoClient client = new MongoClient(addressesList, options);
		return client;
	}

}
