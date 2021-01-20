package week12d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberStat2 {

    List<Integer> integerList = new ArrayList<>();

    public void integerFromFile() {
        Path file = Path.of("numbers.txt");
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String temp[] = line.split(",");
                for (String curTemp : temp) {
                    integerList.add(Integer.parseInt(curTemp));
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }


    }


    public Integer smallestUnique() {
        if (integerList.size() < 1) {
            throw new IllegalArgumentException("Not enough elements");
        } //
        List<Integer> myList = new ArrayList<>(integerList);
        Collections.sort(myList);
        Integer winner = null;
        Integer winnerCounter = 2;
        for (Integer current : myList) {
            if (current.equals(winner)) {
                winnerCounter++;
            } else {  // winner <> current
                if (winnerCounter.equals(1)) {
                    return winner;
                } else {   // new winner
                    winner = current;
                    winnerCounter = 1;
                }
            }
        }
        throw new IllegalArgumentException("No result");
    }

    public static void main(String[] args) {
        NumberStat2 numberStat = new NumberStat2();
        numberStat.integerFromFile();
        System.out.println(numberStat.smallestUnique());
    }

}
