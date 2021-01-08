package week10d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void findMinSum() {
        Calculator calculator = new Calculator();
        int[] intarr = { 1, 3, 5, 7,9 };
        assertEquals(16, calculator.findMinSum(intarr));
    }
}