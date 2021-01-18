package week12d01;

public class GradeRounder {

    public int[] roundGrades(int[] grades) {

        if (grades == null) {
            throw new IllegalStateException("No datas");
        }
        int[] newGrades = grades.clone();
        for (int actualGr =0;actualGr<newGrades.length;actualGr++) {
            if (newGrades[actualGr] > 40) {
                int modGr = newGrades[actualGr] % 5;
                if (modGr > 2) {
                    newGrades[actualGr] += 5 - modGr;
                }
                //else {
                //    newGrades[actualGr] -= modGr;
                //}
            }
        }
        return newGrades;
    }

}
