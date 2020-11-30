package week06d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListSelectorTest {

    @Test
    public void TestCorrectDatas() {
        ListSelector ls = new ListSelector();
        assertEquals("[EgyHáromÖtHét] [Egy,Három,Öt,Hét]",ls.ListS(Arrays.asList("Egy", "Kettő", "Három", "Négy", "Öt", "Hat", "Hét")));
        assertEquals("[EgyHáromÖt] [Egy,Három,Öt]",ls.ListS(Arrays.asList("Egy", "Kettő", "Három", "Négy", "Öt", "Hat")));

    }

    @Test
    public void Testempty() {
        ListSelector ls = new ListSelector();
        assertEquals("",ls.ListS(Arrays.asList()));

    }

    @Test
    public void TestNull() {
        ListSelector ls = new ListSelector();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> ls.ListS(null));
        assertEquals("Nem adtál meg listát!!!", ex.getMessage());
    }
}
