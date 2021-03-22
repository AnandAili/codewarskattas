package oppositenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OppositeNumberTest {

    @Test
    void findOppositeOfPositiveNumber() {
        OppositeNumber oppositeNumber = new OppositeNumber();
        assertEquals(-5, oppositeNumber.findOppositeOf(5));
    }

    @Test
    void findOppositeOfNegativeNumber() {
        OppositeNumber oppositeNumber = new OppositeNumber();
        assertEquals(45, oppositeNumber.findOppositeOf(-45));
    }

    @Test
    void findOppositeOfZero() {
        OppositeNumber oppositeNumber = new OppositeNumber();
        assertEquals(0, oppositeNumber.findOppositeOf(0));
    }
    @Test
    void findOppositeOfException() {
        OppositeNumber oppositeNumber = new OppositeNumber();
        assertThrows(ArithmeticException.class, () -> oppositeNumber.findOppositeOf(Integer.MIN_VALUE), "");
    }
}