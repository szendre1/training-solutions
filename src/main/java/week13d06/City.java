package week13d06;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class City {

    public String readFromFile(String fileName) {
        int longestLength = 0;
        String longestCityName = "";
        Path file = Path.of(fileName);
        try (BufferedReader data = Files.newBufferedReader(file)) {
            String line;
            while ((line = data.readLine()) != null) {
                String array[] = line.split(";");
                //System.out.println(array[2]);
                if (array[1].length() > longestLength) {
                    longestLength = array[1].length();
                    longestCityName = array[1];
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return longestCityName;
    }

    public static void main(String[] args) {
        City city = new City();
        System.out.println(city.readFromFile("iranyitoszamok-varosok-2021.csv"));
    }

}
