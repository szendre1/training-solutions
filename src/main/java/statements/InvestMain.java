package statements;

import java.util.Scanner;

public class InvestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem a befektetés összegét:");
        int befOsszeg = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Kérem a kamatlábat:");
        int kamatLab = scanner.nextInt();
        scanner.nextLine();
        Investment investment1 = new Investment(befOsszeg,kamatLab);

        System.out.println("Befektetés adatai:");
        System.out.println("Tőke:"+investment1.getFund());
        System.out.println("Kamat láb: "+investment1.getInterestRate());
        System.out.println("Hozam 50 napra:"+investment1.getYield(50));
        System.out.println("Kivett összeg 80 nap után:"+investment1.close(80));
        System.out.println("Kivett összeg 90 nap után:"+investment1.close(90));
    }
}
