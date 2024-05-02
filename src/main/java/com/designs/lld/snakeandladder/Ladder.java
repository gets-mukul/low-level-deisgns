package com.designs.lld.snakeandladder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ladder extends GameComponents {

    public Ladder(final int startPosition, final int endPosition) {
        super(startPosition, endPosition);
    }
}
