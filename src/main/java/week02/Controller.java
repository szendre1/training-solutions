package week02;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Office office = new Office();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Irodaház nyilvántartó program");
        System.out.print("Hány darab tárgyalót szeretnél rögzíteni? ");
        int targyaloDb = scanner.nextInt();
        scanner.nextLine();

        String tName;
        int tLength;
        int tWidth;
        for (int i=1;i<=targyaloDb;i++){
            MeetingRoom meetingRoomNew = new MeetingRoom("Elso",2,3);
            System.out.print(i+". Tárgyaló neve: ");
            meetingRoomNew.setName(scanner.nextLine());
            System.out.print(i+". Tárgyaló hossza: ");
            meetingRoomNew.setLength(scanner.nextInt());
            scanner.nextLine();
            System.out.print(i+". Tárgyaló szélessége: ");
            meetingRoomNew.setWidth(scanner.nextInt());
            scanner.nextLine();
            System.out.println();
            office.addMeetingRoom(meetingRoomNew);
        }

        for (int i=1; i==1; i=i){
            System.out.println();
            System.out.println("1. Tárgyalók sorrendben");
            System.out.println("2. Tárgyalók visszafele sorrendben");
            System.out.println("3. Minden második tárgyaló");
            System.out.println("4. Területek");
            System.out.println("5. Keresés pontos név alapján");
            System.out.println("6. Keresés névtöredék alapján");
            System.out.println("7. Keresés terület alapján");
            System.out.println("8. Munka befejezése");

            System.out.print("Melyik feladattal foglalkozzunk?");
            int seletctJob = scanner.nextInt();
            scanner.nextLine();
            if (seletctJob==1) {
                System.out.println();
                office.printNames();
            } else if (seletctJob==2) {
                System.out.println();
                office.printNamesReverse();
            } else if (seletctJob==3) {
                System.out.println();
                office.printEvenNames();
            } else if (seletctJob==4) {
                System.out.println();
                office.printAreas();
            } else if (seletctJob==5) {
                System.out.print("Kérem a pontos nevet! ");
                String name = scanner.nextLine();
                System.out.println();
                office.printMeetingRomsWithName(name);
            } else if (seletctJob==6) {
                System.out.print("Kérem a név töredéket! ");
                String name = scanner.nextLine();
                System.out.println();
                office.printMeetingRomsContains(name);
            } else if (seletctJob==7) {
                System.out.print("Mekkoránál nagyobb területek kellenek? ");
                int area = scanner.nextInt();
                System.out.println();
                office.printAreasLargerThan(area);
            } else if (seletctJob==8) {
                return;
            }

        }
    }
}
