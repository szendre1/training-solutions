package week08d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodMoodTest {

    @Test
    void giveMark() {
        Trainer happyTrainer = new Trainer(new GoodMood());
        AssertEquals(1,1)
        System.out.println(happyTrainer.giveMark());
       }
}