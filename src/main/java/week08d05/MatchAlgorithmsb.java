package week08d05;

// Ez a lusta programozó megoldása
// Lehetne hatékonyabban is, de programozási szempontból ez egyszerűbb.

public class MatchAlgorithmsb {
    public int greatestCommonDivisor(int a, int b) {
        int c = a<b ? a:b;
        for (int i=c;!(i==1);i--){
            if ((a%i==0) && (b%i==0)){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        MatchAlgorithmsb matchAlgorithms = new MatchAlgorithmsb();
        System.out.println(matchAlgorithms.greatestCommonDivisor(1000, 10000));
    }
}
