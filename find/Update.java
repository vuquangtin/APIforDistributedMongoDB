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
	
	//1����ѯ�������ĸ���Ŀ��ֵ
	public static void updateNum(MongoCollection collection,String name,int num1,int num2){ //1����Ŀ,����ֵ
        UpdateResult result = collection.updateMany(Filters.eq(name,num1) , new Document("$set", new Document(name,num2)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name,num2)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNum(MongoCollection collection,String name,String num1,String num2){ //1����Ŀ,����ֵ����ֵΪString
        UpdateResult result = collection.updateMany(Filters.eq(name,num1) , new Document("$set", new Document(name,num2)));  
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name,num2)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNum(MongoCollection collection,String name,int num1,String num2){ //1����Ŀ,����ֵ����ֵΪint->String
        UpdateResult result = collection.updateMany(Filters.eq(name,num1) , new Document("$set", new Document(name,num2)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNum(MongoCollection collection,String name,String num1,int num2){ //1����Ŀ,����ֵ����ֵΪString->int
        UpdateResult result = collection.updateMany(Filters.eq(name,num1) , new Document("$set", new Document(name,num2)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	//1����ѯ������������һ����Ŀ����ֵ
	public static void updateNum(MongoCollection collection,String name1,int num1,String name2,int num2){ //1����Ŀ,����ֵ
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$set", new Document(name2,num2)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name2,num2)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNum(MongoCollection collection,String name1,int num1,String name2,String num2){ //1����Ŀ,����ֵ
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$set", new Document(name2,num2)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name2,num2)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNum(MongoCollection collection,String name1,String num1,String name2,int num2){ //1����Ŀ,����ֵ
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$set", new Document(name2,num2)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name2,num2)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNum(MongoCollection collection,String name1,String num1,String name2,String num2){ //1����Ŀ,����ֵ
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$set", new Document(name2,num2)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name2,num2)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	
	//1����ѯ��������ne�������޸�һ����Ŀ��ֵ
	public static void updateNumNe(MongoCollection collection,String name1,int num1,String name2,int num2){ //1����Ŀ,����ֵ
        UpdateResult result = collection.updateMany(Filters.ne(name1,num1) , new Document("$set", new Document(name2,num2)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name2,num2)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNumNe(MongoCollection collection,String name1,int num1,String name2,String num2){ //1����Ŀ,����ֵ
        UpdateResult result = collection.updateMany(Filters.ne(name1,num1) , new Document("$set", new Document(name2,num2)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name2,num2)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNumNe(MongoCollection collection,String name1,String num1,String name2,int num2){ //1����Ŀ,����ֵ
        UpdateResult result = collection.updateMany(Filters.ne(name1,num1) , new Document("$set", new Document(name2,num2)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name2,num2)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNumNe(MongoCollection collection,String name1,String num1,String name2,String num2){ //1����Ŀ,����ֵ
        UpdateResult result = collection.updateMany(Filters.ne(name1,num1) , new Document("$set", new Document(name2,num2)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name2,num2)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	
//	//��2���ļ�������Ŀ��
//	public static void updateItemTwo(MongoClient client,String dbname,String colname,String name1,int num1,String name2,String name3,int num2,String name4){ //1����Ŀ,ֻ����Ŀ��
//    	MongoDatabase mongoDatabase = client.getDatabase(dbname);
//	    MongoCollection collection = mongoDatabase.getCollection(colname);
//        System.out.println("find_connection!");
//        
//        UpdateResult result = collection.updateMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name3,num2)), new Document("$set", new Document(name2,num1).append(name4,num2)));
//        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
//        FindIterable<Document> docs =collection.find(Filters.eq(name2,num1)); 
//        util.printAll(docs);//�鿴���¸��µ��ĵ�
//    }
    
	//��2����������ѯ���޸�һ����Ŀ�͸�ֵ
	//1.����������and
	public static void updateNumTwoAnd(MongoCollection collection,String name1,int num1,String name2,int num2,String name3,int num3){ //�޸�һ����Ŀֵ��ֵΪint��
        UpdateResult result = collection.updateMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNumTwoAnd(MongoCollection collection,String name1,int num1,String name2,int num2,String name3,String num3){ //�޸�һ����Ŀֵ��ֵΪString��      
        UpdateResult result = collection.updateMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNumTwoAnd(MongoCollection collection,String name1,String num1,String name2,int num2,String name3,int num3){ //�޸�һ����Ŀֵ��ֵΪint��
        UpdateResult result = collection.updateMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNumTwoAnd(MongoCollection collection,String name1,String num1,String name2,int num2,String name3,String num3){ //�޸�һ����Ŀֵ��ֵΪint��
        UpdateResult result = collection.updateMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNumTwoAnd(MongoCollection collection,String name1,int num1,String name2,String num2,String name3,int num3){ //�޸�һ����Ŀֵ��ֵΪint��
        UpdateResult result = collection.updateMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNumTwoAnd(MongoCollection collection,String name1,int num1,String name2,String num2,String name3,String num3){ //�޸�һ����Ŀֵ��ֵΪint��
        UpdateResult result = collection.updateMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNumTwoAnd(MongoCollection collection,String name1,String num1,String name2,String num2,String name3,int num3){ //�޸�һ����Ŀֵ��ֵΪint��
        UpdateResult result = collection.updateMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNumTwoAnd(MongoCollection collection,String name1,String num1,String name2,String num2,String name3,String num3){ //�޸�һ����Ŀֵ��ֵΪint��
        UpdateResult result = collection.updateMany(Filters.and(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	//2.����������or
	public static void updateNumTwoOr(MongoCollection collection,String name1,int num1,String name2,int num2,String name3,int num3){ //�޸�һ����Ŀֵ��ֵΪString��
        UpdateResult result = collection.updateMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNumTwoOr(MongoCollection collection,String name1,int num1,String name2,int num2,String name3,String num3){ //�޸�һ����Ŀֵ��ֵΪString��
        UpdateResult result = collection.updateMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNumTwoOr(MongoCollection collection,String name1,int num1,String name2,String num2,String name3,int num3){ //�޸�һ����Ŀֵ��ֵΪString��
        UpdateResult result = collection.updateMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNumTwoOr(MongoCollection collection,String name1,int num1,String name2,String num2,String name3,String num3){ //�޸�һ����Ŀֵ��ֵΪString��
        UpdateResult result = collection.updateMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNumTwoOr(MongoCollection collection,String name1,String num1,String name2,int num2,String name3,int num3){ //�޸�һ����Ŀֵ��ֵΪString��
        UpdateResult result = collection.updateMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNumTwoOr(MongoCollection collection,String name1,String num1,String name2,int num2,String name3,String num3){ //�޸�һ����Ŀֵ��ֵΪString��
        UpdateResult result = collection.updateMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNumTwoOr(MongoCollection collection,String name1,String num1,String name2,String num2,String name3,int num3){ //�޸�һ����Ŀֵ��ֵΪString��
        UpdateResult result = collection.updateMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateNumTwoOr(MongoCollection collection,String name1,String num1,String name2,String num2,String name3,String num3){ //�޸�һ����Ŀֵ��ֵΪString��
        UpdateResult result = collection.updateMany(Filters.or(Filters.eq(name1,num1),Filters.eq(name2,num2)), new Document("$set", new Document(name3,num3)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(Filters.eq(name3,num3)); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	
	//$inc
	public static void updateInc(MongoCollection collection,String name1,int num1,String name2,int num2){ //1����Ŀ,����ֵ,��һ�飨name1��num1������ѯ
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$inc", new Document(name2,num2)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updateInc(MongoCollection collection,String name1,String num1,String name2,int num2){ //1����Ŀ,����ֵ,��һ�飨name1��num1������ѯ
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$inc", new Document(name2,num2)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	
	//$Push
	public static void updatePush(MongoCollection collection,String name1,int num1,String name2,int num2){ //1����Ŀ,����ֵ,��һ�飨name1��num1������ѯ
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$push", new Document(name2,num2)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updatePush(MongoCollection collection,String name1,String num1,String name2,int num2){ //1����Ŀ,����ֵ,��һ�飨name1��num1������ѯ
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$push", new Document(name2,num2)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updatePush(MongoCollection collection,String name1,int num1,String name2,String num2){ //1����Ŀ,����ֵ,��һ�飨name1��num1������ѯ
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$push", new Document(name2,num2)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	public static void updatePush(MongoCollection collection,String name1,String num1,String name2,String num2){ //1����Ŀ,����ֵ,��һ�飨name1��num1������ѯ
        UpdateResult result = collection.updateMany(Filters.eq(name1,num1) , new Document("$push", new Document(name2,num2)));
        System.out.println("������"+result.getModifiedCount()+"�����ݣ�");
        FindIterable<Document> docs =collection.find(); 
        util.printAll(docs);//�鿴���¸��µ��ĵ�
    }
	
	
}
