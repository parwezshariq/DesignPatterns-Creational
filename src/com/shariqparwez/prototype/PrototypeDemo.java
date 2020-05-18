package com.shariqparwez.prototype;

public class PrototypeDemo {
    public static void main(String args[]) {
        // ## 1 - Prototype demo
        prototypeDemo();
    }

    private static void prototypeDemo() {
        // Initialize Registry
        Registry registry = new Registry();

        // Create a new movie item, through registry
        Movie movie = (Movie) registry.createItem("Movie");

        // Update movie title
        movie.setTitle("Creational Patterns in Java");

        // Print out movie details
        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        // Create another movie item, through registry
        Movie anotherMovie = (Movie) registry.createItem("Movie");

        // Update movie title
        anotherMovie.setTitle("Gang of Four");

        // Print out movie details
        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());
    }
}
