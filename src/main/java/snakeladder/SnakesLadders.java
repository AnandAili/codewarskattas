package snakeladder;

import com.sun.java.swing.action.AboutAction;
import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SnakesLadders {
    Board board = new Board();
    public SnakesLadders() {}

    private void play() {

    }

    public String play(int die1, int die2) {
        String message = null;
        Player player = null;
        if(board.isGameOver() == null) {
            player = board.move(die1, die2);
            message = player.name + " is on square " + player.position;
        } else {
            Player wonPlayer = board.isGameOver();
        }
        return message;
    }
}

class Board {
    List<Integer> spots ;
    List<Snake> snakes = new ArrayList<>();
    List<Ladder> ladders = new ArrayList<>();
    Player player1 = new Player("Player 1");
    Player player2 = new Player("Player 2");
    Player lastPlayed = null;
    Board() {
        spots = new LinkedList<>();
        IntStream.iterate(1, i-> i+1).limit(100).forEach( number -> spots.add(number));
        snakes.add(new Snake(16,6));
        snakes.add(new Snake(46,25));
        snakes.add(new Snake(49,11));
        snakes.add(new Snake(62,19));
        snakes.add(new Snake(64,60));
        snakes.add(new Snake(74,53));
        snakes.add(new Snake(89,68));
        snakes.add(new Snake(92,88));
        snakes.add(new Snake(95,75));
        snakes.add(new Snake(99,80));


        ladders.add(new Ladder(2, 38));
        ladders.add(new Ladder(7, 14));
        ladders.add(new Ladder(8, 31));
        ladders.add(new Ladder(15, 26));
        ladders.add(new Ladder(21, 42));
        ladders.add(new Ladder(28, 84));
        ladders.add(new Ladder(36, 44));
        ladders.add(new Ladder(51, 67));
        ladders.add(new Ladder(71, 91));
        ladders.add(new Ladder(78, 98));
        ladders.add(new Ladder(87, 94));
    }

    Player move(Integer... dies) {
        Player currentPlayer = this.nextPlayer();
        for (Integer die: dies) {
            if(isGameOver() != null) {
                break;
            }
            if (currentPlayer.position + die > 100) {
                Integer extra = (currentPlayer.position + die) - 100;
                currentPlayer.setPosition(100 - extra);
                snakes.stream().forEach(snake -> {
                    currentPlayer.setPosition(currentPlayer.position);
                });
            } else {
                currentPlayer.setPosition(currentPlayer.position + die);
                snakes.stream().sorted(Comparator.comparing(Snake::getStart, Comparator.reverseOrder())).forEach(snake -> {
                    Integer newPosition = currentPlayer.position;
                    boolean matched = false;
                    if (newPosition == snake.start) {
                        currentPlayer.setPosition(snake.bite(newPosition));

                    }

                });
                ladders.stream().sorted(Comparator.comparing(Ladder::getStart)).forEach(ladder -> {
                    Integer newPosition = currentPlayer.position;
                    if (newPosition == ladder.start) {
                        currentPlayer.setPosition(ladder.climb(newPosition));
                    }
                });
            }
        }


        return currentPlayer;

    }

    Player isGameOver() {
        if(player1.position == 100 ) {
            return player1;
        } else if (player2.position ==100) {
            return  player2;
        } else {
            return null;
        }
    }

    private Player nextPlayer() {
        if(this.lastPlayed == null) {
            this.lastPlayed = player1;
        } else {
            this.lastPlayed = this.lastPlayed.name.equalsIgnoreCase("Player 1")? player2: player1;
        }
        return this.lastPlayed;
    }
}

class Snake {
    Integer start;
    Integer end;
    Snake(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    public  Integer bite(Integer player) {
        return player == start? end: player;
    }

    public Integer getStart() {
        return this.start;
    }
}

class Ladder {
    Integer start;
    Integer end;
    Ladder(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    public Integer climb(Integer player) {
        return player == start? end: player;
    }

    public Integer getStart() {
        return start;
    }
}

class Player {
    String name;
    Integer position;
    Player(String name) {
        this.position = 0;
        this.name = name;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
