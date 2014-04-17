package com.serious;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import org.junit.Test;

import java.net.UnknownHostException;

/**
 * Created by luke on 4/16/14.
 */
public class SimpleTest {
    @Test
    public  void simpleMongoQuery() throws UnknownHostException {
        MongoClient mongoClient = new MongoClient( );
        DB database = mongoClient.getDB("test");
        DBCollection collection = database.getCollection("things");
        DBObject object = collection.findOne();
        System.out.println(object);
    }
}
