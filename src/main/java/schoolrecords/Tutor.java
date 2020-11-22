package schoolrecords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tutor {
    private String name;
    List<Subject> taughtSubjects = new ArrayList<>();

    public Tutor(String name, List<Subject> taughtSubjects) {
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject) {  //isTutorTeachingSubject kifejezőbb lenne.
        for (Subject x:taughtSubjects) {
            if (x.getSubjectName().contains(subject.getSubjectName())) {
                return true;
            }
        }
        return false;
    }

}
