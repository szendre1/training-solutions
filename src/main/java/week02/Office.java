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

    public void printNames() {
        //List<String> nevek = new ArrayList<>();
        for (MeetingRoom mr : meetingRomsList) {
            System.out.println(mr.getName());
        }
    }

    public void printNamesReverse() {
        for (int i = meetingRomsList.size() - 1; i > -1; i--) {
            System.out.println(meetingRomsList.get(i).getName());

        }
    }


    public void printEvenNames() {
        for (int i =1; i<=meetingRomsList.size() - 1; i=i+2) {
            System.out.println(meetingRomsList.get(i).getName());

        }
    }

    public void printAreas() {
        //List<String> nevek = new ArrayList<>();
        for (MeetingRoom mr : meetingRomsList) {
            System.out.println(mr.getName()+" "+mr.getWidth()+" "+mr.getLength()+" "+(mr.getWidth()*mr.getLength()) );
        }
    }

    public void printMeetingRomsWithName(String name) {
        //List<String> nevek = new ArrayList<>();
        for (MeetingRoom mr : meetingRomsList) {
            if (mr.getName().equals(name)){
                System.out.println(mr.getName()+" "+mr.getWidth()+" "+mr.getLength()+" "+(mr.getWidth()*mr.getLength()));
            }
        }
    }

    public void printMeetingRomsContains(String name) {
        //List<String> nevek = new ArrayList<>();
        for (MeetingRoom mr : meetingRomsList) {
            if (mr.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println((mr.getName()+" "+mr.getWidth()+" "+mr.getLength()+" "+(mr.getWidth()*mr.getLength()) ));
            }
        }
    }

    public void printAreasLargerThan(int area) {
        //List<String> nevek = new ArrayList<>();
        for (MeetingRoom mr : meetingRomsList) {
            if ((mr.getLength()*mr.getWidth())>area) {
                System.out.println((mr.getName()+" "+mr.getWidth()+" "+mr.getLength()+" "+(mr.getWidth()*mr.getLength()) ));
            }
        }
    }







/*
    public void printNamesold(){
//        meetingRomsList.sort(MeetingRoom);
        List<String> nevek = new ArrayList<>();
        for (MeetingRoom mr:meetingRomsList){
            // System.out.println(mr.getName());
            nevek.add(mr.getName());

        }
        // nevek.sort();
        System.out.println(nevek);
    }

*/
}
