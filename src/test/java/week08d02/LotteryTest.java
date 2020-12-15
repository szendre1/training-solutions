package week08d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LotteryTest {

    @Test
    void getLotteryNumbers() {
       // List<Integer> ln = new Lottery().getLotteryNumbers();
       // System.out.println(ln);
        assertEquals("[1, 34, 61, 64, 77]", new Lottery().getLotteryNumbers().toString());

    }
}