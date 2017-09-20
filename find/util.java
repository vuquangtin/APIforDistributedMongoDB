package find;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class util {
	static int count=0;
	/**
	 * �����ѯ���ĵ���Ϣ
	 * @param docs�������������ĵ���
	 */
	public static void printDoc(FindIterable<Document> docs) {
		docs.forEach(new Block<Document>() { 
            @Override 
            public void apply(final Document document) { 
                System.out.println(document);  
         }}); 
	}
	public static void printNum(FindIterable<Document> docs) {
		docs.forEach(new Block<Document>() { 
            @Override 
            public void apply(final Document document) { 
                count++;
         }}); 
		System.out.println("���ҵ�"+count+"���ļ�");
	}
	public static void printAll(FindIterable<Document> docs) {
		docs.forEach(new Block<Document>() { 
            @Override 
            public void apply(final Document document) { 
                System.out.println(document);  
                count++;
         }}); 
		System.out.println("���ҵ�"+count+"���ļ�");
	}
	
	//������skip
	public static FindIterable<Document> Skip(FindIterable<Document> docs,int skip) {
		return docs.skip(skip);
	}
	public static void printDocS(FindIterable<Document> docs,int skip) {
		util.printDoc(docs.skip(skip));
	}
	public static void printNumS(FindIterable<Document> docs,int skip) {
		util.printNum(docs.skip(skip));
	}
	public static void printAllS(FindIterable<Document> docs,int skip) {
		util.printAll(docs.skip(skip));
	}
	
	//��ҳ,limit
	public static FindIterable<Document> Page(FindIterable<Document> docs,int pageSize) {
		return docs.limit(pageSize);
	}
	//page��print�������
	public static void printDocL(FindIterable<Document> docs,int pageSize) {
		util.printDoc(docs.limit(pageSize));
	}
	public static void printNumL(FindIterable<Document> docs,int pageSize) {
		util.printNum(docs.skip(pageSize));
	}
	public static void printAllL(FindIterable<Document> docs,int pageSize) {
		util.printAll(docs.skip(pageSize));
	}
    
    
    
}
