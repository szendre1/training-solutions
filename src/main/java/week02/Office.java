package week02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class Office {
    List<MeetingRoom> meetingRomsList = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRomsList.add(meetingRoom);
    }

    public void printNames(){
//        meetingRomsList.sort(MeetingRoom);
        List<String> nevek = new ArrayList<>();
        for (MeetingRoom mr:meetingRomsList){
            // System.out.println(mr.getName());
            nevek.add(mr.getName());

        }
        nevek.sort();
        System.out.println(nevek);
    }



}
