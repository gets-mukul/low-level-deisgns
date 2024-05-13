package com.designs.patters.decorator;

public class Milk extends IngredientDecorator {

    Beverage beverage;

    Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    int getBeveragePrice() {
        return beverage.getBeveragePrice() + 2;
    }

    @Override
    String getBeverageName() {
        return beverage.getBeverageName() + " with Milk";
    }
}
