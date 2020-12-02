package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class WordEraserRecursiveTest {

    @Test
    void earseWord() {
        WordEraserRecursive we = new WordEraserRecursive();
        assertEquals("egy kettő négy öt",we.earseWord("egy kettő három négy öt","három"));
        assertEquals("kettő három négy öt",we.earseWord("egy kettő három négy öt","egy"));
        assertEquals("egy kettő három négy",we.earseWord("egy kettő három négy öt","öt"));
        assertEquals("egy három öt",we.earseWord("egy kettő három kettő öt","kettő"));

    }

    @Test
    void earseWordSpec() {
        WordEraserRecursive we = new WordEraserRecursive();
        assertEquals("egy kettő három négy öt",we.earseWord("egy kettő három négy öt","hár"));
        assertEquals("egy kettő három négy öt",we.earseWord("egy kettő három négy öt",null));
        assertEquals("egy kettő három négy öt",we.earseWord("egy kettő három négy öt",""));
        assertEquals("",we.earseWord("","egy"));
        Exception ex = assertThrows(IllegalArgumentException.class, () -> we.earseWord(null,"egy"));
        assertEquals("Hibás az első kifejezés!", ex.getMessage());

    }
}