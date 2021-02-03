package week14d03;

import java.text.Collator;
import java.util.*;

public class ClassNotebook {
    List<Student> studentList = new ArrayList<>();

    public void addStudent(Student newStudent) {
        this.studentList.add(newStudent);
    }

    public List<Student> sortNotebook() {
        Collator spCollator = Collator.getInstance(new Locale("hu", "HU"));
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return spCollator.compare(o1.getStudentNAme(),o2.getStudentNAme());
            }
        });
        return studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }


    public static void main(String[] args) {
        ClassNotebook classNotebook = new ClassNotebook();
        classNotebook.addStudent(new Student("István"));
        classNotebook.addStudent(new Student("Ádám"));
        classNotebook.addStudent(new Student("Arnold"));
        classNotebook.getStudentList().get(1).newMark("Match", 5);
        classNotebook.getStudentList().get(1).newMark("Match", 4);
        classNotebook.getStudentList().get(1).newMark("Physics", 4);
        classNotebook.getStudentList().get(0).newMark("Physics", 3);
        classNotebook.getStudentList().get(0).newMark("Match", 2);
        classNotebook.getStudentList().get(2).newMark("Music", 1);
        System.out.println(classNotebook.getStudentList());
        System.out.println(classNotebook.sortNotebook());


    }
}