package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();
        System.out.println("Kérem a kedvenc zeneszámod adatait:");
        System.out.print("Kérem a kedvenc zeneszámod Címe: ");
        song.title = scanner.nextLine();
        System.out.print("Kérem a kedvenc zeneszámod előadóját: ");
        song.band = scanner.nextLine();
        System.out.print("Kérem a kedvenc zeneszámod hosszát (perc): ");
        song.length = scanner.nextInt();
        System.out.println();
        System.out.println(song.band+" - "+song.title+" ("+song.length+" perc)!");
    }
}
