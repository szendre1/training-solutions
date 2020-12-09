package week07d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberListTest {

    @Test
    void isIncreasing() {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        NumberList nrl = new NumberList();
        assertTrue(nrl.isIncreasing(intList));

        intList = new ArrayList<>(Arrays.asList(1,1,2,2,2,3,4,5,5,6));
        assertTrue(nrl.isIncreasing(intList));

        intList = new ArrayList<>(Arrays.asList(1,1,2,2,2,3,4,3,5,5,6));
        assertFalse(nrl.isIncreasing(intList));

        intList = new ArrayList<>(Arrays.asList(1));
        assertTrue(nrl.isIncreasing(intList));

    }
}