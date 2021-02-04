package collectionslist.collectionsarraylist;

import org.junit.jupiter.api.Test;

class LotteryTest1 {


    @Test
    void selectWinningNumbers() {
        Lottery lottery6 = new Lottery();
        System.out.println(lottery6.selectWinningNumbers(5,10));

    }
}