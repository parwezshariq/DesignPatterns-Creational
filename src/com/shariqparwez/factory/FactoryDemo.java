package com.shariqparwez.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        // ## 1 - Factory demo
        factoryDemoOne();
    }

    private static void factoryDemoOne() {
        // Get website for blog
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        // Print pages list
        System.out.println(site.getPages());

        // Get website for shop
        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        // Print pages list
        System.out.println(site.getPages());
    }
}
