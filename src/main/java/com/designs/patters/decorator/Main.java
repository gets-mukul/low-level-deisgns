package com.designs.patters.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println("Beverage name: " + beverage.getBeverageName());
        System.out.println("Beverage Price: " + beverage.getBeveragePrice());

        beverage = new Milk(beverage);
        System.out.println("Beverage name: " + beverage.getBeverageName());
        System.out.println("Beverage Price: " + beverage.getBeveragePrice());

        beverage = new Caramel(beverage);
        beverage = new Caramel(beverage);
        System.out.println("Beverage name: " + beverage.getBeverageName());
        System.out.println("Beverage Price: " + beverage.getBeveragePrice());
    }
}
