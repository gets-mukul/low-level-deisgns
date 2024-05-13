package com.designs.patters.decorator;

public class Caramel extends IngredientDecorator {
    Beverage beverage;

    Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    int getBeveragePrice() {
        return beverage.getBeveragePrice() + 5;
    }

    @Override
    String getBeverageName() {
        return beverage.getBeverageName() + " with Caramel";
    }
}
