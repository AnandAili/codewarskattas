package snakeladder;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnakesLaddersTest {

    @Test
    void play() {
        SnakesLadders game = new SnakesLadders();
//        Game #1 move #1 {4, 3}: Player 1 is on square 14
//        Game #1 move #2 {1, 5}: Player 2 is on square 6
//        Game #1 move #3 {4, 2}: Player 1 is on square 20
//        Game #1 move #4 {3, 1}: Player 2 is on square 10
//        Game #1 move #5 {2, 6}: Player 1 is on square 84
//        Game #1 move #6 {5, 4}: Player 2 is on square 30
        assertEquals("Player 1 is on square 14", game.play(4, 3));
        assertEquals("Player 2 is on square 6", game.play(1, 5));
        assertEquals("Player 1 is on square 20", game.play(4, 2));
        assertEquals("Player 2 is on square 10", game.play(3, 1));
        assertEquals("Player 1 is on square 84", game.play(2, 6));
        assertEquals("Player 2 is on square 30", game.play(5, 4));

    }

    @Test
    void generate100Numbers() {
        SnakesLadders snakesLadders = new SnakesLadders();
    }
}