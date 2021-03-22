package multiply;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {

    @Test
    void multiply() {
        assertEquals(Double.valueOf(35.0), Multiply.multiply(Double.valueOf(7.0), Double.valueOf(5.0)));
    }

    @Test
    void multifyFOrException() {
        assertThrows(ArithmeticException.class, () -> Multiply.multiply(null, Double.valueOf(4.0)));
    }
}