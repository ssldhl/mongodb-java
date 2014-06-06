package com.main;

import com.mongodb.*;

import java.net.UnknownHostException;

/**
 * Created by IntelliJ IDEA.
 * User: sushil
 * Date: 6/5/14
 * Time: 11:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldMongoDBStyle {
    public static void main(String[] args) throws UnknownHostException {
        MongoClient client = new MongoClient(new ServerAddress("localhost", 27017));

        DB database = client.getDB("course");
        DBCollection collection = database.getCollection("hello");

        DBObject document = collection.findOne();
        System.out.println("document = " + document);
    }
}
