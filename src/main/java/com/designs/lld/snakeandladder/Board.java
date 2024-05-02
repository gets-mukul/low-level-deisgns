package com.designs.lld.snakeandladder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Queue;

@Getter
@Setter
@AllArgsConstructor

public class Board {
    private int size;
    private Dice dice;
    private List<Snake> snakes;
    private List<Ladder> ladders;
    private Queue<Player> players;
}
