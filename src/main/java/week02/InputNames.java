package week02;

import java.util.Scanner;

public class InputNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] name = new String[5];
        for(int i=0; i<5; i++){
            System.out.print("Kérem az "+(i+1)+" nevet: ");
            name[i]=scanner.nextLine();
        };
        for(int i=0; i<5; i++){
            System.out.println("Az "+(i+1)+" név: "+name[i]);
        };
    }
}
