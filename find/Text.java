package find;

import static com.mongodb.client.model.Filters.text;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.TextSearchOptions;

public class Text {
	public static void Text(MongoCollection collection,String num){ //ÎÄ±¾ËÑË÷
        FindIterable<Document> docs = collection.find(text(num)); 
        util.printAll(docs);
    }
}
