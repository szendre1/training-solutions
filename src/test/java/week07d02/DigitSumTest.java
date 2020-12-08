package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitSumTest {

    @Test
    void sumOfDigits() {
        assertEquals(6,DigitSum.sumOfDigits(1,1,1,1,1,1));
        assertEquals(6,DigitSum.sumOfDigits(0,6));
        assertEquals(6,DigitSum.sumOfDigits(-6,12));
        assertEquals(6,DigitSum.sumOfDigits(20,-14));
    }
}