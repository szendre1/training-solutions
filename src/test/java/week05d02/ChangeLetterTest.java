package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

    @Test
    public void testChangeLetter() {
        //Given
        ChangeLetter changeLetter = new ChangeLetter();
        //When-Then
        assertEquals("H*ll* W*rld!  Wh*t d* y** th*nk, *s *t *K?",
            changeLetter.ChangeVowels("Hello World!  What do you think, is it OK?"));
    }
}
