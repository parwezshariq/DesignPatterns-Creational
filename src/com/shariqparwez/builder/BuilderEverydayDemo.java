package com.shariqparwez.builder;

public class BuilderEverydayDemo {
    public static void main(String args[]) {
        // ## 1 - Builder Usage: StringBuilder
        builderEverydayDemo();
    }

    private static void builderEverydayDemo() {
        // Initialize stringBuilder
        StringBuilder builder = new StringBuilder();

        // Append strings into builder
        builder.append("This is an example ");
        builder.append("of the builder pattern. ");
        builder.append("It has methods to append ");
        builder.append("almost anything we want to a String. ");
        builder.append(42);

        // Print string built
        System.out.println(builder.toString());
    }
}
