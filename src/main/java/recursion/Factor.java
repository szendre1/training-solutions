package recursion;

public class Factor {


    public double Factor(double x) {
        double y = x;
        if (x > 1) {
            x--;
            y = Factor(x);
        }
        return (x * y);
    }


    public static void main(String[] args) {
        Factor factor = new Factor();
        for (int i = 1; i <= 170; i++) {
            double x = i;
            System.out.println(x + " faktor " + factor.Factor(x + 1));
        }
    }
}





