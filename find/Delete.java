package find;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class Delete {
	//����һ��������ѯ��ɾ�����
	public static void deleteOne(MongoCollection collection,String name,int num) { //ɾ�����
		try {
	        collection.deleteOne(Filters.eq(name,num)); 
	        FindIterable<Document> docs = collection.find();  //���ʣ�µ�ȫ���ĵ�
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    } 
	}
	public static void deleteOne(MongoCollection collection,String name,String num) { //ɾ�����
		try {
	        collection.deleteOne(Filters.eq(name,num)); 
	        FindIterable<Document> docs = collection.find();  //���ʣ�µ�ȫ���ĵ�
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    } 
	}
	public static void delete(MongoCollection collection,String name,int num) { //ɾ�����
		try {   
	        collection.deleteMany(Filters.eq(name,num)); 
	        FindIterable<Document> docs = collection.find();  //���ʣ�µ�ȫ���ĵ�
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }  
	}
	public static void delete(MongoCollection collection,String name,String num) { //ɾ�����
		try {   
	        collection.deleteMany(Filters.eq(name,num)); 
	        FindIterable<Document> docs = collection.find();  //���ʣ�µ�ȫ���ĵ�
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }  
	}
	
	//һ��������gt����ֵ����Ŀɾ��
	public static void deleteGt(MongoCollection collection,String name,int num) { //ɾ�����,gt
		try {
			collection.deleteMany(Filters.gt(name,num)); 
	        FindIterable<Document> docs = collection.find();  //���ʣ�µ�ȫ���ĵ�
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    } 
	}
	//һ��������gte����ֵ����Ŀɾ��
	public static void deleteGte(MongoCollection collection,String name,int num) { //ɾ�����,gte
		try {
	        collection.deleteMany(Filters.gte(name,num)); 
	        FindIterable<Document> docs = collection.find();  //���ʣ�µ�ȫ���ĵ�
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	//һ��������lt����ֵ����Ŀɾ��
	public static void deleteLt(MongoCollection collection,String name,int num) { //ɾ�����,lt
		try {
	        collection.deleteMany(Filters.lt(name,num)); 
	        FindIterable<Document> docs = collection.find();  //���ʣ�µ�ȫ���ĵ�
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }  
	}
	//һ��������lte����ֵ����Ŀɾ��
	public static void deleteLte(MongoCollection collection,String name,int num) { //ɾ�����,lte
		try {
	        collection.deleteMany(Filters.lte(name,num)); 
	        FindIterable<Document> docs = collection.find();  //���ʣ�µ�ȫ���ĵ�
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    } 
	}
	//2������and������ѯ����ɾ��
	public static void deleteAnd(MongoCollection collection,String name1,int num1,String name2,int num2) { //ɾ����2������and
		try {
	        collection.deleteMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2))); 	
	        FindIterable<Document> docs = collection.find();  //���ʣ�µ�ȫ���ĵ�
	        util.printDoc(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }  
	}
	public static void deleteAnd(MongoCollection collection,String name1,int num1,String name2,String num2) { //ɾ����2������and
		try {
	        collection.deleteMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2))); 	
	        FindIterable<Document> docs = collection.find();  //���ʣ�µ�ȫ���ĵ�
	        util.printDoc(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }  
	}
	public static void deleteAnd(MongoCollection collection,String name1,String num1,String name2,int num2) { //ɾ����2������and
		try {
	        collection.deleteMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2))); 	
	        FindIterable<Document> docs = collection.find();  //���ʣ�µ�ȫ���ĵ�
	        util.printDoc(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }  
	}
	public static void deleteAnd(MongoCollection collection,String name1,String num1,String name2,String num2) { //ɾ����2������and
		try {
	        collection.deleteMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2))); 	
	        FindIterable<Document> docs = collection.find();  //���ʣ�µ�ȫ���ĵ�
	        util.printDoc(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }  
	}
	
	//2��������or���ѯ��ɾ������ĵ�
	public static void deleteOr(MongoCollection collection,String name1,int num1,String name2,int num2) { //ɾ����2������or
		try {
	        collection.deleteMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2))); 	
	        FindIterable<Document> docs = collection.find();  //���ʣ�µ�ȫ���ĵ�
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	public static void deleteOr(MongoCollection collection,String name1,int num1,String name2,String num2) { //ɾ����2������or
		try {
	        collection.deleteMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2))); 	
	        FindIterable<Document> docs = collection.find();  //���ʣ�µ�ȫ���ĵ�
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	public static void deleteOr(MongoCollection collection,String name1,String num1,String name2,int num2) { //ɾ����2������or
		try {
	        collection.deleteMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2))); 	
	        FindIterable<Document> docs = collection.find();  //���ʣ�µ�ȫ���ĵ�
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	public static void deleteOr(MongoCollection collection,String name1,String num1,String name2,String num2) { //ɾ����2������or
		try {
	        collection.deleteMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2))); 	
	        FindIterable<Document> docs = collection.find();  //���ʣ�µ�ȫ���ĵ�
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	
	
	//ɾ����1��������2����ֵ��Χ�ڵģ������߽�
	public static void deleteCoverB(MongoCollection collection,String name1,int num1,int num2) { 
		try {
	        collection.deleteMany(Filters.and(Filters.gte(name1,num1),Filters.lte(name1,num2))); 	
	        FindIterable<Document> docs = collection.find();  //���ʣ�µ�ȫ���ĵ�
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	public static void deleteCover(MongoCollection collection,String name1,int num1,int num2) { //ɾ����1��������2����ֵ��Χ�ڵģ��������߽�
		try {
	        collection.deleteMany(Filters.and(Filters.gt(name1,num1),Filters.lt(name1,num2))); 	
	        FindIterable<Document> docs = collection.find();  //���ʣ�µ�ȫ���ĵ�
	        util.printDoc(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	
	public static void deleteAll(MongoCollection collection) { //ȫ��ɾ��
		try {
	        collection.deleteMany(new BasicDBObject());//ɾ������ȫ��Ԫ��
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	
	
}
