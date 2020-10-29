package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Most számolni fogunk, összeadunk két számot.");
        System.out.print("Kérem az első számot:");
        int FirstNumber = scanner.nextInt();
        scanner.nextLine(); //Ez fogja az ottmaradt sorvége jelet beolvasni
        System.out.print("Kérem a második számot:");
        int SecondNumber = scanner.nextInt();
        scanner.nextLine(); //Ez fogja az ottmaradt sorvége jelet beolvasni
        System.out.println(FirstNumber+"+"+SecondNumber+"=");
        System.out.println((FirstNumber+SecondNumber));
    }

}
