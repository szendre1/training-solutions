package week02;

public class Controller {
    public static void main(String[] args) {
        Office office = new Office();

        MeetingRoom meetingRoom1 = new MeetingRoom("Elso",2,3);
        MeetingRoom meetingRoom2 = new MeetingRoom("Masodik",4,5);
        MeetingRoom meetingRoom3 = new MeetingRoom("Harmadik",6,7);

        office.addMeetingRoom(meetingRoom1);
        office.addMeetingRoom(meetingRoom2);
        office.addMeetingRoom(meetingRoom3);

        office.printNames();



    }
}
