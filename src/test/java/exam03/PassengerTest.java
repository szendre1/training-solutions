package exam03;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PassengerTest {

    @Test
    void create() {
        Passenger passenger = new Passenger("John Doe", CruiseClass.LUXURY);
        Assertions.assertEquals("John Doe", passenger.getName());
        Assertions.assertEquals(CruiseClass.LUXURY, passenger.getCruiseClass());
    }
}
