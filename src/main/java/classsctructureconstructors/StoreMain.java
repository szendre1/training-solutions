package classsctructureconstructors;

import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store store1 =new Store("Porcelán");
        Store store2 =new Store("Cserép");
        System.out.println("Az első raktár: "+store1.getProduct()+" "+store1.getStock()+" db" );
        System.out.println("A második raktár: "+store2.getProduct()+" "+store2.getStock()+" db" );

        System.out.print("Mennyit adjunk a "+store1.getProduct()+"hoz? ");
        int valtozo=scanner.nextInt();
        store1.store(valtozo);
        System.out.println("A "+store1.getProduct()+" mennyisége: "+store1.getStock()+" db");

        System.out.print("Mennyit adjunk a "+store2.getProduct()+"hez? ");
        valtozo=scanner.nextInt();
        store2.store(valtozo);
        System.out.println("A "+store2.getProduct()+" mennyisége: "+store2.getStock()+" db");


        System.out.print("Mennyit vegyünk el a "+store1.getProduct()+"ből? ");
        valtozo=scanner.nextInt();
        store1.dispatch(valtozo);
        System.out.println("A "+store1.getProduct()+" mennyisége: "+store1.getStock()+" db");

        System.out.print("Mennyit vegyünk el a "+store2.getProduct()+"ből? ");
        valtozo=scanner.nextInt();
        store2.dispatch(valtozo);
        System.out.println("A "+store2.getProduct()+" mennyisége: "+store2.getStock()+" db");


    }
}
