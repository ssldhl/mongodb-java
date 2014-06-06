package com.main;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: sushil
 * Date: 6/6/14
 * Time: 8:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldFreemarkerStyle {
    public static void main(String[] args) throws TemplateException {
        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(HelloWorldFreemarkerStyle.class, "/");

        try {
            Template helloTemplate = configuration.getTemplate("hello.ftl");
            StringWriter writer = new StringWriter();
            Map<String, Object> helloMap = new HashMap<String, Object>();
            helloMap.put("name", "Freemarker");

            helloTemplate.process(helloMap, writer);

            System.out.println("writer = " + writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
