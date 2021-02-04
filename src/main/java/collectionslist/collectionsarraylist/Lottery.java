package collectionslist.collectionsarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {


    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        if (lotteryType>ballCount){
            throw new IllegalArgumentException("Too many balls!");
        }
        List<Integer> balls = new ArrayList<>();
        List<Integer> winnerBalls = new ArrayList<>();
        for (int i = 0; i < ballCount; i++) {
            balls.add(i + 1);
        }
        Collections.shuffle(balls);
        winnerBalls = balls.subList(0, lotteryType);
        Collections.sort(winnerBalls);

        return winnerBalls;
    }


}
