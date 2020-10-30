package classstructureattributes;


import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        System.out.print("Kérem a nevedet: ");
        client.name = scanner.nextLine();
        System.out.print("Kérem a születési évedet: ");
        client.yearOfBirth = scanner.nextInt();
        scanner.nextLine(); //Ez fogja az ottmaradt sorvége jelet beolvasni
        System.out.println();
        System.out.println("A következő adatokat adtad meg:");
        System.out.println("Neved: "+client.name);
        System.out.println("Születési éved: "+client.yearOfBirth);

    }
}
