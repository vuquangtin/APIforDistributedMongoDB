package find;

import static com.mongodb.client.model.Filters.in;
import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;

public class Update {
	
	//1个查询条件，改该项目数值
	public static void updateNum(MongoCollection collection,String name,int num1,int num2){ //1个项目,改数值
        UpdateResult result = collection.updateMany(Filters.eq(name,num1) , new Document("$set", new Document(name,num2)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name,num2)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNum(MongoCollection collection,String name,String num1,String num2){ //1个项目,改数值，数值为String
        UpdateResult result = collection.updateMany(Filters.eq(name,num1) , new Document("$set", new Document(name,num2)));  
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name,num2)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNum(MongoCollection collection,String name,int num1,String num2){ //1个项目,改数值，数值为int->String
        UpdateResult result = collection.updateMany(Filters.eq(name,num1) , new Document("$set", new Document(name,num2)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNum(MongoCollection collection,String name,String num1,int num2){ //1个项目,改数值，数值为String->int
        UpdateResult result = collection.updateMany(Filters.eq(name,num1) , new Document("$set", new Document(name,num2)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(); 
        util.printAll(docs);//查看最新更新的文档
    }
	//1个查询条件，改另外一个项目的数值
	public static void updateNum(MongoCollection collection,String name1,int num1,String name2,int num2){ //1个项目,改数值
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$set", new Document(name2,num2)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name2,num2)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNum(MongoCollection collection,String name1,int num1,String name2,String num2){ //1个项目,改数值
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$set", new Document(name2,num2)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name2,num2)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNum(MongoCollection collection,String name1,String num1,String name2,int num2){ //1个项目,改数值
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$set", new Document(name2,num2)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name2,num2)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNum(MongoCollection collection,String name1,String num1,String name2,String num2){ //1个项目,改数值
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$set", new Document(name2,num2)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name2,num2)); 
        util.printAll(docs);//查看最新更新的文档
    }
	
	//1个查询条件，做ne操作，修改一个项目的值
	public static void updateNumNe(MongoCollection collection,String name1,int num1,String name2,int num2){ //1个项目,改数值
        UpdateResult result = collection.updateMany(Filters.ne(name1,num1) , new Document("$set", new Document(name2,num2)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name2,num2)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNumNe(MongoCollection collection,String name1,int num1,String name2,String num2){ //1个项目,改数值
        UpdateResult result = collection.updateMany(Filters.ne(name1,num1) , new Document("$set", new Document(name2,num2)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name2,num2)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNumNe(MongoCollection collection,String name1,String num1,String name2,int num2){ //1个项目,改数值
        UpdateResult result = collection.updateMany(Filters.ne(name1,num1) , new Document("$set", new Document(name2,num2)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name2,num2)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNumNe(MongoCollection collection,String name1,String num1,String name2,String num2){ //1个项目,改数值
        UpdateResult result = collection.updateMany(Filters.ne(name1,num1) , new Document("$set", new Document(name2,num2)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name2,num2)); 
        util.printAll(docs);//查看最新更新的文档
    }
	
//	//改2个文件，改项目名
//	public static void updateItemTwo(MongoClient client,String dbname,String colname,String name1,int num1,String name2,String name3,int num2,String name4){ //1个项目,只改项目名
//    	MongoDatabase mongoDatabase = client.getDatabase(dbname);
//	    MongoCollection collection = mongoDatabase.getCollection(colname);
//        System.out.println("find_connection!");
//        
//        UpdateResult result = collection.updateMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name3,num2)), new Document("$set", new Document(name2,num1).append(name4,num2)));
//        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
//        FindIterable<Document> docs =collection.find(Filters.eq(name2,num1)); 
//        util.printAll(docs);//查看最新更新的文档
//    }
    
	//用2个条件做查询，修改一个项目和该值
	//1.两个条件做and
	public static void updateNumTwoAnd(MongoCollection collection,String name1,int num1,String name2,int num2,String name3,int num3){ //修改一个项目值，值为int型
        UpdateResult result = collection.updateMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNumTwoAnd(MongoCollection collection,String name1,int num1,String name2,int num2,String name3,String num3){ //修改一个项目值，值为String型      
        UpdateResult result = collection.updateMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNumTwoAnd(MongoCollection collection,String name1,String num1,String name2,int num2,String name3,int num3){ //修改一个项目值，值为int型
        UpdateResult result = collection.updateMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNumTwoAnd(MongoCollection collection,String name1,String num1,String name2,int num2,String name3,String num3){ //修改一个项目值，值为int型
        UpdateResult result = collection.updateMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNumTwoAnd(MongoCollection collection,String name1,int num1,String name2,String num2,String name3,int num3){ //修改一个项目值，值为int型
        UpdateResult result = collection.updateMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNumTwoAnd(MongoCollection collection,String name1,int num1,String name2,String num2,String name3,String num3){ //修改一个项目值，值为int型
        UpdateResult result = collection.updateMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNumTwoAnd(MongoCollection collection,String name1,String num1,String name2,String num2,String name3,int num3){ //修改一个项目值，值为int型
        UpdateResult result = collection.updateMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNumTwoAnd(MongoCollection collection,String name1,String num1,String name2,String num2,String name3,String num3){ //修改一个项目值，值为int型
        UpdateResult result = collection.updateMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//查看最新更新的文档
    }
	//2.两个条件做or
	public static void updateNumTwoOr(MongoCollection collection,String name1,int num1,String name2,int num2,String name3,int num3){ //修改一个项目值，值为String型
        UpdateResult result = collection.updateMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNumTwoOr(MongoCollection collection,String name1,int num1,String name2,int num2,String name3,String num3){ //修改一个项目值，值为String型
        UpdateResult result = collection.updateMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNumTwoOr(MongoCollection collection,String name1,int num1,String name2,String num2,String name3,int num3){ //修改一个项目值，值为String型
        UpdateResult result = collection.updateMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNumTwoOr(MongoCollection collection,String name1,int num1,String name2,String num2,String name3,String num3){ //修改一个项目值，值为String型
        UpdateResult result = collection.updateMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNumTwoOr(MongoCollection collection,String name1,String num1,String name2,int num2,String name3,int num3){ //修改一个项目值，值为String型
        UpdateResult result = collection.updateMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNumTwoOr(MongoCollection collection,String name1,String num1,String name2,int num2,String name3,String num3){ //修改一个项目值，值为String型
        UpdateResult result = collection.updateMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNumTwoOr(MongoCollection collection,String name1,String num1,String name2,String num2,String name3,int num3){ //修改一个项目值，值为String型
        UpdateResult result = collection.updateMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateNumTwoOr(MongoCollection collection,String name1,String num1,String name2,String num2,String name3,String num3){ //修改一个项目值，值为String型
        UpdateResult result = collection.updateMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//查看最新更新的文档
    }
	
	//$inc
	public static void updateInc(MongoCollection collection,String name1,int num1,String name2,int num2){ //1个项目,改数值,第一组（name1，num1）做查询
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$inc", new Document(name2,num2)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updateInc(MongoCollection collection,String name1,String num1,String name2,int num2){ //1个项目,改数值,第一组（name1，num1）做查询
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$inc", new Document(name2,num2)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(); 
        util.printAll(docs);//查看最新更新的文档
    }
	
	//$Push
	public static void updatePush(MongoCollection collection,String name1,int num1,String name2,int num2){ //1个项目,改数值,第一组（name1，num1）做查询
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$push", new Document(name2,num2)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updatePush(MongoCollection collection,String name1,String num1,String name2,int num2){ //1个项目,改数值,第一组（name1，num1）做查询
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$push", new Document(name2,num2)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updatePush(MongoCollection collection,String name1,int num1,String name2,String num2){ //1个项目,改数值,第一组（name1，num1）做查询
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$push", new Document(name2,num2)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(); 
        util.printAll(docs);//查看最新更新的文档
    }
	public static void updatePush(MongoCollection collection,String name1,String num1,String name2,String num2){ //1个项目,改数值,第一组（name1，num1）做查询
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$push", new Document(name2,num2)));
        System.out.println("操作了"+result.getModifiedCount()+"个数据！");
        FindIterable<Document> docs =collection.find(); 
        util.printAll(docs);//查看最新更新的文档
    }
	
	
}
