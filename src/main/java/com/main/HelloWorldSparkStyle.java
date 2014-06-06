package com.main;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

/**
 * Created by IntelliJ IDEA.
 * User: sushil
 * Date: 6/6/14
 * Time: 12:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldSparkStyle {
    public static void main(String[] args) {
        Spark.get("/", new Route() {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World From Spark";
            }
        });
    }
}
