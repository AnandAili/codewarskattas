package sumofpositivenumbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfPositiveNumbersTest {

    SumOfPositiveNumbers sumOfPositiveNumbers;

    @BeforeEach
    void setUp() {
        sumOfPositiveNumbers = new SumOfPositiveNumbers();
    }

    @Test
    void sumOfAllPositive() {
        int[] numberList = {2,3,5,6};
        assertEquals(16, sumOfPositiveNumbers.sum(numberList));
    }

    @Test
    void sumOfAllPositiveAndNegative() {
        int[] numberList = {2,3,5,6, -5};
        assertEquals(16, sumOfPositiveNumbers.sum(numberList));
    }
}