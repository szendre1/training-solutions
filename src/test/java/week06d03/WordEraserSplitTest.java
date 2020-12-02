package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class WordEraserSplitTest {

    @Test
    void earseWord() {
        WordEraserSplit we = new WordEraserSplit();
        assertEquals("egy kettő négy öt",we.eraserWord("egy kettő három négy öt","három"));
        assertEquals("kettő három négy öt",we.eraserWord("egy kettő három négy öt","egy"));
        assertEquals("egy kettő három négy",we.eraserWord("egy kettő három négy öt","öt"));
        assertEquals("egy három öt",we.eraserWord("egy kettő három kettő öt","kettő"));

    }

    @Test
    void earseWordSpec() {
        WordEraserSplit we = new WordEraserSplit();
        assertEquals("egy kettő három négy öt",we.eraserWord("egy kettő három négy öt","hár"));
        assertEquals("egy kettő három négy öt",we.eraserWord("egy kettő három négy öt",null));
        assertEquals("egy kettő három négy öt",we.eraserWord("egy kettő három négy öt",""));
        assertEquals("",we.eraserWord("","egy"));
        Exception ex = assertThrows(IllegalArgumentException.class, () -> we.eraserWord(null,"egy"));
        assertEquals("Hibás az első kifejezés!", ex.getMessage());

    }
}