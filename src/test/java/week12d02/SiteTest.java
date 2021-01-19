package week12d02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SiteTest {

    @Test
    void getOddEven() {
        Site site = new Site("0", 10, Fence.PERFECT);
        Assertions.assertEquals("0", site.getOddEven());
        Assertions.assertEquals(10, site.getLength());
        Assertions.assertEquals(Fence.PERFECT, site.getFence());



    }
}