package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az első időpontot!");
        System.out.print("Óra:");
        int firstOra=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Perc:");
        int firstPerc=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Másodperc:");
        int firstMasodperc=scanner.nextInt();
        scanner.nextLine();
        Time firstTime = new Time(firstOra,firstPerc,firstMasodperc);

        System.out.println("Kérem a második időpontot!");
        System.out.print("Óra:");
        int secondOra=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Perc:");
        int secondPerc=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Másodperc:");
        int secondMasodperc=scanner.nextInt();
        scanner.nextLine();
        Time secondTime = new Time(secondOra,secondPerc,secondMasodperc);

        System.out.println("Az első időpont "+firstTime.toString()+" = "+firstTime.getInMinutes());
        System.out.println("A második időpont "+secondTime.toString()+" = "+secondTime.getInSeconds());
        System.out.println("Az első korábbi, mint a második: "+firstTime.earlierThan(secondTime) );

    }
}
