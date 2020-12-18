package week08d05;

import java.util.ArrayList;
import java.util.List;

public class MatchAlgorithms {
    public int greatestCommonDivisor(int a, int b) {
        List<Integer> commonA = new ArrayList<>();
        int oszto = 1;
        int aa = a;
        for (int i = 2; i < aa + 1; i++) {
            if (aa % i == 0) {
                if (b % (oszto * i) == 0) {
                    oszto = oszto * i;
                }
                aa=aa/i;
                i--;
                }
        }
        return oszto;
    }


    public static void main(String[] args) {
        MatchAlgorithms matchAlgorithms = new MatchAlgorithms();
        System.out.println(matchAlgorithms.greatestCommonDivisor(20, 12));
    }


}
