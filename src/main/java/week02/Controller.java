package week02;

public class Controller {
    public static void main(String[] args) {
        Office office = new Office();

        MeetingRoom meetingRoom1 = new MeetingRoom("Elso",2,3);
        MeetingRoom meetingRoom2 = new MeetingRoom("Masodik",4,5);
        MeetingRoom meetingRoom3 = new MeetingRoom("Harmadik",6,7);
        MeetingRoom meetingRoom4 = new MeetingRoom("Negyedik",1,2);

        office.addMeetingRoom(meetingRoom1);
        office.addMeetingRoom(meetingRoom2);
        office.addMeetingRoom(meetingRoom3);
        office.addMeetingRoom(meetingRoom4);

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
