package com.shariqparwez.factory;

import java.util.Calendar;

public class FactoryEverydayDemo {
    public static void main(String[] args) {
        // ## 1 - Factory usage: Calendar
        factoryEverydayDemo();
    }

    private static void factoryEverydayDemo() {
        // Get instance of calendar
        Calendar calendar = Calendar.getInstance();

        // Print out instance details
        System.out.println(calendar);

        // Print out day of the month
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
