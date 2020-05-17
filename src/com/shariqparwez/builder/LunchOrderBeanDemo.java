package com.shariqparwez.builder;

public class LunchOrderBeanDemo {
    public static void main(String args[]) {
        // ## 1 - Demonstration of usage of simple bean class
        //lunchOrderBeanDemoOperationOne();

        // ## 2 - Demonstration of usage of simple bean class without setting any fields
        lunchOrderBeanDemoOperationTwo();
    }

    private static void lunchOrderBeanDemoOperationOne() {
        // Initialize lunchOrderBean object
        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        // Set values
        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiments("Lettuce");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Ham");

        // Print values
        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());
    }

    private static void lunchOrderBeanDemoOperationTwo() {
        // Initialize lunchOrderBean object
        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        // Print values
        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());
    }
}
