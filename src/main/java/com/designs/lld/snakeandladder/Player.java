package com.designs.lld.snakeandladder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Player {

    private String name;
    private int currentPosition = 0;
}
