package find;

import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.regex;
import static com.mongodb.client.model.Filters.text;

import org.bson.Document;
import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
/**
 * ģ����ѯ��ֻ��ƥ���ַ���
 *
 */
public class Pattern {
	public static void patternOne(MongoCollection collection,String name,String num){ //1������
        System.out.println("Pattern!");
        FindIterable<Document> docs = collection.find(regex(name,num)); 
        util.printAll(docs);
    }
	public static void patternOneI(MongoCollection collection,String name,String num){ //1������,i���Դ�Сд
        System.out.println("Pattern!");
        FindIterable<Document> docs = collection.find(regex(name,num,"i")); 
        util.printAll(docs);
    }
	public static void patternOneM(MongoCollection collection,String name,String num){ //1������,M:����ƥ��value���л��з�(\n)�����Ρ� 
        System.out.println("PatternOneM!");
        FindIterable<Document> docs = collection.find(regex(name,num,"m")); 
        util.printAll(docs);
    }
	public static void patternOneX(MongoCollection collection,String name,String num){ //1������,X:���ӿհ��ַ�
        System.out.println("Pattern!");
        FindIterable<Document> docs = collection.find(regex(name,num,"x")); 
        util.printAll(docs);
    }
	public static void patternOneS(MongoCollection collection,String name,String num){ //1������,S:������ַ���.��ƥ�����е��ַ����������з���
        System.out.println("Pattern!");
        FindIterable<Document> docs = collection.find(regex(name,num,"s")); 
        util.printAll(docs);
    }
	
	
	/**
	 *2��%name%ģ����ѯ����������������and;
	 *����Ӹ���option��i,m,x,s
	 */
	public static void patternTwoAnd(MongoCollection collection,String name1,String num1,String name2,String num2){ //1������
        System.out.println("patternTwoAnd!");
        FindIterable<Document> docs = collection.find(Filters.and(regex(name1, num1), regex(name2, num2))); 
        util.printAll(docs); 
    }
	public static void patternTwoAndI(MongoCollection collection,String name1,String num1,String name2,String num2){ //1������+i
        System.out.println("patternTwoAnd!");
        FindIterable<Document> docs = collection.find(Filters.and(regex(name1, num1,"i"), regex(name2, num2,"i"))); 
        util.printAll(docs); 
    }
	public static void patternTwoAndM(MongoCollection collection,String name1,String num1,String name2,String num2){ //1������+m
        System.out.println("patternTwoAnd!");

        FindIterable<Document> docs = collection.find(Filters.and(regex(name1, num1,"m"), regex(name2, num2,"m"))); 
        util.printAll(docs); 
    }
	public static void patternTwoAndX(MongoCollection collection,String name1,String num1,String name2,String num2){ //1������+x
        System.out.println("patternTwoAnd!");

        FindIterable<Document> docs = collection.find(Filters.and(regex(name1, num1,"x"), regex(name2, num2,"x"))); 
        util.printAll(docs); 
    }
	public static void patternTwoAndS(MongoCollection collection,String name1,String num1,String name2,String num2){ //1������+s
        System.out.println("patternTwoAnd!");

        FindIterable<Document> docs = collection.find(Filters.and(regex(name1, num1,"s"), regex(name2, num2,"s"))); 
        util.printAll(docs); 
    }
	
	
	/**
	 *2��%name%ģ����ѯ����������������or��
	 */
	public static void patternTwoOr(MongoCollection collection,String name1,String num1,String name2,String num2){ //1������
        System.out.println("PatternTwoOr!");

        FindIterable<Document> docs = collection.find(Filters.or(regex(name1, num1), regex(name2, num2))); 
        util.printAll(docs);
    }
	public static void patternTwoOrI(MongoCollection collection,String name1,String num1,String name2,String num2){ //1������
        System.out.println("PatternTwoOr!");

        FindIterable<Document> docs = collection.find(Filters.or(regex(name1, num1,"i"), regex(name2, num2,"i"))); 
        util.printAll(docs);
    }
	public static void patternTwoOrM(MongoCollection collection,String name1,String num1,String name2,String num2){ //1������
        System.out.println("PatternTwoOr!");
        FindIterable<Document> docs = collection.find(Filters.or(regex(name1, num1,"m"), regex(name2, num2,"m"))); 
        util.printAll(docs);
    }
	public static void patternTwoOrX(MongoCollection collection,String name1,String num1,String name2,String num2){ //1������
        System.out.println("PatternTwoOr!");
        FindIterable<Document> docs = collection.find(Filters.or(regex(name1, num1,"x"), regex(name2, num2,"x"))); 
        util.printAll(docs);
    }
	public static void patternTwoOrS(MongoCollection collection,String name1,String num1,String name2,String num2){ //1������
        System.out.println("PatternTwoOr!");

        FindIterable<Document> docs = collection.find(Filters.or(regex(name1, num1,"s"), regex(name2, num2,"s"))); 
        util.printAll(docs);
    }
	

}
