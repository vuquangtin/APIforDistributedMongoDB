package basicoperation;

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
	//根据一个条件查询，删除多个
	public static void deleteOne(MongoCollection collection,String name,int num) { //删除多个
		try {
	        collection.deleteOne(Filters.eq(name,num)); 
	        FindIterable<Document> docs = collection.find();  //输出剩下的全部文档
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    } 
	}
	public static void deleteOne(MongoCollection collection,String name,String num) { //删除多个
		try {
	        collection.deleteOne(Filters.eq(name,num)); 
	        FindIterable<Document> docs = collection.find();  //输出剩下的全部文档
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    } 
	}
	public static void delete(MongoCollection collection,String name,int num) { //删除多个
		try {   
	        collection.deleteMany(Filters.eq(name,num)); 
	        FindIterable<Document> docs = collection.find();  //输出剩下的全部文档
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }  
	}
	public static void delete(MongoCollection collection,String name,String num) { //删除多个
		try {   
	        collection.deleteMany(Filters.eq(name,num)); 
	        FindIterable<Document> docs = collection.find();  //输出剩下的全部文档
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }  
	}
	
	//一个条件，gt给定值的项目删除
	public static void deleteGt(MongoCollection collection,String name,int num) { //删除多个,gt
		try {
			collection.deleteMany(Filters.gt(name,num)); 
	        FindIterable<Document> docs = collection.find();  //输出剩下的全部文档
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    } 
	}
	//一个条件，gte给定值的项目删除
	public static void deleteGte(MongoCollection collection,String name,int num) { //删除多个,gte
		try {
	        collection.deleteMany(Filters.gte(name,num)); 
	        FindIterable<Document> docs = collection.find();  //输出剩下的全部文档
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	//一个条件，lt给定值的项目删除
	public static void deleteLt(MongoCollection collection,String name,int num) { //删除多个,lt
		try {
	        collection.deleteMany(Filters.lt(name,num)); 
	        FindIterable<Document> docs = collection.find();  //输出剩下的全部文档
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }  
	}
	//一个条件，lte给定值的项目删除
	public static void deleteLte(MongoCollection collection,String name,int num) { //删除多个,lte
		try {
	        collection.deleteMany(Filters.lte(name,num)); 
	        FindIterable<Document> docs = collection.find();  //输出剩下的全部文档
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    } 
	}
	//2个条件and后做查询，再删除
	public static void deleteAnd(MongoCollection collection,String name1,int num1,String name2,int num2) { //删除，2个条件and
		try {
	        collection.deleteMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2))); 	
	        FindIterable<Document> docs = collection.find();  //输出剩下的全部文档
	        util.printDoc(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }  
	}
	public static void deleteAnd(MongoCollection collection,String name1,int num1,String name2,String num2) { //删除，2个条件and
		try {
	        collection.deleteMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2))); 	
	        FindIterable<Document> docs = collection.find();  //输出剩下的全部文档
	        util.printDoc(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }  
	}
	public static void deleteAnd(MongoCollection collection,String name1,String num1,String name2,int num2) { //删除，2个条件and
		try {
	        collection.deleteMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2))); 	
	        FindIterable<Document> docs = collection.find();  //输出剩下的全部文档
	        util.printDoc(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }  
	}
	public static void deleteAnd(MongoCollection collection,String name1,String num1,String name2,String num2) { //删除，2个条件and
		try {
	        collection.deleteMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2))); 	
	        FindIterable<Document> docs = collection.find();  //输出剩下的全部文档
	        util.printDoc(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }  
	}
	
	//2个条件做or后查询，删除相关文档
	public static void deleteOr(MongoCollection collection,String name1,int num1,String name2,int num2) { //删除，2个条件or
		try {
	        collection.deleteMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2))); 	
	        FindIterable<Document> docs = collection.find();  //输出剩下的全部文档
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	public static void deleteOr(MongoCollection collection,String name1,int num1,String name2,String num2) { //删除，2个条件or
		try {
	        collection.deleteMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2))); 	
	        FindIterable<Document> docs = collection.find();  //输出剩下的全部文档
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	public static void deleteOr(MongoCollection collection,String name1,String num1,String name2,int num2) { //删除，2个条件or
		try {
	        collection.deleteMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2))); 	
	        FindIterable<Document> docs = collection.find();  //输出剩下的全部文档
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	public static void deleteOr(MongoCollection collection,String name1,String num1,String name2,String num2) { //删除，2个条件or
		try {
	        collection.deleteMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2))); 	
	        FindIterable<Document> docs = collection.find();  //输出剩下的全部文档
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	
	
	//删除，1个条件中2个数值范围内的，包含边界
	public static void deleteCoverB(MongoCollection collection,String name1,int num1,int num2) { 
		try {
	        collection.deleteMany(Filters.and(Filters.gte(name1,num1),Filters.lte(name1,num2))); 	
	        FindIterable<Document> docs = collection.find();  //输出剩下的全部文档
	        util.printAll(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	public static void deleteCover(MongoCollection collection,String name1,int num1,int num2) { //删除，1个条件中2个数值范围内的，不包含边界
		try {
	        collection.deleteMany(Filters.and(Filters.gt(name1,num1),Filters.lt(name1,num2))); 	
	        FindIterable<Document> docs = collection.find();  //输出剩下的全部文档
	        util.printDoc(docs);
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	
	public static void deleteAll(MongoCollection collection) { //全部删除
		try {
	        collection.deleteMany(new BasicDBObject());//删除集合全部元素
	        System.out.println("Done!");
		}catch(MongoException e) {
            e.printStackTrace();
	    }
	    finally{
//	    	mongoClient.close();
	    }   
	}
	
	
}
