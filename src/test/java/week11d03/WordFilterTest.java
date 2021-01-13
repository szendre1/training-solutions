package week11d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    @Test
    void wordsWithChar() {
        WordFilter wordFilter = new WordFilter();
        List<String> myList= new ArrayList<>(Arrays.asList("abc","bcd","cde"));
        assertEquals(Arrays.asList("abc"), wordFilter.wordsWithChar(myList,'a'));
        assertEquals(Arrays.asList("abc","bcd","cde"), wordFilter.wordsWithChar(myList,'c'));
        assertEquals(Arrays.asList("bcd","cde"), wordFilter.wordsWithChar(myList,'d'));

        //assertEquals(Arrays.asList(), wordFilter.wordsWithChar(myList,'x'));

    }
}