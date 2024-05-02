package com.designs.lld.snakeandladder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Dice {

    private int numberOfDices;

    public int getRandomValue(final int numberOfDices) {
        return ((int) (Math.random() * (6 * numberOfDices - numberOfDices))) + 1;
    }
}
