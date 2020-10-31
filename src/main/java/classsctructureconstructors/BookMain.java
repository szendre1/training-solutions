package classsctructureconstructors;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book("Petőfi Sándor", "Anyám Tyúkja");
        book.register("12345678");

        System.out.println("A könyv adatai:");
        System.out.println("Szerző: "+book.getAuthor()+" Címe: "+book.getTitle()+" Reg.No: "+book.getRegNumber());

        System.out.println();
        System.out.print("Könyv Szerzője: ");
        String szerzo = scanner.nextLine();
        System.out.print("Könyv Cime: ");
        String cim = scanner.nextLine();
        System.out.print("Könyv Reg.No: ");
        String reg = scanner.nextLine();

        Book book1 = new Book (szerzo,cim);
        book1.register(reg);
        System.out.println("Szerző: "+book1.getAuthor()+" Címe: "+book1.getTitle()+" Reg.No: "+book1.getRegNumber());

    }
}
