package addsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(new int[]{1,2}, twoSum.twoSum(new int[]{3,4,5}, 9));
    }
}