package week05d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestListCounter {
    ListCounter listCounter = new ListCounter();
    List<String> myList = new ArrayList<>(Arrays.asList("Az első", "az első", "első"));
     //   myList.add("Az első");
     //   myList.add("a második");
     //   myList.add("harmadik");

    @Test
    public void testChangeLetter() {
        //Given
        //When-Then
        assertEquals(2,listCounter.Counter(myList));
        }
  //      System.out.println(""+listCounter.Counter(myList));



}
