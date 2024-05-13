package com.designs.lld.coffeeshop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Beverage {
    private String beverageName;
    private int beveragePrice;

    abstract int getBeveragePrice();
}
