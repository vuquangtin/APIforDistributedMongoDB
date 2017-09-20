package find;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.UpdateOptions;

public class main {
	public static void main(String[] args) {
	    ServerAddress serverAddress = new ServerAddress("192.168.1.143", 27000);
	    List<ServerAddress> addressList = new ArrayList<ServerAddress>();
        addressList.add(serverAddress);
        MongoClient client = new MongoClient(addressList);
        MongoDatabase mongoDatabase = client.getDatabase("testdb");
		MongoCollection collection = mongoDatabase.getCollection("yourdb");
        
        Add pre=null;
//  	pre.addOne(client,"testdb", "yourdb", "num", 8);
        pre.addTest(collection);
		
		Find search=null ;
		search.find(collection);
//		search.find(collection, "num", 8);
//		search.findGt(collection, "num", 10);
//		search.findLt(collection, "num", 2);
//		search.findCover(collection, "id", 1,2);
//		search.findAndCover(collection, "id", 1,2,"num",1,1);
//		search.findCover(collection, "num",8,10);
//		search.findOrCover(collection, "id", 1,2,"num",8,10);
//		search.findEqAnd(collection,"id",1,"num",2);
//		search.findOrOne(collection, "id", 1,5);
//		search.findOrTwo(collection,"id",1,"num",2);	
//		search.findEqSkip(collection, "id", 2,1);
//		search.findEqOrSkip(collection, "id", 2,0);
//		search.findEqOrSkip(collection, "id", 2,"num",1,0);
//		search.findEqOrSkip(collection, "id", 2,"num",1,"by","A",0);
//		search.findEqAndSkip(collection, "id", 2,"num",2,0);
//		search.findEqAndSkip(collection, "id", 2,"num",2,"by","A",0);		
//		search.findEqNe(collection, "id",1);
//		search.findIn(collection, "id",1,2);
//		search.findExist(collection, "id");
//		search.findExist(collection", "pum");
//		search.findSize(collection, "id",3);//结构不对！！
//		search.findAll(collection, "array",1,2,3,4);

		
		Delete delete=null;
//		delete.deleteOne(collection, "id",8);
//		delete.delete(collection, "id", 8);
//		delete.deleteGt(collection, "id", 8);
//		delete.deleteGte(collection, "id", 8);
//		delete.deleteLt(collection, "id", 8);
//		delete.deleteLte(collection, "id", 8);
//		delete.deleteAnd(collection, "id",8,"num", 8);
//		delete.deleteOr(collection,8,"num", 8);
//		delete.deleteCoverB(collection, "id",7, 8);
//		delete.deleteCover(collection, "id",6, 8);
//		System.out.println("Done!");
		
		Sort sort=null;
//		sort.sortAc(collection, "id");
//		sort.sortAc(collection, "id","num");
//		sort.sortDe(collection, "id");
//		sort.sortDe(collection, "id","num");
//		sort.sortAcDe(collection, "id","num");
		
		
		Pattern pat=null;
//		pat.patternOne(collection, "description", "8");
//		pat.patternOneI(collection, "description","Base");
//		pat.patternOneM(collection, "description","base");
//		pat.patternOneX(collection, "description","base");
//		pat.patternOneS(collection, "description","base");
//		pat.patternTwoAnd(collection, "description", "8","by","B");
//		pat.patternTwoOr(collection, "description", "8","by","B");
		
		Update update=null;
//		update.updateItem(collection, "id", 8,"num");
//		update.updateItem(collection, "description", "base 8","num");
//		update.updateNum(collection,"id",9,10);
//		update.updateNum(collection,"id",9,"100");
//		update.updateItemTwo(collection, "id", 8,"idnew","num",8,"numnew");
//		update.updateNumTwoAnd(collection,"id",9,"num",18,"description",19);
//		update.updateNumTwoAnd(collection,"id",9,"num",18,"description","mongodb");
//		update.updateNumTwoOr(collection,"id",9,"num",18,"description","mongodb");
//		update.updateInc(collection, "id", 9, "num", 9);
//		update.updatePush(collection, "id", 9, "new", 9);
		
		Upsert upsert=null;
		Upsert.updateNum(collection,"id",18,10,true);
	}
}
