package week13d06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    @Test
    void readFromFile() {
        City city = new City();
        String cityName = city.readFromFile("iranyitoszamok-varosok-2021.csv");
        Assertions.assertEquals("Jászfelsőszentgyörgy",cityName);
    }
}