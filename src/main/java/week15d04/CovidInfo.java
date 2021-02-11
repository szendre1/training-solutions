package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CovidInfo {

    List<Covid> covidList = new ArrayList<>();

    public List<Covid> getCovidList() {
        return covidList;
    }

    // fájl beolvasás
    public void readfromBuffer(BufferedReader covidBuffer) throws IOException {
        String line = null;
        while ((line = covidBuffer.readLine()) != null) {
            String question = line;
            String lineArr[] = line.split(",");
            if (lineArr[4].equals("Hungary")) {
                System.out.println(line);
                String year_week = lineArr[1];
                int cases_weekly = Integer.parseInt(lineArr[2]);
                covidList.add(new Covid(year_week, cases_weekly));
            }
        }
    }


    private List<Covid> topThree() {

        List<Covid> result = covidList.stream().sorted(Comparator.comparing(Covid::getCases_weekly).reversed()).collect(Collectors.toList());
        System.out.println(result);
        System.out.println();

        result = result.subList(0, 3) ;


        return result;

    }

    public static void main(String[] args) {
        CovidInfo covidInfo = new CovidInfo();
        try (BufferedReader covidBuffeer = Files.newBufferedReader(Path.of("data.csv"))) {
            covidInfo.readfromBuffer(covidBuffeer);
            List<Covid> result = covidInfo.topThree();
            System.out.println(result);

        } catch (IOException e) {
            throw new IllegalStateException("Illegal file path", e);
        }
    }

}
