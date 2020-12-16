package week08d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringListsTest {


    @Test
    void stringListsUnion() {
        StringLists stringLists = new StringLists();
        List<String> first = new ArrayList<>(Arrays.asList("egy", "egy", "kettő", "egy", "három", "négy", "három"));
        List<String> second = new ArrayList<>(Arrays.asList("kettő", "öt", "kettő", "egy", "három", "négy", "három"));
        List<String> newList = stringLists.stringListsUnion(first,second);
        List<String> backList = new ArrayList<>(Arrays.asList("kettő", "egy", "három", "négy", "öt"));
        assertEquals(backList, stringLists.stringListsUnion(first,second));



    }
}