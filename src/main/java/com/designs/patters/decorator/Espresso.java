package com.designs.patters.decorator;

public class Espresso extends Beverage {

    public Espresso() {
        beverageName = "Espresso Coffee";
    }

    @Override
    int getBeveragePrice() {
        return 10;
    }
}
