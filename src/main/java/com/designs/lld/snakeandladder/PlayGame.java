package com.designs.lld.snakeandladder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PlayGame {

    public void startGame() {
        Board board = initBoard();

        while (board.getPlayers().size() != 1) {
            Player currentPlayer = board.getPlayers().poll();
            System.out.println(currentPlayer.getName() + "'s current position is: " + currentPlayer.getCurrentPosition());

            int diceRollValue = board.getDice().getRandomValue(board.getDice().getNumberOfDices());
            System.out.println("Rolling the dice...");
            System.out.println("Dice value is " + diceRollValue);

            int playerNewPosition = currentPlayer.getCurrentPosition() + diceRollValue;

            // checking for out of board position
            if (playerNewPosition > board.getSize()) {
                System.out.println("!!! NEW POSITION IS OUT OF THE BOARD !!!");
            } else {
                // checking for snakes position
                boolean isSnakeAtNewPosition = false;
                for (Snake snake : board.getSnakes()) {
                    if (snake.getStartPosition() == playerNewPosition) {
                        System.out.println("!!! OH NO YOU GOT BITTEN BY SNAKE !!!");
                        isSnakeAtNewPosition = true;
                        currentPlayer.setCurrentPosition(snake.getEndPosition());
                    }
                }

                //checking for ladder position
                boolean isLadderAtNewPosition = false;
                for (Ladder ladder : board.getLadders()) {
                    if (ladder.getStartPosition() == playerNewPosition) {
                        System.out.println("!!! HURRAY YOU GOT A LADDER IN NEW POSITION !!!");
                        isLadderAtNewPosition = true;
                        currentPlayer.setCurrentPosition(ladder.getEndPosition());
                    }
                }

                // when no ladder and no snake is present in new location
                if (!isSnakeAtNewPosition && !isLadderAtNewPosition) {
                    currentPlayer.setCurrentPosition(playerNewPosition);
                }
            }


            //when player wins the match
            if (playerNewPosition == board.getSize()) {
                System.out.println("!!! HURRAY YOU WON THE MATCH !!!");
            } else {
                System.out.println(currentPlayer.getName() + "'s NEW POSITION IS: " + currentPlayer.getCurrentPosition());
                board.getPlayers().add(currentPlayer);
            }
            System.out.println("-----------------------------");
        }

    }

    public Board initBoard() {

        Queue<Player> players = initPlayers();

        Dice dice = new Dice(1);

        List<Snake> snakes = initSnakes();

        List<Ladder> ladders = initLadders();

        return new Board(100, dice, snakes, ladders, players);

    }

    public Queue<Player> initPlayers() {
        Queue<Player> players = new LinkedList<>();
        players.add(new Player("A", 0));
        players.add(new Player("B", 0));
        return players;
    }

    public List<Snake> initSnakes() {
        List<Snake> snakes = new ArrayList<>();
        snakes.add(new Snake(97, 78));
        snakes.add(new Snake(95, 56));
        snakes.add(new Snake(62, 18));
        snakes.add(new Snake(48, 26));
        snakes.add(new Snake(32, 10));
        snakes.add(new Snake(36, 6));
        return snakes;
    }

    public List<Ladder> initLadders() {
        List<Ladder> ladders = new ArrayList<>();
        ladders.add(new Ladder(1, 38));
        ladders.add(new Ladder(4, 14));
        ladders.add(new Ladder(8, 10));
        ladders.add(new Ladder(21, 42));
        ladders.add(new Ladder(28, 76));
        ladders.add(new Ladder(50, 67));
        ladders.add(new Ladder(71, 92));
        return ladders;
    }
}
