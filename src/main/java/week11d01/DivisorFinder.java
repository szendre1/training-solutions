package week11d01;

public class DivisorFinder {


    public int findDivisors(int n) {
        String sn = "" + n;
        int x;
        int counter = 0;
        for (int i = 0; i < sn.length(); i++) {
            x = Integer.parseInt(sn.substring(i, i + 1));
            if (x > 0) {
                if (n % x == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        DivisorFinder divisorFinder = new DivisorFinder();
        System.out.println(divisorFinder.findDivisors(425));

    }

}
