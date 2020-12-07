package week07d01;

public class MathAlgorithms {


    public static boolean isPrime(int x) {
        if (x==1) {
            return false;
        }
        if (x < 1) {
            throw new IllegalArgumentException("2 és " + Integer.MAX_VALUE + " közötti érték adható meg.");
        }
        for (int i = 2; i <= x/2; i++)
            if ( x % i == 0) {
                return false;
            }
        return true;
    }

}
