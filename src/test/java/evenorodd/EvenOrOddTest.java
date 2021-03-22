package evenorodd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOrOddTest {

    EvenOrOdd eoo;

    @BeforeEach
    public void init() {
        eoo = new EvenOrOdd();
    }
    @Test
    public void testEvenOrOdd() {
        assertEquals(eoo.even_or_odd(6), "Even");
        assertEquals(eoo.even_or_odd(7), "Odd");
    }

    @Test
    public void testFOrNegativeNumbers() {
        assertEquals(eoo.even_or_odd(-35), "Odd");
    }

    @Test
    public void testForZero() {
        assertEquals(eoo.even_or_odd(0), "Even");
    }
}
