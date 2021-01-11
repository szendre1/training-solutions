package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorFinderTest {

    @Test
    void findDivisors() {
        DivisorFinder divisorFinder = new DivisorFinder();
        assertEquals(1,divisorFinder.findDivisors(425));
        assertEquals(2,divisorFinder.findDivisors(123));
        assertEquals(2,divisorFinder.findDivisors(360));

    }
}