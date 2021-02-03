package week14d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClassNotebook {
    List<Student> studentList = new ArrayList<>();

    public void addStudent(Student newStudent) {
        this.studentList.add(newStudent);
    }

    public List<Student> sortNotebook() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getStudentNAme().compareTo(o2.getStudentNAme());
            }
        });
        return studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }


    public static void main(String[] args) {
        ClassNotebook classNotebook = new ClassNotebook();
        classNotebook.addStudent(new Student("John Doe"));
        classNotebook.addStudent(new Student("Jack Doe"));
        classNotebook.addStudent(new Student("Jane Doe"));
        classNotebook.getStudentList().get(1).newMark("Match", 5);
        classNotebook.getStudentList().get(1).newMark("Match", 4);
        classNotebook.getStudentList().get(1).newMark("Physics", 4);
        classNotebook.getStudentList().get(0).newMark("Physics", 3);
        classNotebook.getStudentList().get(0).newMark("Match", 2);
        classNotebook.getStudentList().get(2).newMark("Music", 1);
        System.out.println(classNotebook.sortNotebook());


    }
}