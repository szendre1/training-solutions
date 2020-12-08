package week07d02;

public class DigitSum {

    public static int sumOfDigits(int... x){
        int sum = 0;
        for (int y:x){
            sum=sum+y;
        }
        return sum;
    }

}
