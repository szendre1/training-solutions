package week12d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberStat {


    public Integer smallestUnique(List<Integer> integerList) {
        if (integerList.size() < 1) {
            throw new IllegalArgumentException("Not enough elements");
        }
        List<Integer> myList = new ArrayList<>(integerList);
        Collections.sort(myList);
        Integer winner = null;
        Integer winnerCounter = 2;
        for (Integer current : myList) {
            if (current.equals(winner)) {
                winnerCounter++;
            } else {  // winner <> current
                if (winnerCounter.equals(1)) {
                    return winner;
                } else {   // new winner
                    winner = current;
                    winnerCounter = 1;
                }
            }
        }
        throw new IllegalArgumentException("No result");
    }
}
