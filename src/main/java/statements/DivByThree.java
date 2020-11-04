package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérek egy számot:");
        int x = scanner.nextInt();
        System.out.println(((x % 3) == 0) ? "Osztható hárommal" : "nem osztható hárommal");
    }
}

