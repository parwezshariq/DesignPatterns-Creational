package com.shariqparwez.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {
    public static void main(String args[]) {
        // ## 1 - Demonstrate singleton design pattern
        //singletonDesignPatternOperationOne();

        // ## 2 - Demonstrate singleton design pattern for derby setup [## 4]
        //singletonDesignPatternOperationTwo();

        // ## 3 - Demonstrate singleton design pattern for derby, measure metrix for time between multiple connections [## 4]
        singletonDesignPatternOperationThree();
    }

    private static void singletonDesignPatternOperationOne() {
        // Get instance of dbSingleton and print instance details
        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);

        // Get instance of dbSingleton and print instance details
        DbSingleton anotherInstance = DbSingleton.getInstance();
        System.out.println(anotherInstance);
    }

    private static void singletonDesignPatternOperationTwo() {
        // Get instance of dbSingleton and print instance details
        DbSingleton instance = DbSingleton.getInstance();

        // Get connection
        Connection connection = instance.getConnection();

        // Statement to be executed
        Statement statement;
        try {
            // Build statement
            statement = connection.createStatement();

            // Populate sql query to create table in derby memory database
            statement.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");

            // If table creation successful, print indicator
            System.out.println("Table created.");

            // Close statement
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void singletonDesignPatternOperationThree() {
        // Get instance of dbSingleton and print instance details
        DbSingleton instance = DbSingleton.getInstance();

        // Print instance details
        System.out.println(instance);

        // Variables to hold timeBefore and timeAfter for comparison
        long timeBefore = 0;
        long timeAfter = 0;

        // Record timeBefore before getting connection
        timeBefore = System.currentTimeMillis();

        // Get connection
        Connection connection = instance.getConnection();

        // Record timeAfter after just getting connection
        timeAfter = System.currentTimeMillis();

        // Print the time taken to fetch connection
        System.out.println("Time taken to establish connection with derby database: " + (timeAfter - timeBefore));

        // Statement to be executed
        Statement statement;
        try {
            // Build statement
            statement = connection.createStatement();

            // Populate sql query to create table in derby memory database
            statement.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");

            // If table creation successful, print indicator
            System.out.println("Table created.");

            // Close statement
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Record timeBefore before getting connection again
        timeBefore = System.currentTimeMillis();

        // Get connection again
        instance.getConnection();

        // Record timeAfter after getting connection for second time
        timeAfter = System.currentTimeMillis();

        // Print the time taken to fetch connection
        System.out.println("Time taken to establish connection for second time with derby database: " + (timeAfter - timeBefore));
    }
}
