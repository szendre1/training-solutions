package stringtype;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        String password1;
        String password2;
        String email;
        System.out.println("Kérem a belépési adatokat:");
        System.out.print("User név:");
        username = scanner.nextLine();
        System.out.print("Jelszó:");
        password1 = scanner.nextLine();
        System.out.print("Jelszó mégegyszer:");
        password2 = scanner.nextLine();
        System.out.print("Email:");
        email = scanner.nextLine();
        UserValidator userValidator = new UserValidator();
        System.out.println("A felhasználónév: "+userValidator.isValidUsername(username) );
        System.out.println("A jelszó: "+userValidator.isValidPassword(password1,password2) );
        System.out.println("Az e-mail cím: "+userValidator.isValidEmail(email) );
    }
}
