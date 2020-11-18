package week04;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int gondolt = rand.nextInt(100)+1;
        //System.out.println( gondolt);
        int tippelt=0;
        while (tippelt!=gondolt){
            System.out.println("Kérem a tippedet: ");
            tippelt=scanner.nextInt();
            if (tippelt>gondolt){
                System.out.println("Kisebb");
            } else if (tippelt<gondolt){
                System.out.println("Nagyobb");
            }
        }
        System.out.println("Eltaláltad "+gondolt);

        //System.out.println(Ra);
    }

}
