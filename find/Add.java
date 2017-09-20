package find;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.bson.Document;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.UpdateResult;

public class Add {
	
	public static void addOne(MongoCollection collection,String name,int num1) {  //加入1个项目和数据
	    try {
          
	        List<Document> documents = new ArrayList<Document>(); 
	        documents.add(new Document("id",1).append(name, num1));
	        collection.insertMany(documents);
	        
	        System.out.println(collection.count());
	    }catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }
	}
	public static void addOne(MongoCollection collection,String cname,String num1) {  //加入1个项目和数据
	    try {
          
	        List<Document> documents = new ArrayList<Document>(); 
	        documents.add(new Document("id",1).append("cname", num1));
	        collection.insertMany(documents);
	        
	        System.out.println(collection.count());
	    }catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }
	}
	
	public static void addTwo(MongoCollection collection,String name1,int num1, String name2 ,int num2) {  //加入2个项目的数据
             
	    try {	    	
            List<Document> documents = new ArrayList<Document>(); 
	        documents.add(new Document("id",1).append(name1, num1).append(name2, num2));
	        collection.insertMany(documents);	        
	        System.out.println(collection.count());
	    }catch(MongoException e) {
            e.printStackTrace();
	    }
	}
	public static void addTwo(MongoCollection collection,String name1,int num1, String name2 ,String num2) {  //加入2个项目的数据
        
	    try {	    	
            List<Document> documents = new ArrayList<Document>(); 
	        documents.add(new Document("id",1).append(name1, num1).append(name2, num2));
	        collection.insertMany(documents);	        
	        System.out.println(collection.count());
	    }catch(MongoException e) {
            e.printStackTrace();
	    }
	}
	public static void addTwo(MongoCollection collection,String name1,String num1, String name2 ,int num2) {  //加入2个项目的数据
        
	    try {	    	
            List<Document> documents = new ArrayList<Document>(); 
	        documents.add(new Document("id",1).append(name1, num1).append(name2, num2));
	        collection.insertMany(documents);	        
	        System.out.println(collection.count());
	    }catch(MongoException e) {
            e.printStackTrace();
	    }
	}
	public static void addTwo(MongoCollection collection,String name1,String num1, String name2 ,String num2) {  //加入2个项目的数据
        
	    try {	    	
            List<Document> documents = new ArrayList<Document>(); 
	        documents.add(new Document("id",1).append(name1, num1).append(name2, num2));
	        collection.insertMany(documents);	        
	        System.out.println(collection.count());
	    }catch(MongoException e) {
            e.printStackTrace();
	    }
	}
	
	//在条件下先查询，再后续加入项目和数值 -->Update类中的updatePush（）方法
	
	public static void addTest(MongoCollection collection) {  //加入测试数据
            
	    try {	    	
	    	collection.deleteMany(new Document());
	        List<Document> documents = new ArrayList<Document>();
	        //循环写入
	        for(int i=0;i<10;i++){
	        	Document doc = new Document("id", i).append("description", "data"+i).append("num", i);    
	            documents.add(doc);
	        } 
	        for(int i=0;i<10;i++){
	        	Document doc = new Document("id", i).append("description", "base "+i).append("num", i*2).append("array", Arrays.asList(1, 2, 3, 4));    
	        	
	            documents.add(doc);
	        } 
	        //注意：用  Arrays.asList(1, 2, 3, 4)  方式存入数组！！
//	        for(int i=0;i<10;i++){
//	        	Document doc = new Document("id", i).append("description", "database"+i).append("num", i*3).append("by", "C");    
//	            documents.add(doc);
//	        } 
	        collection.insertMany(documents);
	        System.out.println(collection.count());
	        System.out.println("Done!");
	    }catch(MongoException e) {
            e.printStackTrace();
	    }
	}
	
}
