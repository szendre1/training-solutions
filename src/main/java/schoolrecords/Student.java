package schoolrecords;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.round;

public class Student {
   private List<Mark> marks = new ArrayList();
   private String name;

    public Student(String name) {
        if ((name==null) || (name.equals(""))){
            throw new IllegalArgumentException("Student name must not be empty!");
        } else this.name = name;
    }

    public void grading(Mark mark) {
        if (mark==null){
            throw new NullPointerException("Mark must not be null!");
        } else marks.add(mark);
    }

    public double calculateAverage() {    //lehet, hogy ide az átlagok átlaga kellene?
    int counter=0;
    double average= 0.0;
    for (Mark x:marks) {
        counter++;
        average=average+x.getMarkType().getValue();
    }
     return Math.round(average/counter*100.0)/100.0;
     // NaN ; 0 round le kezelte a nullával való osztást is valahogy
}

    public double calculateSubjectAverage(Subject subject) {
        int counter=0;
        double average= 0.0;
        for (Mark x:marks) {
            if (x.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                counter++;
                average = average+x.getMarkType().getValue();
            }
        }
        return Math.round(average/counter*100.0)/100.0;
        // NaN ; 0 round le kezelte a nullával való osztást is valahogy
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {   // diák nevét és jegyeit kell majd listázza.
        String returnValue =name+" marks: ";
        for (Mark x:marks){
            returnValue=returnValue+x.getSubject().getSubjectName()+": "+x.toString();
        }
        return returnValue;
    }
}
