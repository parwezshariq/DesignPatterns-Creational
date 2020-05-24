package com.shariqparwez.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // ## 1 - Abstract factory demo
        abstractFactoryDemo();
    }

    private static void abstractFactoryDemo() {
        // Get Abstract factory instance based on credit score
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);

        // Use abstract factory to get credit type
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);

        // Print out class details
        System.out.println(card.getClass());

        // Get Abstract factory instance based on credit score
        abstractFactory = CreditCardFactory.getCreditCardFactory(600);

        // Use abstract factory to get credit type
        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);

        // Print out class details
        System.out.println(card2.getClass());
    }
}
