package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Most regisztrálni fogunk");
        System.out.print("Kérem a nevedet: ");
        String name = scanner.nextLine();
        System.out.print("Kérem az e-mail címedet: ");
        String mail = scanner.nextLine();
        System.out.println();
        System.out.println("A következő adatokkal regisztráltál:");
        System.out.println("Neved: "+name);
        System.out.println("e-mail címed: "+mail);
    }



}
