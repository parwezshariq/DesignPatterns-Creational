package com.shariqparwez.singleton;

public class SingletonEverydayDemo {
    public static void main(String args[]) {

        // ## 1 - Singleton Usage: Runtime
        singletonEverydayDemo();

    }

    private static void singletonEverydayDemo() {
        // Get instance of runtime, and print about instance details
        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();
        System.out.println(singletonRuntime);

        // Get instance of runtime, and print about instance details
        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println(anotherInstance);

        // Compare if both runtime instances are same, thus signifying that they are indeed singleton
        if (singletonRuntime == anotherInstance) {
            System.out.println("They are the same instance");
        }
    }
}
