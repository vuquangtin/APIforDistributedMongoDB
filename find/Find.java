package find;

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
	public static void find(MongoCollection collection) { //��ѯ������ȫ��
		
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
	
	//����һ��������Ŀ�����ݣ��������з�����������Ŀ
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
	public static void find(MongoCollection collection,String name,String num) { //����һ��������Ŀ�����ݣ��������з�����������Ŀ
		
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
	
	
	//�������Ĳ�ѯ
	public static void findGt(MongoCollection collection,String name,String num) { //һ��������gt
		
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
    public static void findGt(MongoCollection collection,String name,int num) { //һ��������gt
		
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
    public static void findGte(MongoCollection collection,String name,String num) { //һ��������gte
		
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
    public static void findGte(MongoCollection collection,String name,int num) { //һ��������gte
		
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
	
	public static void findLt(MongoCollection collection,String name,int num) { //һ��������lt
		
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
	
    public static void findLte(MongoCollection collection,String name,int num) { //һ��������lte
 		
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
	public static void findCoverB(MongoCollection collection,String name,int num1,int num2) { //һ��������$and����,gte,lte
		
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
    public static void findCover(MongoCollection collection,String name,int num1,int num2) { //һ��������$and����,gt,lt
		
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
    public static void findOther(MongoCollection collection,String name,int num1,int num2) { //һ��������$and����,С��num1�����num2
		
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
    public static void findOrOne(MongoCollection collection,String name1,int num1,int num2) { //һ��������$or����
		
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
    public static void findOrOne(MongoCollection collection,String name1,int num1,String num2) { //һ��������$or����
		
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
    public static void findOrOne(MongoCollection collection,String name1,String num1,int num2) { //һ��������$or����
		
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
    public static void findOrOne(MongoCollection collection,String name1,String num1,String num2) { //һ��������$or����
		
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
    public static void findOneNe(MongoCollection collection,String name,int num) { //һ��������$ne����	
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
    public static void findOneNe(MongoCollection collection,String name,String num) { //һ��������$ne����	
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
    
    
    
    //2������
      //$and����
    public static void findTwoAnd(MongoCollection collection,String name1,int num1,String name2,int num2) { //����������$and����
		
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
    public static void findTwoAnd(MongoCollection collection,String name1,String num1,String name2,int num2) { //����������$and����
		
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
    public static void findTwoAnd(MongoCollection collection,String name1,int num1,String name2,String num2) { //����������$and����
		
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
    public static void findTwoAnd(MongoCollection collection,String name1,String num1,String name2,String num2) { //����������$and����
		
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
	public static void findTwoOr(MongoCollection collection,String name1,int num1,String name2,int num2) { //2��������$or����
		
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
	public static void findTwoOr(MongoCollection collection,String name1,String num1,String name2,int num2) { //2��������$or����
		
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
	public static void findTwoOr(MongoCollection collection,String name1,int num1,String name2,String num2) { //2��������$or����
		
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
	public static void findTwoOr(MongoCollection collection,String name1,String num1,String name2,String num2) { //2��������$or����
		
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
	
	//2������$and+$ne
	public static void findTwoAndNe(MongoCollection collection,String name1,int num1,String name2,int num2) { //�ڲ���ne,�ⲿ��and
	    FindIterable<Document> docs = collection.find(Filters.and(Filters.ne(name1,num1),Filters.ne(name2,num2)));  
	    util.printAll(docs); 
	}
	public static void findTwoAndNe(MongoCollection collection,String name1,String num1,String name2,String num2) { //�ڲ���ne,�ⲿ��and
	    FindIterable<Document> docs = collection.find(Filters.and(Filters.ne(name1,num1),Filters.ne(name2,num2)));  
	    util.printAll(docs); 
	}
	public static void findTwoAndNe(MongoCollection collection,String name1,int num1,String name2,String num2) { //�ڲ���ne,�ⲿ��and
	    FindIterable<Document> docs = collection.find(Filters.and(Filters.ne(name1,num1),Filters.ne(name2,num2)));  
	    util.printAll(docs); 
	}
	public static void findTwoAndNe(MongoCollection collection,String name1,String num1,String name2,int num2) { //�ڲ���ne,�ⲿ��and
	    FindIterable<Document> docs = collection.find(Filters.and(Filters.ne(name1,num1),Filters.ne(name2,num2)));  
	    util.printAll(docs); 
	}
	//2������$or+$ne
	public static void findTwoOrNe(MongoCollection collection,String name1,int num1,String name2,int num2) { //�ڲ���ne,�ⲿ��or
	    FindIterable<Document> docs = collection.find(Filters.or(Filters.ne(name1,num1),Filters.ne(name2,num2)));  
	    util.printAll(docs); 
	}
	public static void findTwoOrNe(MongoCollection collection,String name1,int num1,String name2,String num2) { //�ڲ���ne,�ⲿ��or
	    FindIterable<Document> docs = collection.find(Filters.or(Filters.ne(name1,num1),Filters.ne(name2,num2)));  
	    util.printAll(docs); 
	}
	public static void findTwoOrNe(MongoCollection collection,String name1,String num1,String name2,int num2) { //�ڲ���ne,�ⲿ��or
	    FindIterable<Document> docs = collection.find(Filters.or(Filters.ne(name1,num1),Filters.ne(name2,num2)));  
	    util.printAll(docs); 
	}
	public static void findTwoOrNe(MongoCollection collection,String name1,String num1,String name2,String num2) { //�ڲ���ne,�ⲿ��or
	    FindIterable<Document> docs = collection.find(Filters.or(Filters.ne(name1,num1),Filters.ne(name2,num2)));  
	    util.printAll(docs); 
	}
	
	
	
	  //��ֵ������gt/gte/lt/lte/and+gt lt/and+gte lte
    public static void findTwoCoverB(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4) { //ͬʱ��������������$and����,gte,lte
		
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
    public static void findTwoCover1(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4) { //ͬʱ��������������$and����,gte,lte
		
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
    public static void findTwoCover2(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4) { //ͬʱ��������������$and����,gte,lte
		
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
    public static void findTwoCover(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4) { //ͬʱ��������������$and����,gte,lte
		
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
    //2��������Χ����$or
	public static void findOrCoverB(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4) { //"��"��������������$or����,gte,lte
		
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
	public static void findOrCover1(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4) { //"��"��������������$or����,gt,lt
		
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
	public static void findOrCover2(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4) { //"��"��������������$or����,gte,lte
		
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
	public static void findOrCover(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4) { //"��"��������������$or����,gte,lte
		
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
	//3��������and
	public static void findThreeAnd(MongoCollection collection,String name1,int num1,String name2,int num2,String name3,int num3){ //3��������or����������start��
	       FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.and(Filters.eq(name2,num2),Filters.eq(name3,num3)))); 
	       util.printAll(docs); 
    }
	public static void findThreeAnd(MongoCollection collection,String name1,int num1,String name2,String num2,String name3,int num3){ //3��������or����������start��
	       FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.and(Filters.eq(name2,num2),Filters.eq(name3,num3)))); 
	       util.printAll(docs); 
    }
	public static void findThreeAnd(MongoCollection collection,String name1,int num1,String name2,int num2,String name3,String num3){ //3��������or����������start��
	       FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.and(Filters.eq(name2,num2),Filters.eq(name3,num3)))); 
	       util.printAll(docs); 
	}
	public static void findThreeAnd(MongoCollection collection,String name1,int num1,String name2,String num2,String name3,String num3){ //3��������or����������start��
	       FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.and(Filters.eq(name2,num2),Filters.eq(name3,num3)))); 
	       util.printAll(docs); 
	}
	public static void findThreeAnd(MongoCollection collection,String name1,String num1,String name2,int num2,String name3,int num3){ //3��������or����������start��
	       FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.and(Filters.eq(name2,num2),Filters.eq(name3,num3)))); 
	       util.printAll(docs); 
 }
	public static void findThreeAnd(MongoCollection collection,String name1,String num1,String name2,String num2,String name3,int num3){ //3��������or����������start��
	       FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.and(Filters.eq(name2,num2),Filters.eq(name3,num3)))); 
	       util.printAll(docs); 
 }
	public static void findThreeAnd(MongoCollection collection,String name1,String num1,String name2,int num2,String name3,String num3){ //3��������or����������start��
	       FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.and(Filters.eq(name2,num2),Filters.eq(name3,num3)))); 
	       util.printAll(docs); 
	}
	public static void findThreeAnd(MongoCollection collection,String name1,String num1,String name2,String num2,String name3,String num3){ //3��������or����������start��
	       FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.and(Filters.eq(name2,num2),Filters.eq(name3,num3)))); 
	       util.printAll(docs); 
	}
	
	
	
    /**
     * 
     * @param ��Ŀ1��
     * @param ��Ŀ1��ֵ int��
     * @param name2
     * @param num2
     * @param name3
     * @param String��
     * @param start
     */
    public static void findEqOrSkip(MongoCollection collection,String name1,int num1,String name2,int num2,String name3,String num3,int start){ //3��������or����������start��
        FindIterable<Document> docs = collection.find(Filters.or(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.or(Filters.eq(name2,num2),Filters.eq(name3,num3)))).skip(start); 
//        FindIterable<Document> docs = collection.find(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2))).skip(start); 
        util.printAll(docs); 
    }
    
    public static void findEqAndSkip(MongoCollection collection,String name1,int num1,String name2,int num2,int start){ //2��������and����������start��
        FindIterable<Document> docs = collection.find(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2))).skip(start); 
        util.printAll(docs); 
    }
    public static void findEqAndSkip(MongoCollection collection,String name1,int num1,String name2,int num2,String name3,String num3,int start){ //3��������or����������start��
        FindIterable<Document> docs = collection.find(Filters.and(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)),Filters.and(Filters.eq(name2,num2),Filters.eq(name3,num3)))).skip(start); 
//        FindIterable<Document> docs = collection.find(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2))).skip(start); 
        util.printAll(docs); 
    }
	
    
    //$ne
    public static void findEqNe(MongoCollection collection,String name1,int num1){ //1������,$ne
        FindIterable<Document> docs = collection.find(Filters.ne(name1,num1)); 
        util.printAll(docs);  
    }
    
    public static void findEqNe(MongoCollection collection,String name1,int num1,String name2,int num2){ //2������,or(ne,ne)
        FindIterable<Document> docs =collection.find(Filters.or(Filters.ne(name1,num1),Filters.ne(name2,num2))); 
        util.printAll(docs);
    }
    public static void findNe(MongoCollection collection,String name1,int num1,String name2,int num2){ //2������,and(ne,ne)
        FindIterable<Document> docs =collection.find(Filters.and(Filters.ne(name1,num1),Filters.ne(name2,num2))); 
        util.printAll(docs);
    }
    
	
    //$in
    public static void findIn(MongoCollection collection,String name,int num1,int num2){ //1����Ŀ��in
        FindIterable<Document> docs =collection.find(in(name, num1,num2)); 
        util.printAll(docs);
    }
    public static void findIn(MongoCollection collection,String name,String num1,String num2){ //1����Ŀ��in
        FindIterable<Document> docs =collection.find(in(name, num1,num2)); 
        util.printAll(docs);
    }
    public static void findIn(MongoCollection collection,String name,int num1,String num2){ //1����Ŀ��in
        FindIterable<Document> docs =collection.find(in(name, num1,num2)); 
        util.printAll(docs);
    }
    public static void findIn(MongoCollection collection,String name,String num1,int num2){ //1����Ŀ��in
        FindIterable<Document> docs =collection.find(in(name, num1,num2)); 
        util.printAll(docs);
    }
    
    //2��������ÿ��������2����ѡֵ��2��������and
    public static void findInAnd(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4){ //2����Ŀ��in+and
        FindIterable<Document> docs =collection.find(Filters.and(in(name1, num1,num2),in(name2,num3,num4))); 
        util.printAll(docs);
    }
    public static void findInAnd(MongoCollection collection,String name1,String num1,String num2,String name2,String num3,String num4){ //2����Ŀ��in+and
        FindIterable<Document> docs =collection.find(Filters.and(in(name1, num1,num2),in(name2,num3,num4))); 
        util.printAll(docs);
    }
    public static void findInAnd(MongoCollection collection,String name1,int num1,String num2,String name2,int num3,String num4){ //2����Ŀ��in+and
        FindIterable<Document> docs =collection.find(Filters.and(in(name1, num1,num2),in(name2,num3,num4))); 
        util.printAll(docs);
    }
    
    //2��������ÿ��������2����ѡֵ��2��������$or
    public static void findInOr(MongoCollection collection,String name1,int num1,int num2,String name2,int num3,int num4){ //2����Ŀ��in+or
        FindIterable<Document> docs =collection.find(Filters.or(in(name1, num1,num2),in(name2,num3,num4))); 
        util.printAll(docs);
    }
    public static void findInOr(MongoCollection collection,String name1,String num1,String num2,String name2,String num3,String num4){ //2����Ŀ��in+or
        FindIterable<Document> docs =collection.find(Filters.or(in(name1, num1,num2),in(name2,num3,num4))); 
        util.printAll(docs);
    }
    public static void findInOr(MongoCollection collection,String name1,int num1,String num2,String name2,int num3,String num4){ //2����Ŀ��in+or
        FindIterable<Document> docs =collection.find(Filters.or(in(name1, num1,num2),in(name2,num3,num4))); 
        util.printAll(docs);
    }
    
    //$exist
    public static void findExist(MongoCollection collection,String name){ //1����Ŀ��exist
        FindIterable<Document> docs =collection.find(Filters.exists(name)); 
        util.printAll(docs);
    }
    public static void findExistAnd(MongoCollection collection,String name1,String name2){ //2��������$and
        FindIterable<Document> docs =collection.find(Filters.and(Filters.exists(name1),Filters.exists(name2))); 
        util.printAll(docs);
    }
    public static void findExistOr(MongoCollection collection,String name1,String name2){ //2��������$and
        FindIterable<Document> docs =collection.find(Filters.or(Filters.exists(name1),Filters.exists(name2))); 
        util.printAll(docs);
    }
 
    
    //nin
    public static void findNin(MongoCollection collection,String name,int num1,int num2){ //1����Ŀ��nin
        FindIterable<Document> docs =collection.find(Filters.nin(name, num1,num2)); 
        util.printAll(docs);
    }
    public static void findNin(MongoCollection collection,String name,String num1,String num2){ //1����Ŀ��nin

        FindIterable<Document> docs =collection.find(Filters.nin(name, num1,num2)); 
        util.printAll(docs);
    }
    public static void findNin(MongoCollection collection,String name1,int num1,String num2){ //1����Ŀ��nin
        FindIterable<Document> docs =collection.find(Filters.nin(name1, num1,num2)); 
        util.printAll(docs);
    }
    public static void findNin(MongoCollection collection,String name1,String num1,int num2){ //1����Ŀ��nin
        FindIterable<Document> docs =collection.find(Filters.nin(name1, num1,num2)); 
        util.printAll(docs);
    }
    
    //size:Creates a filter that matches all documents where the value of a field is an array of the specified size.
    public static void findSize(MongoCollection collection,String name,int num){ //1����Ŀ
        FindIterable<Document> docs =collection.find(Filters.size(name,num)); 
        util.printAll(docs);
    }
    
    //Arrays.asList(1, 2, 3, 4)
    public static void findAll(MongoCollection collection,String name,int num1,int num2,int num3,int num4){ //�������������
        FindIterable<Document> docs =collection.find(Filters.all(name,Arrays.asList(num1, num2, num3, num4)));  
        util.printAll(docs);
    }
      //������������а�����
    public static void findAll(MongoCollection collection,String name,int[] num,int count){ //num�Ǵ������飬count��¼���鳤��
        List nums=null;
        for(int i=0;i<count;i++) {
        	nums.add(num[i]);
        }
        FindIterable<Document> docs =collection.find(Filters.all(name,nums));  
        util.printAll(docs);
    }
}
