package com.shariqparwez.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeEverydayDemo {
    public static void main(String args[]) {
        // ## 1 - Prototype Usage: SQL Statement [Shallow Copy]
        prototypeEverydayDemo();
    }

    private static void prototypeEverydayDemo() {
        // Create sql query
        String sql = "select * from movies where title = ?";

        // Create parameters list
        List<String> parameters = new ArrayList<>();
        parameters.add("Star wars");

        // Create new record object
        Record record = new Record();

        // Build statement by creating new statement using constructor
        Statement firstStatement = new Statement(sql, parameters, record);

        // Print all the statement fields
        System.out.println(firstStatement.getSql());
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord());

        // Create second statement by cloning first statement
        Statement secondStatement = firstStatement.clone();

        // Print all the statement fields
        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getParameters());
        System.out.println(secondStatement.getRecord());

    }
}
