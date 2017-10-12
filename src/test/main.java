package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bson.conversions.Bson;
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import basicoperation.Find;
import faulttolerant.Connect;

/*
 * 
 * @ Description:测试类
 * 
 */
public class main {
	
	public static void main(String[] args) {
		/*ServerAddress serverAddress = new ServerAddress("192.168.1.143", 27000);
		List<ServerAddress> addressList = new ArrayList<ServerAddress>();
		addressList.add(serverAddress);
		MongoClient client = new MongoClient(addressList);
		MongoDatabase mongoDatabase = client.getDatabase("testdb");
		String dbname = mongoDatabase.getName();
		System.out.println(dbname);
		client.close();*/
		MongoClient client = Connect.connectMongos("192.168.0.102", 30000);
		MongoDatabase mongoDatabase = client.getDatabase("testdb");
		MongoCollection collection = mongoDatabase.getCollection("yourdb");
		Find.find(collection);		
	}

}
