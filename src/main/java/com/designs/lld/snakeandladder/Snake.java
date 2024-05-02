package com.designs.lld.snakeandladder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Snake extends GameComponents {
    public Snake(final int startPosition, final int endPosition) {
        super(startPosition, endPosition);
    }

}
