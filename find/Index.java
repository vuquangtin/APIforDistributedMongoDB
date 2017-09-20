package find;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Index {
	public static void createIndex(MongoCollection collection,String name,int num) {
		 collection.createIndex(new Document(name, num));
	}
	
	public static void createIndexCom(MongoCollection collection,String name1,int num1,String name2,int num2) {
		 System.out.println("�����������!");
		 //�����������(ͬ����ѭ����ǰ׺ԭ��)
		 collection.createIndex(new Document(name1, num1).append(name2, num2));
	}
	public static void createIndexCom(MongoCollection collection,String name1,String num1,String name2,int num2) {
		 System.out.println("�����������!");
		 //�����������(ͬ����ѭ����ǰ׺ԭ��)
		 collection.createIndex(new Document(name1, num1).append(name2, num2));
	}
	public static void createIndexCom(MongoCollection collection,String name1,int num1,String name2,String num2) {
		 System.out.println("�����������!");
		 //�����������(ͬ����ѭ����ǰ׺ԭ��)
		 collection.createIndex(new Document(name1, num1).append(name2, num2));
	}
	public static void createIndexCom(MongoCollection collection,String name1,String num1,String name2,String num2) {
		 System.out.println("�����������!");
		 //�����������(ͬ����ѭ����ǰ׺ԭ��)
		 collection.createIndex(new Document(name1, num1).append(name2, num2));
	}
	
	
	public static void createIndexHashed(MongoCollection collection,String name) {
		 System.out.println("������ϣ����!");
	     //������ϣ����
		 collection.createIndex(new Document(name, "hashed"));
	}
	public static void createIndexText(MongoCollection collection,String name) { //�����ı�����
		 System.out.println("�����ı�����!");	    
		 collection.createIndex(new Document(name, "text"));
	}
	public static void dropIndex(MongoCollection collection,String name) { //ɾ����������
		 System.out.println("ɾ������!");
		 collection.dropIndex(name);
	}
	public static void dropIndexes(MongoCollection collection) { //ɾ��ȫ������
		 System.out.println("ɾ������!");
		 collection.dropIndexes();
	}
}
