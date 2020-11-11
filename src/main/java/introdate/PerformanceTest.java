package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {


    public static void main(String[] args) {
        Performance performance = new Performance(LocalDate.of(2020,11,14),
                "Queen", LocalTime.of(10,45),LocalTime.of(11,47));

        System.out.println(performance.getInfo());
    }
}
