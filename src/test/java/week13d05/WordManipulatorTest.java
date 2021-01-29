package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordManipulatorTest {

    @Test
    void letterCounter() {
        String teszt = "AAaaaaÁÁáá1    23BBbbbBb...????";

        WordManipulator wmp = new WordManipulator();
        assertEquals(2, wmp.letterCounter(teszt));
        //System.out.println(wmp.letterCounter(teszt));
    }
}