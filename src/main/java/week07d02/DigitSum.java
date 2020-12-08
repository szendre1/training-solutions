package week07d02;

public class DigitSum {

    public static int sumOfDigits(int x) {
        int collector = 0;
        String x1 = Integer.toString(x);
        for (int i = 0; i < x1.length();i++){
            collector = collector + Integer.valueOf(x1.substring(i, i + 1));
        }
        return collector;
    }

}
