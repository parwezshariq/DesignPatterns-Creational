package com.shariqparwez.singleton;

import org.apache.derby.jdbc.EmbeddedDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    // ## 1 - Code block to create a simple singleton class (Eagerly Loaded)
    /*private static DbSingleton instance = new DbSingleton();

    private DbSingleton() { }

    public static DbSingleton getInstance() {
        return instance;
    }*/

    // ## 2 - Code block to create singleton class (Lazily Loaded)
    /*private static DbSingleton instance = null;

    private DbSingleton() { }

    public static DbSingleton getInstance() {
        if (instance == null) {
            instance = new DbSingleton();
        }
        return instance;
    }*/

    // ## 3 - Code block to create singleton class (Lazily Loaded), thread-safe
    /*private static volatile DbSingleton instance = null;

    private DbSingleton() {
        // To avoid creating new instance using reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create.");
        }
    }

    public static DbSingleton getInstance() {
        // Double check with synchronized, to avoid multiple threads getting different instance
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }*/

    // ## 4 - Code block to create singleton class (Lazily Loaded), thread-safe [Actual Derby Implementation]
    private static volatile DbSingleton instance = null;
    private static volatile Connection connection = null;

    private DbSingleton() {
        try {
            DriverManager.registerDriver(new EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (connection != null) {
            throw new RuntimeException("Use getConnection() method to create.");
        }

        // To avoid creating new instance using reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create.");
        }
    }

    public static DbSingleton getInstance() {
        // Double check with synchronized, to avoid multiple threads getting different instance
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        if (connection == null) {
            synchronized (DbSingleton.class) {
                if (connection == null) {
                    try {
                        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
                        connection = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }
}
