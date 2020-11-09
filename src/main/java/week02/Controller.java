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
            System.out.print("Tárgyaló neve: ");
            meetingRoomNew.setName(scanner.nextLine());
            System.out.print("Tárgyaló hossza: ");
            meetingRoomNew.setLength(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Tárgyaló szélessége: ");
            meetingRoomNew.setWidth(scanner.nextInt());
            scanner.nextLine();
            System.out.println();
            office.addMeetingRoom(meetingRoomNew);
        }

        /*
        MeetingRoom meetingRoom1 = new MeetingRoom("Elso",2,3);
        MeetingRoom meetingRoom2 = new MeetingRoom("Masodik",4,5);
        MeetingRoom meetingRoom3 = new MeetingRoom("Harmadik",6,7);
        MeetingRoom meetingRoom4 = new MeetingRoom("Negyedik",1,2);

        office.addMeetingRoom(meetingRoom1);
        office.addMeetingRoom(meetingRoom2);
        office.addMeetingRoom(meetingRoom3);
        office.addMeetingRoom(meetingRoom4);



         */

        office.printNames();
        System.out.println();
        office.printNamesReverse();
        System.out.println();
        office.printEvenNames();
        System.out.println();
        office.printAreas();
        System.out.println();
        office.printMeetingRomsWithName("Harmadik");
        System.out.println();
        office.printMeetingRomsContains("DIK");
        System.out.println();
        office.printAreasLargerThan(19);




    }
}
