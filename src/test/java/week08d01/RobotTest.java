package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @Test
    void moveTest() {
        Robot robot = new Robot(0, 0);
        Robot newCord = robot.Move("FFLLLLLBBBBJJJJJJJ");
        assertEquals(3, newCord.getCoordX());
        assertEquals(-3, newCord.getCoordY());
    }

    @Test
    void errorTest() {
        Robot robot = new Robot(0, 0);
        //Robot newCord = robot.Move("FFLLLLLBBBBJJJJJJJX");
        Exception ex = assertThrows(IllegalArgumentException.class, () -> robot.Move("FFLLLLLBBBBJJJJJJJX"));
        assertEquals("Érvénytelen irány", ex.getMessage());

    }

}