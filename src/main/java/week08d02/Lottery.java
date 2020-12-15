package week08d02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {


    public List<Integer> getLotteryNumbers() {
        Random random = new Random(10);
        Integer newNumber = null;
        List<Integer> lotteryNumbers = new ArrayList<Integer>();
        for (int y = 0; y < 5; y++) {
            do {
                newNumber = random.nextInt(90) + 1;
            } while (lotteryNumbers.contains(newNumber));
            lotteryNumbers.add(newNumber);
        }
        Collections.sort(lotteryNumbers);
        return lotteryNumbers;
    }

    public static void main(String[] args) {
        List<Integer> ln = new Lottery().getLotteryNumbers();
        System.out.println(ln);
    }
}
