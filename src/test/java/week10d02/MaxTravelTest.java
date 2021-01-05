package week10d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxTravelTest {

    @Test
    void getMaxIndex() {
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 12, 0, 12, 12, 3, 4, 4));
        MaxTravel maxTravel = new MaxTravel();
        assertEquals(12, maxTravel.getMaxIndex(list));
    }
}