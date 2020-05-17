package com.shariqparwez.builder;

public class LunchOrderTeleDemo {
    public static void main(String args[]) {
        // ## 1 - Demonstration of usage of simple bean class
        lunchOrderTeleDemoOperationOne();
    }

    private static void lunchOrderTeleDemoOperationOne() {
        // Initialize lunchOrderBean object
        LunchOrderTele lunchOrderTele = new LunchOrderTele("Wheat", "Lettuce", "Mustard", "Ham");

        // Print values
        System.out.println(lunchOrderTele.getBread());
        System.out.println(lunchOrderTele.getCondiments());
        System.out.println(lunchOrderTele.getDressing());
        System.out.println(lunchOrderTele.getMeat());
    }
}
