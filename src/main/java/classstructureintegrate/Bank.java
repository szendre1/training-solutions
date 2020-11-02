package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az 1. Bankszámla adatait:");
        System.out.print("Tulajdonos: ");
        String owner = scanner.nextLine();
        System.out.print("Számla szám: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Egyenleg: ");
        int balance = scanner.nextInt();
        scanner.nextLine();
        BankAccount bankAccount1 = new BankAccount(owner, accountNumber, balance);
        System.out.println("Első számla adatai: "+bankAccount1.getInfo());

        System.out.println();
        System.out.println("Kérem a 2. Bankszámla adatait:");
        System.out.print("Tulajdonos: ");
        owner = scanner.nextLine();
        System.out.print("Számla szám: ");
        accountNumber = scanner.nextLine();
        System.out.print("Egyenleg: ");
        balance = scanner.nextInt();
        BankAccount bankAccount2 = new BankAccount(owner, accountNumber, balance);
        System.out.println("Második számla adatai: "+bankAccount2.getInfo());

        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("Első számla adatai: "+bankAccount1.getInfo());
        System.out.print("MEnnyit fizetünk "+bankAccount1.getOwner()+" Számlájára? ");
        int befizet = scanner.nextInt();
        bankAccount1.deposit(befizet);
        System.out.println("Első számla adatai: "+bankAccount1.getInfo());

        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("Második számla adatai: "+bankAccount2.getInfo());
        System.out.print("MEnnyit fizetünk "+bankAccount2.getOwner()+" Számlájára? ");
        befizet = scanner.nextInt();
        bankAccount2.deposit(befizet);
        System.out.println("Második számla adatai: "+bankAccount2.getInfo());



        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("Első számla adatai: "+bankAccount1.getInfo());
        System.out.print("MEnnyit vonjunk le "+bankAccount1.getOwner()+" Számlájáról? ");
        int levon = scanner.nextInt();
        bankAccount1.withdraw(levon);
        System.out.println("Első számla adatai: "+bankAccount1.getInfo());

        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("Második számla adatai: "+bankAccount2.getInfo());
        System.out.print("MEnnyit vonjunk le "+bankAccount2.getOwner()+" Számlájáról? ");
        levon = scanner.nextInt();
        bankAccount2.withdraw(levon);
        System.out.println("Második számla adatai: "+bankAccount2.getInfo());

        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("Első számla adatai: "+bankAccount1.getInfo());
        System.out.println("Második számla adatai: "+bankAccount2.getInfo());
        System.out.print("Mennyit utaljunk "+bankAccount1.getOwner()+" Számlájáról "+bankAccount2.getOwner()+" Számlájára?");
        int utal = scanner.nextInt();
        bankAccount1.transfer(bankAccount2,utal);
        System.out.println("Első számla adatai: "+bankAccount1.getInfo());
        System.out.println("Második számla adatai: "+bankAccount2.getInfo());

        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("Első számla adatai: "+bankAccount1.getInfo());
        System.out.println("Második számla adatai: "+bankAccount2.getInfo());
        System.out.print("Mennyit utaljunk "+bankAccount2.getOwner()+" Számlájáról "+bankAccount1.getOwner()+" Számlájára?");
        utal = scanner.nextInt();
        bankAccount2.transfer(bankAccount1,utal);
        System.out.println("Első számla adatai: "+bankAccount1.getInfo());
        System.out.println("Második számla adatai: "+bankAccount2.getInfo());
        System.out.println("Köszönjük hogy a mi bankunkat választotta!");



    }

}
