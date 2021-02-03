package week14d03;

import java.util.*;

public class Student {

    private String StudentNAme;
    private Map<String, List<Integer>> subjectMarks = new HashMap<>();

    public Student(String studentNAme) {
        StudentNAme = studentNAme;
    }

    public String getStudentNAme() {
        return StudentNAme;
    }

    public Map<String, List<Integer>> getSubjectMarks() {
        return subjectMarks;
    }

    public void newMark(String subject, Integer mark){
        List<Integer> marks = new ArrayList<>();
        marks.add(mark);
        //System.out.println(mark);
        //System.out.println(marks);
        if (subjectMarks.containsKey(subject)){
            marks.addAll(subjectMarks.get(subject));
        }
        subjectMarks.put(subject,marks);
        //System.out.println(marks);
       // System.out.println(subjectMarks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentNAme='" + StudentNAme + '\'' +
                ", subjectMarks=" + subjectMarks +
                '}';
    }
}
