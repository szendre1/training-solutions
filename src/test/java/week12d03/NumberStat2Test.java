package week12d03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumberStat2Test {

    @Test
    void integerFromFile() {
    }

    @Test
    void smallestUnique() {
        NumberStat numberStat = new NumberStat();


        Integer result = numberStat.smallestUnique(new ArrayList<>(Arrays.asList(1,1,5,3,4,5,6,5,6,4,1,6,5,4)));
        Assertions.assertEquals(3,result);
    }
}