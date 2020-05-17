package com.shariqparwez.builder;

public class BuilderLunchOrderDemo {
    public static void main(String args[]) {
        // ## 1 - Demonstration of usage of builder pattern
        builderLunchOrderDemoOperationOne();
    }

    private static void builderLunchOrderDemoOperationOne() {
        // Get builder reference to build lunch order
        LunchOrder.Builder builder = new LunchOrder.Builder();

        // Build lunch order as per required fields
        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

        // Once completed, get the lunch order object by calling build method
        LunchOrder lunchOrder = builder.build();

        // Print each lunch order items
        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
