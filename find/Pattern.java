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
 * 模糊查询、只能匹配字符串
 *
 */
public class Pattern {
	public static void patternOne(MongoCollection collection,String name,String num){ //1个条件
        System.out.println("Pattern!");
        FindIterable<Document> docs = collection.find(regex(name,num)); 
        util.printAll(docs);
    }
	public static void patternOneI(MongoCollection collection,String name,String num){ //1个条件,i忽略大小写
        System.out.println("Pattern!");
        FindIterable<Document> docs = collection.find(regex(name,num,"i")); 
        util.printAll(docs);
    }
	public static void patternOneM(MongoCollection collection,String name,String num){ //1个条件,M:用来匹配value中有换行符(\n)的情形。 
        System.out.println("PatternOneM!");
        FindIterable<Document> docs = collection.find(regex(name,num,"m")); 
        util.printAll(docs);
    }
	public static void patternOneX(MongoCollection collection,String name,String num){ //1个条件,X:忽视空白字符
        System.out.println("Pattern!");
        FindIterable<Document> docs = collection.find(regex(name,num,"x")); 
        util.printAll(docs);
    }
	public static void patternOneS(MongoCollection collection,String name,String num){ //1个条件,S:允许点字符（.）匹配所有的字符，包括换行符。
        System.out.println("Pattern!");
        FindIterable<Document> docs = collection.find(regex(name,num,"s")); 
        util.printAll(docs);
    }
	
	
	/**
	 *2个%name%模糊查询条件，两个条件做and;
	 *后面加各种option：i,m,x,s
	 */
	public static void patternTwoAnd(MongoCollection collection,String name1,String num1,String name2,String num2){ //1个条件
        System.out.println("patternTwoAnd!");
        FindIterable<Document> docs = collection.find(Filters.and(regex(name1, num1), regex(name2, num2))); 
        util.printAll(docs); 
    }
	public static void patternTwoAndI(MongoCollection collection,String name1,String num1,String name2,String num2){ //1个条件+i
        System.out.println("patternTwoAnd!");
        FindIterable<Document> docs = collection.find(Filters.and(regex(name1, num1,"i"), regex(name2, num2,"i"))); 
        util.printAll(docs); 
    }
	public static void patternTwoAndM(MongoCollection collection,String name1,String num1,String name2,String num2){ //1个条件+m
        System.out.println("patternTwoAnd!");

        FindIterable<Document> docs = collection.find(Filters.and(regex(name1, num1,"m"), regex(name2, num2,"m"))); 
        util.printAll(docs); 
    }
	public static void patternTwoAndX(MongoCollection collection,String name1,String num1,String name2,String num2){ //1个条件+x
        System.out.println("patternTwoAnd!");

        FindIterable<Document> docs = collection.find(Filters.and(regex(name1, num1,"x"), regex(name2, num2,"x"))); 
        util.printAll(docs); 
    }
	public static void patternTwoAndS(MongoCollection collection,String name1,String num1,String name2,String num2){ //1个条件+s
        System.out.println("patternTwoAnd!");

        FindIterable<Document> docs = collection.find(Filters.and(regex(name1, num1,"s"), regex(name2, num2,"s"))); 
        util.printAll(docs); 
    }
	
	
	/**
	 *2个%name%模糊查询条件，两个条件做or；
	 */
	public static void patternTwoOr(MongoCollection collection,String name1,String num1,String name2,String num2){ //1个条件
        System.out.println("PatternTwoOr!");

        FindIterable<Document> docs = collection.find(Filters.or(regex(name1, num1), regex(name2, num2))); 
        util.printAll(docs);
    }
	public static void patternTwoOrI(MongoCollection collection,String name1,String num1,String name2,String num2){ //1个条件
        System.out.println("PatternTwoOr!");

        FindIterable<Document> docs = collection.find(Filters.or(regex(name1, num1,"i"), regex(name2, num2,"i"))); 
        util.printAll(docs);
    }
	public static void patternTwoOrM(MongoCollection collection,String name1,String num1,String name2,String num2){ //1个条件
        System.out.println("PatternTwoOr!");
        FindIterable<Document> docs = collection.find(Filters.or(regex(name1, num1,"m"), regex(name2, num2,"m"))); 
        util.printAll(docs);
    }
	public static void patternTwoOrX(MongoCollection collection,String name1,String num1,String name2,String num2){ //1个条件
        System.out.println("PatternTwoOr!");
        FindIterable<Document> docs = collection.find(Filters.or(regex(name1, num1,"x"), regex(name2, num2,"x"))); 
        util.printAll(docs);
    }
	public static void patternTwoOrS(MongoCollection collection,String name1,String num1,String name2,String num2){ //1个条件
        System.out.println("PatternTwoOr!");

        FindIterable<Document> docs = collection.find(Filters.or(regex(name1, num1,"s"), regex(name2, num2,"s"))); 
        util.printAll(docs);
    }
	

}
