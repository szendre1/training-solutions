package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String ClassName;
    private Random rnd= new Random();
    private List<Student> students= new ArrayList();

    public ClassRecords(String className, Random rnd) {
        ClassName = className;
        this.rnd = rnd;
    }

    public String getClassName() {
        return ClassName;
    }

    public boolean addStudent(Student student) {
        if (student.getName().equals(null) || student.getName().equals("")){
            return false;
        }
        for (Student x:students) {
            if (x.getName().equals(student.getName())){
                return false;
            }
        }
        this.students.add(student);
        return true;
    }

    public boolean removeStudent(Student student) {
        if (student.getName().equals(null) || student.getName().equals("")){
            return false;
        }
     //   return students.remove(student);
        int i = 0;
        for (Student x:students) {
            if (x.getName().equals(student.getName())){
                students.remove(i);
                return true;
            }
            i++;
        }
        return false;
    }

    public double calculateClassAverage(){
        if (students.size()==0){
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double classAverage = 0.0;
        int counter = 0;
        for (Student x:students) {
            if (x.calculateAverage() < 1){
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
            counter++;
            classAverage=classAverage+x.calculateAverage();
        }
        return Math.round(classAverage/counter*100.0)/100.0;
    }

    public double calculateClassAverageBySubject(Subject subject){
        if (students.size()==0){
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double classAverage = 0.0;
        int counter = 0;
        for (Student x:students) {
            if (x.calculateSubjectAverage(subject) >= 1){
                counter++;
                classAverage=classAverage+x.calculateSubjectAverage(subject);
            }
        }
        return Math.round(classAverage/counter*100.0)/100.0;
    }

    public Student findStudentByName(String name){
        if (name.equals(null) || name.equals("")) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.size()==0) {
            throw new IllegalStateException("No students to search!");
        }
        for (Student x : students) {
            if (x.getName().equals(name)) {
                return (x);
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! "+name);
    }

    public Student repetition(){
        if (students.size()==0){
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(rnd.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults(){
        List<StudyResultByName> studyResultByNames = new ArrayList<>();
        for (Student x:students) {
            studyResultByNames.add(new StudyResultByName(x.getName(),x.calculateAverage()));
        }
        return studyResultByNames;
    }

    public String listStudentNames(){
        if (students.size()==0){
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        String names="";
        for (Student x:students) {
            switch (names){
                case "" -> names=names+x.getName();
                default -> names=names+", "+x.getName();
            }
        }
        return names;
    }

}
