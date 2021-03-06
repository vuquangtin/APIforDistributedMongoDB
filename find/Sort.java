package find;

import static com.mongodb.client.model.Sorts.ascending;
import static com.mongodb.client.model.Sorts.descending;
import static com.mongodb.client.model.Sorts.metaTextScore;
import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Sort {
	public static void sortAc(MongoCollection collection,String name) { //����һ���ֶ���������
		 FindIterable<Document> docs = collection.find().sort(ascending(name));
		 System.out.println("Done!");
	}
	public static void sortAc(MongoCollection collection,String name1,String name2) { //����2���ֶ���������		 
		 FindIterable<Document> docs = collection.find().sort(ascending(name1,name2));
		 System.out.println("Done!");
	}
	
	public static void sortDe(MongoCollection collection,String name) { //����һ���ֶν�������		 
		 FindIterable<Document> docs = collection.find().sort(descending(name));
		 System.out.println("Done!");
	}
	public static void sortDe(MongoCollection collection,String name1,String name2) { //����2���ֶν�������	 
		 FindIterable<Document> docs = collection.find().sort(descending(name1,name2));
		 System.out.println("Done!");
	}
	public static void sortAcDe(MongoCollection collection,String name1,String name2) { //����name1����name2����
		 BasicDBObject type = new BasicDBObject();
         type.put(name1,1);
         type.put(name2,-1);
		 FindIterable<Document> docs = collection.find().sort(type);
		 System.out.println("Done!");
	}
	public static void sortDeAc(MongoCollection collection,String name1,String name2) { //����name1����name2����
		 BasicDBObject type = new BasicDBObject();
         type.put(name1,-1);
         type.put(name2,1);
		 FindIterable<Document> docs = collection.find().sort(type);
		 System.out.println("Done!");
	}
	
	//Combine multiple sort specifications.  If any field names are repeated, the last one takes precedence.
	public static void sortMetaText(MongoCollection collection,String name) { //	 
		 FindIterable<Document> docs = collection.find().sort(metaTextScore(name));
		 System.out.println("Done!");
	}
	
	public static void Sort(MongoCollection collection,String name1,String name2) { //sort�������������ʽ�� mongodb2.X
		 BasicDBObject type = new BasicDBObject();
         type.put(name1,1);
         type.put(name2,-1);
		 FindIterable<Document> docs = collection.find().sort(type);
		 System.out.println("Done!");
	}
	
	
}
