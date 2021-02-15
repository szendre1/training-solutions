package week15d04;

public class ExceptionTest {

    public static void main(String[] args) {
        int pay=8,payda=0;

        try {

            double result = pay / (double) payda; // if I cast any of the two variables, program does not recognize the catch block, why is it so?
            System.out.println(result);
            System.out.println("1");
            if (payda==0) throw new IllegalArgumentException("Baj van");

        } catch (Exception e) {

            System.out.println("2");

        } finally {
            System.out.println("3");

        }

    }
}
