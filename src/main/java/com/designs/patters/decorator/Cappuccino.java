package com.designs.patters.decorator;

public class Cappuccino extends Beverage {

    public Cappuccino() {
        beverageName = "Cappuccino coffee";
    }

    @Override
    int getBeveragePrice() {
        return 12;
    }
}
