package vowelcount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    @Test
    void getCount() {
        assertEquals(2, Vowels.getCount("anand"));
    }

    @Test
    void getCountFOrAEIOU() {
        assertEquals(5, Vowels.getCount("aeiou"));
    }

    @Test
    void getCountFOrMix() {
        assertEquals(6, Vowels.getCount("aaeiou"));
    }

    @Test
    void getCountFOrZero() {
        assertEquals(0, Vowels.getCount("dftghy"));
    }
}