package week12d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class GradeRounderTest {

    @Test
    void roundGrades() {
        GradeRounder gradeRounder = new GradeRounder();
        int[] newGrades =gradeRounder.roundGrades(new int[] {38,39, 40, 41, 42, 43, 44, 45});
        int[] resultGrades = new int[] {38,39, 40, 41, 42, 45, 45, 45};
        assertArrayEquals(resultGrades,newGrades);

    }
}