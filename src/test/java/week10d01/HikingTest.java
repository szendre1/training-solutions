package week10d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void getPlusElevation() {
        Hiking hiking = new Hiking(1,2,3);
        assertEquals(13.0,hiking.getPlusElevation(10d, 20d,15d,18d));

    }
}