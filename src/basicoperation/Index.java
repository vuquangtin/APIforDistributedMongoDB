package basicoperation;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Index {
	public static void createIndex(MongoCollection collection,String name,int num) {
		 collection.createIndex(new Document(name, num));
	}
	
	public static void createIndexCom(MongoCollection collection,String name1,int num1,String name2,int num2) {
		 System.out.println("创建组合索引!");
		 //创建组合索引(同样遵循最左前缀原则)
		 collection.createIndex(new Document(name1, num1).append(name2, num2));
	}
	public static void createIndexCom(MongoCollection collection,String name1,String num1,String name2,int num2) {
		 System.out.println("创建组合索引!");
		 //创建组合索引(同样遵循最左前缀原则)
		 collection.createIndex(new Document(name1, num1).append(name2, num2));
	}
	public static void createIndexCom(MongoCollection collection,String name1,int num1,String name2,String num2) {
		 System.out.println("创建组合索引!");
		 //创建组合索引(同样遵循最左前缀原则)
		 collection.createIndex(new Document(name1, num1).append(name2, num2));
	}
	public static void createIndexCom(MongoCollection collection,String name1,String num1,String name2,String num2) {
		 System.out.println("创建组合索引!");
		 //创建组合索引(同样遵循最左前缀原则)
		 collection.createIndex(new Document(name1, num1).append(name2, num2));
	}
	
	
	public static void createIndexHashed(MongoCollection collection,String name) {
		 System.out.println("创建哈希索引!");
	     //创建哈希索引
		 collection.createIndex(new Document(name, "hashed"));
	}
	public static void createIndexText(MongoCollection collection,String name) { //创建文本索引
		 System.out.println("创建文本索引!");	    
		 collection.createIndex(new Document(name, "text"));
	}
	public static void dropIndex(MongoCollection collection,String name) { //删除该项索引
		 System.out.println("删除索引!");
		 collection.dropIndex(name);
	}
	public static void dropIndexes(MongoCollection collection) { //删除全部索引
		 System.out.println("删除索引!");
		 collection.dropIndexes();
	}
}