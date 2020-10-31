package classstructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Note note = new Note();
        System.out.println("Egy Jegyzet adatait kérem:");
        System.out.print("Felhasználó neve: ");
        note.setName(scanner.nextLine());
        System.out.print("Jegyzet témája: ");
        note.setTopic(scanner.nextLine());
        System.out.print("Jegyzet szövege: ");
        note.setText(scanner.nextLine());
        System.out.println();
        System.out.println(note.getNoteText());
    }

}
