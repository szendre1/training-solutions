package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a termék adatait (Név, ár)");


        String name;
        int price;
        int ar_avtozik;
        System.out.print("Termék neve: ");
        name = scanner.nextLine();
        System.out.print("Termék ára (Ft.): ");
        price = scanner.nextInt();
        Product product = new Product(name,price);
        System.out.println("Termék neve: "+product.getName()+" Ára: "+product.getPrice()+" Ft.");

        System.out.print("Mennyivel növeljük az "+product.getName()+" Árát? ");
        ar_avtozik = scanner.nextInt();
        product.increasePrice(ar_avtozik);
        System.out.println("Termék neve: "+product.getName()+" Ára: "+product.getPrice()+" Ft.");

        System.out.print("Mennyivel csökkentsük az "+product.getName()+" Árát? ");
        ar_avtozik = scanner.nextInt();
        product.decreasePrice(ar_avtozik);
        System.out.println("Termék neve: "+product.getName()+" Ára: "+product.getPrice()+" Ft.");

    }

}
