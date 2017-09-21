package basicoperation;

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
	 * 输出查询的文档信息
	 * @param docs：满足条件的文档，
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
		System.out.println("共找到"+count+"个文件");
	}
	public static void printAll(FindIterable<Document> docs) {
		docs.forEach(new Block<Document>() { 
            @Override 
            public void apply(final Document document) { 
                System.out.println(document);  
                count++;
         }}); 
		System.out.println("共找到"+count+"个文件");
	}
	
	//跳过，skip
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
	
	//分页,limit
	public static FindIterable<Document> Page(FindIterable<Document> docs,int pageSize) {
		return docs.limit(pageSize);
	}
	//page与print函数结合
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