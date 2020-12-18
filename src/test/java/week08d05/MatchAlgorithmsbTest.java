package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchAlgorithmsbTest {

    @Test
    void greatestCommonDivisor() {
        MatchAlgorithmsb matchAlgorithms = new MatchAlgorithmsb();
        assertEquals(1,matchAlgorithms.greatestCommonDivisor(1, 1));
        assertEquals(8,matchAlgorithms.greatestCommonDivisor(8, 64));
        assertEquals(4,matchAlgorithms.greatestCommonDivisor(12, 20));
        assertEquals(1,matchAlgorithms.greatestCommonDivisor(1181, 1187));

    }
}