package basicoperation;

import static com.mongodb.client.model.Filters.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class Find {
	public static void find(MongoCollection collection) { //查询集合内全部
		
		try {
	        System.out.println("findAll_connection!");

	        FindIterable<Document> docs = collection.find();  
            util.printDoc(docs);
	        
	        System.out.println(collection.count());
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	
	//给出一个查找项目和数据，返回所有符合条件的条目
	public static void find(MongoCollection collection,String name,int num) { 
		
		try {
	        System.out.println("find_one!");
	        
//		    FindIterable<Document> docs2 = collection.find(Filters.and(Filters.gt("num",8209),Filters.lt("num",8283)));  
//		    FindIterable<Document> iterable1 = collection.find(new Document(cname, num1));
//	        iterable1.forEach(new Block<Document>() { 
//	            @Override 
//	            public void apply(final Document document) { 
//	                System.out.println(document);  
//	         }}); 
	        FindIterable<Document> docs = collection.find(Filters.eq(name,num));
//	        for (Document document : docs1) {
//	            System.out.println(document.toJson());
//	        }
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }
	  
	}
	public static void find(MongoCollection collection,String name,String num) { //给出一个查找项目和数据，返回所有符合条件的条目
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.eq(name,num));
	        util.printAll(docs);
	        System.out.println(collection.count());
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }
	}
	
	
	//有条件的查询
	public static void findGt(MongoCollection collection,String name,String num) { //一个条件，gt
		
		try {
	        System.out.println("findGt_connection!");

	        FindIterable<Document> docs = collection.find(Filters.gt(name,num));  
	        util.printAll(docs);	        
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
    public static void findGt(MongoCollection collection,String name,int num) { //一个条件，gt
		
		try {
	        System.out.println("findGt_connection!");

	        FindIterable<Document> docs = collection.find(Filters.gt(name,num));  
	        util.printAll(docs);	        
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
    public static void findGte(MongoCollection collection,String name,String num) { //一个条件，gte
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.gte(name,num));  
	        util.printAll(docs);
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
    public static void findGte(MongoCollection collection,String name,int num) { //一个条件，gte
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.gte(name,num));  
	        util.printAll(docs);
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	
	public static void findLt(MongoCollection collection,String name,int num) { //一个条件，lt
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.lt(name,num));  
	        util.printAll(docs);

		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	
    public static void findLte(MongoCollection collection,String name,int num) { //一个条件，lte
 		
		try {
	        System.out.println("findGt_connection!");

	        FindIterable<Document> docs = collection.find(Filters.lte(name,num));  
	        util.printAll(docs);
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	public static void findCoverB(MongoCollection collection,String name,int num1,int num2) { //一个条件，$and操作,gte,lte
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.and(Filters.gte(name,num1),Filters.lte(name,num2)));  
	        util.printAll(docs);
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
    public static void findCover(MongoCollection collection,String name,int num1,int num2) { //一个条件，$and操作,gt,lt
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.and(Filters.gt(name,num1),Filters.lt(name,num2)));  
	        util.printAll(docs);
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
    public static void findOther(MongoCollection collection,String name,int num1,int num2) { //一个条件，$and操作,小于num1或大于num2
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.or(Filters.lt(name,num1),Filters.gt(name,num2)));  
	        util.printAll(docs);
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
    public static void findOrOne(MongoCollection collection,String name1,int num1,int num2) { //一个条件，$or操作
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.or(Filters.eq(name1,num1),Filters.eq(name1,num2)));  
	        util.printAll(docs);
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
    public static void findOrOne(MongoCollection collection,String name1,int num1,String num2) { //一个条件，$or操作
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.or(Filters.eq(name1,num1),Filters.eq(name1,num2)));  
	        util.printAll(docs);
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
    public static void findOrOne(MongoCollection collection,String name1,String num1,int num2) { //一个条件，$or操作
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.or(Filters.eq(name1,num1),Filters.eq(name1,num2)));  
	        util.printAll(docs);
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
    public static void findOrOne(MongoCollection collection,String name1,String num1,String num2) { //一个条件，$or操作
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.or(Filters.eq(name1,num1),Filters.eq(name1,num2)));  
	        util.printAll(docs);
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
    public static void findOneNe(MongoCollection collection,String name,int num) { //一个条件，$ne操作	
		try {
	        FindIterable<Document> docs = collection.find(Filters.ne(name,num));  
	        util.printAll(docs);
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
    public static void findOneNe(MongoCollection collection,String name,String num) { //一个条件，$ne操作	
		try {
	        FindIterable<Document> docs = collection.find(Filters.ne(name,num));  
	        util.printAll(docs);
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
    
    
    
    //2个条件
      //$and操作
    public static void findTwoAnd(MongoCollection collection,String name1,int num1,String name2,int num2) { //两个条件，$and操作
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)));  
	        util.printAll(docs); 
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
    public static void findTwoAnd(MongoCollection collection,String name1,String num1,String name2,int num2) { //两个条件，$and操作
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)));  
	        util.printAll(docs); 
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
    public static void findTwoAnd(MongoCollection collection,String name1,int num1,String name2,String num2) { //两个条件，$and操作
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)));  
	        util.printAll(docs); 
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
    public static void findTwoAnd(MongoCollection collection,String name1,String num1,String name2,String num2) { //两个条件，$and操作
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)));  
	        util.printAll(docs); 
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
      //$or
	public static void findTwoOr(MongoCollection collection,String name1,int num1,String name2,int num2) { //2个条件，$or操作
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)));  
	        util.printAll(docs); 
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}	 
	public static void findTwoOr(MongoCollection collection,String name1,String num1,String name2,int num2) { //2个条件，$or操作
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)));  
	        util.printAll(docs); 
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}	 
	public static void findTwoOr(MongoCollection collection,String name1,int num1,String name2,String num2) { //2个条件，$or操作
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)));  
	        util.printAll(docs); 
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	public static void findTwoOr(MongoCollection collection,String name1,String num1,String name2,String num2) { //2个条件，$or操作
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)));  
	        util.printAll(docs); 
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	
	//2个条件$and+$ne
	public static void findTwoAndNe(MongoCollection collection,String name1,int num1,String name2,int num2) { //内部是ne,外部是and
	    FindIterable<Document> docs = collection.find(Filters.and(Filters.ne(name1,num1),Filters.ne(name2,num2)));  
	    util.printAll(docs); 
	}
	public static void findTwoAndNe(MongoCollection collection,String name1,String num1,String name2,String num2) { //内部是ne,外部是and
	    FindIterable<Document> docs = collection.find(Filters.and(Filters.ne(name1,num1),Filters.ne(name2,num2)));  
	    util.printAll(docs); 
	}
	public static void findTwoAndNe(MongoCollection collection,String name1,int num1,String name2,String num2) { //内部是ne,外部是and
	    FindIterable<Document> docs = collection.find(Filters.and(Filters.ne(name1,num1),Filters.ne(name2,num2)));  
	    util.printAll(docs); 
	}
	public static void findTwoAndNe(MongoCollection collection,String name1,String num1,String name2,int num2) { //内部是ne,外部是and
	    FindIterable<Document> docs = collection.find(Filters.and(Filters.ne(name1,num1),Filters.ne(name2,num2)));  
	    util.printAll(docs); 
	}
	//2个条件$or+$ne
	public static void findTwoOrNe(MongoCollection collection,String name1,int num1,String name2,int num2) { //内部是ne,外部是or
	    FindIterable<Document> docs = collection.find(Filters.or(Filters.ne(name1,num1),Filters.ne(name2,num2)));  
	    util.printAll(docs); 
	}
	public static void findTwoOrNe(MongoCollection collection,String name1,int num1,String name2,String num2) { //内部是ne,外部是or
	    FindIterable<Document> docs = collection.find(Filters.or(Filters.ne(name1,num1),Filters.ne(name2,num2)));  
	    util.printAll(docs); 
	}
	public static void findTwoOrNe(MongoCollection collection,String name1,String num1,String name2,int num2) { //内部是ne,外部是or
	    FindIterable<Document> docs = collection.find(Filters.or(Filters.ne(name1,num1),Filters.ne(name2,num2)));  
	    util.printAll(docs); 
	}
	public static void findTwoOrNe(MongoCollection collection,String name1,String num1,String name2,String num2) { //内部是ne,外部是or
	    FindIterable<Document> docs = collection.find(Filters.or(Filters.ne(name1,num1),Filters.ne(name2,num2)));  
	    util.printAll(docs); 
	}
	
	
	
	  //数值操作：gt/gte/lt/lte/and+gt lt/and+gte lte
    public static void findTwoCoverB(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4) { //同时满足两个条件，$and操作,gte,lte
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.gte(name1,num1),Filters.lte(name1,num2)),Filters.and(Filters.gte(name2,num3),Filters.lte(name2,num4))));  
	        util.printAll(docs);
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
    public static void findTwoCover1(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4) { //同时满足两个条件，$and操作,gte,lte
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.gt(name1,num1),Filters.lt(name1,num2)),Filters.and(Filters.gte(name2,num3),Filters.lte(name2,num4))));  
	        util.printAll(docs);
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
    public static void findTwoCover2(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4) { //同时满足两个条件，$and操作,gte,lte
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.gte(name1,num1),Filters.lte(name1,num2)),Filters.and(Filters.gt(name2,num3),Filters.lt(name2,num4))));  
	        util.printAll(docs);
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
    public static void findTwoCover(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4) { //同时满足两个条件，$and操作,gte,lte
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.gt(name1,num1),Filters.lt(name1,num2)),Filters.and(Filters.gt(name2,num3),Filters.lt(name2,num4))));  
	        util.printAll(docs);
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
    //2个条件范围，做$or
	public static void findOrCoverB(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4) { //"或"满足两个条件，$or操作,gte,lte
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.or(Filters.and(Filters.gte(name1,num1),Filters.lte(name1,num2)),Filters.and(Filters.gte(name2,num3),Filters.lte(name2,num4))));  
	        util.printAll(docs);
		}catch(MongoException e) {
	        e.printStackTrace();
	    }
	    finally{
	//    	mongoClient.close();
	    }   
	}
	public static void findOrCover1(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4) { //"或"满足两个条件，$or操作,gt,lt
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.or(Filters.and(Filters.gt(name1,num1),Filters.lt(name1,num2)),Filters.and(Filters.gte(name2,num3),Filters.lte(name2,num4))));  
	        util.printAll(docs);
		}catch(MongoException e) {
	        e.printStackTrace();
	    }
	    finally{
	//    	mongoClient.close();
	    }   
	}
	public static void findOrCover2(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4) { //"或"满足两个条件，$or操作,gte,lte
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.or(Filters.and(Filters.gte(name1,num1),Filters.lte(name1,num2)),Filters.and(Filters.gt(name2,num3),Filters.lt(name2,num4))));  
	        util.printAll(docs);
		}catch(MongoException e) {
	        e.printStackTrace();
	    }
	    finally{
	//    	mongoClient.close();
	    }   
	}
	public static void findOrCover(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4) { //"或"满足两个条件，$or操作,gte,lte
		
		try {
	        FindIterable<Document> docs = collection.find(Filters.or(Filters.and(Filters.gt(name1,num1),Filters.lt(name1,num2)),Filters.and(Filters.gt(name2,num3),Filters.lt(name2,num4))));  
	        util.printAll(docs);
		}catch(MongoException e) {
	        e.printStackTrace();
	    }
	    finally{
	//    	mongoClient.close();
	    }   
	}
	//3个条件做and
	public static void findThreeAnd(MongoCollection collection,String name1,int num1,String name2,int num2,String name3,int num3){ //3个条件，or操作，跳过start个
	       FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.and(Filters.eq(name2,num2),Filters.eq(name3,num3)))); 
	       util.printAll(docs); 
    }
	public static void findThreeAnd(MongoCollection collection,String name1,int num1,String name2,String num2,String name3,int num3){ //3个条件，or操作，跳过start个
	       FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.and(Filters.eq(name2,num2),Filters.eq(name3,num3)))); 
	       util.printAll(docs); 
    }
	public static void findThreeAnd(MongoCollection collection,String name1,int num1,String name2,int num2,String name3,String num3){ //3个条件，or操作，跳过start个
	       FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.and(Filters.eq(name2,num2),Filters.eq(name3,num3)))); 
	       util.printAll(docs); 
	}
	public static void findThreeAnd(MongoCollection collection,String name1,int num1,String name2,String num2,String name3,String num3){ //3个条件，or操作，跳过start个
	       FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.and(Filters.eq(name2,num2),Filters.eq(name3,num3)))); 
	       util.printAll(docs); 
	}
	public static void findThreeAnd(MongoCollection collection,String name1,String num1,String name2,int num2,String name3,int num3){ //3个条件，or操作，跳过start个
	       FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.and(Filters.eq(name2,num2),Filters.eq(name3,num3)))); 
	       util.printAll(docs); 
 }
	public static void findThreeAnd(MongoCollection collection,String name1,String num1,String name2,String num2,String name3,int num3){ //3个条件，or操作，跳过start个
	       FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.and(Filters.eq(name2,num2),Filters.eq(name3,num3)))); 
	       util.printAll(docs); 
 }
	public static void findThreeAnd(MongoCollection collection,String name1,String num1,String name2,int num2,String name3,String num3){ //3个条件，or操作，跳过start个
	       FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.and(Filters.eq(name2,num2),Filters.eq(name3,num3)))); 
	       util.printAll(docs); 
	}
	public static void findThreeAnd(MongoCollection collection,String name1,String num1,String name2,String num2,String name3,String num3){ //3个条件，or操作，跳过start个
	       FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.and(Filters.eq(name2,num2),Filters.eq(name3,num3)))); 
	       util.printAll(docs); 
	}
	
	
	
    /**
     * 
     * @param 项目1名
     * @param 项目1数值 int型
     * @param name2
     * @param num2
     * @param name3
     * @param String型
     * @param start
     */
    public static void findEqOrSkip(MongoCollection collection,String name1,int num1,String name2,int num2,String name3,String num3,int start){ //3个条件，or操作，跳过start个
        FindIterable<Document> docs = collection.find(Filters.or(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.or(Filters.eq(name2,num2),Filters.eq(name3,num3)))).skip(start); 
//        FindIterable<Document> docs = collection.find(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2))).skip(start); 
        util.printAll(docs); 
    }
    
    public static void findEqAndSkip(MongoCollection collection,String name1,int num1,String name2,int num2,int start){ //2个条件，and操作，跳过start个
        FindIterable<Document> docs = collection.find(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2))).skip(start); 
        util.printAll(docs); 
    }
    public static void findEqAndSkip(MongoCollection collection,String name1,int num1,String name2,int num2,String name3,String num3,int start){ //3个条件，or操作，跳过start个
        FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.and(Filters.eq(name2,num2),Filters.eq(name3,num3)))).skip(start); 
//        FindIterable<Document> docs = collection.find(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2))).skip(start); 
        util.printAll(docs); 
    }
	
    
    //$ne
    public static void findEqNe(MongoCollection collection,String name1,int num1){ //1个条件,$ne
        FindIterable<Document> docs = collection.find(Filters.ne(name1,num1)); 
        util.printAll(docs);  
    }
    
    public static void findEqNe(MongoCollection collection,String name1,int num1,String name2,int num2){ //2个条件,or(ne,ne)
        FindIterable<Document> docs =collection.find(Filters.or(Filters.ne(name1,num1),Filters.ne(name2,num2))); 
        util.printAll(docs);
    }
    public static void findNe(MongoCollection collection,String name1,int num1,String name2,int num2){ //2个条件,and(ne,ne)
        FindIterable<Document> docs =collection.find(Filters.and(Filters.ne(name1,num1),Filters.ne(name2,num2))); 
        util.printAll(docs);
    }
    
	
    //$in
    public static void findIn(MongoCollection collection,String name,int num1,int num2){ //1个项目，in
        FindIterable<Document> docs =collection.find(in(name, num1,num2)); 
        util.printAll(docs);
    }
    public static void findIn(MongoCollection collection,String name,String num1,String num2){ //1个项目，in
        FindIterable<Document> docs =collection.find(in(name, num1,num2)); 
        util.printAll(docs);
    }
    public static void findIn(MongoCollection collection,String name,int num1,String num2){ //1个项目，in
        FindIterable<Document> docs =collection.find(in(name, num1,num2)); 
        util.printAll(docs);
    }
    public static void findIn(MongoCollection collection,String name,String num1,int num2){ //1个项目，in
        FindIterable<Document> docs =collection.find(in(name, num1,num2)); 
        util.printAll(docs);
    }
    
    //2个条件，每个条件有2个候选值，2个条件做and
    public static void findInAnd(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4){ //2个项目，in+and
        FindIterable<Document> docs =collection.find(Filters.and(in(name1, num1,num2),in(name2,num3,num4))); 
        util.printAll(docs);
    }
    public static void findInAnd(MongoCollection collection,String name1,String num1,String num2,String name2,String num3,String num4){ //2个项目，in+and
        FindIterable<Document> docs =collection.find(Filters.and(in(name1, num1,num2),in(name2,num3,num4))); 
        util.printAll(docs);
    }
    public static void findInAnd(MongoCollection collection,String name1,int num1,String num2,String name2,int num3,String num4){ //2个项目，in+and
        FindIterable<Document> docs =collection.find(Filters.and(in(name1, num1,num2),in(name2,num3,num4))); 
        util.printAll(docs);
    }
    
    //2个条件，每个条件有2个候选值，2个条件做$or
    public static void findInOr(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4){ //2个项目，in+or
        FindIterable<Document> docs =collection.find(Filters.or(in(name1, num1,num2),in(name2,num3,num4))); 
        util.printAll(docs);
    }
    public static void findInOr(MongoCollection collection,String name1,String num1,String num2,String name2,String num3,String num4){ //2个项目，in+or
        FindIterable<Document> docs =collection.find(Filters.or(in(name1, num1,num2),in(name2,num3,num4))); 
        util.printAll(docs);
    }
    public static void findInOr(MongoCollection collection,String name1,int num1,String num2,String name2,int num3,String num4){ //2个项目，in+or
        FindIterable<Document> docs =collection.find(Filters.or(in(name1, num1,num2),in(name2,num3,num4))); 
        util.printAll(docs);
    }
    
    //$exist
    public static void findExist(MongoCollection collection,String name){ //1个项目，exist
        FindIterable<Document> docs =collection.find(Filters.exists(name)); 
        util.printAll(docs);
    }
    public static void findExistAnd(MongoCollection collection,String name1,String name2){ //2个条件，$and
        FindIterable<Document> docs =collection.find(Filters.and(Filters.exists(name1),Filters.exists(name2))); 
        util.printAll(docs);
    }
    public static void findExistOr(MongoCollection collection,String name1,String name2){ //2个条件，$and
        FindIterable<Document> docs =collection.find(Filters.or(Filters.exists(name1),Filters.exists(name2))); 
        util.printAll(docs);
    }
 
    
    //nin
    public static void findNin(MongoCollection collection,String name,int num1,int num2){ //1个项目，nin
        FindIterable<Document> docs =collection.find(Filters.nin(name, num1,num2)); 
        util.printAll(docs);
    }
    public static void findNin(MongoCollection collection,String name,String num1,String num2){ //1个项目，nin

        FindIterable<Document> docs =collection.find(Filters.nin(name, num1,num2)); 
        util.printAll(docs);
    }
    public static void findNin(MongoCollection collection,String name1,int num1,String num2){ //1个项目，nin
        FindIterable<Document> docs =collection.find(Filters.nin(name1, num1,num2)); 
        util.printAll(docs);
    }
    public static void findNin(MongoCollection collection,String name1,String num1,int num2){ //1个项目，nin
        FindIterable<Document> docs =collection.find(Filters.nin(name1, num1,num2)); 
        util.printAll(docs);
    }
    
    //size:Creates a filter that matches all documents where the value of a field is an array of the specified size.
    public static void findSize(MongoCollection collection,String name,int num){ //1个项目
        FindIterable<Document> docs =collection.find(Filters.size(name,num)); 
        util.printAll(docs);
    }
    
    //Arrays.asList(1, 2, 3, 4)
    public static void findAll(MongoCollection collection,String name,int num1,int num2,int num3,int num4){ //最笨方法传入数组
        FindIterable<Document> docs =collection.find(Filters.all(name,Arrays.asList(num1, num2, num3, num4)));  
        util.printAll(docs);
    }
      //这个方法不可行啊！！
    public static void findAll(MongoCollection collection,String name,int[] num,int count){ //num是传入数组，count记录数组长度
        List nums=null;
        for(int i=0;i<count;i++) {
        	nums.add(num[i]);
        }
        FindIterable<Document> docs =collection.find(Filters.all(name,nums));  
        util.printAll(docs);
    }
}