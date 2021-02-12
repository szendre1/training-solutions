package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class GameOfThrones {

    public Map<String, Integer> readfromBuffer(BufferedReader covidBuffer) throws IOException {
        Map<String, Integer> result = new HashMap<>();
        String line = null;
        line = covidBuffer.readLine();
        while ((line = covidBuffer.readLine()) != null) {
            //String question = line;
            String lineArr[] = line.split(",");
            for (int i = 5; i < 12; i++) {
                String key = lineArr[i];
                Integer value = 0;
                if (lineArr[i] != "") {
                    if (result.containsKey(key)) {
                        value = result.get(key) + 1;
                    } else {
                        value = 1;
                    }
                    result.put(key, value);
                }

            }
        }
    return result;
    }




        public Map.Entry<String, Integer> maxBattle(Map<String, Integer> paramCoordinates) {
            Map.Entry<String, Integer> maxEntry = null;
            for (Map.Entry<String, Integer> entry : paramCoordinates.entrySet())
            {
                if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
                {
                    maxEntry = entry;
                }
            }
            return maxEntry;
        }


        public static void main(String[] args) {
        GameOfThrones gameOfThrones = new GameOfThrones();
        try (BufferedReader battleBuffer = Files.newBufferedReader(Path.of("battles.csv"))) {
            Map<String, Integer> result = gameOfThrones.readfromBuffer(battleBuffer);
            System.out.println(result);
            Map.Entry<String, Integer> result1 = gameOfThrones.maxBattle(result);
            System.out.println("x:"+result1.getKey()+" y:"+ result1.getValue());



        } catch (IOException e) {
            throw new IllegalStateException("Illegal file path", e);
        }
    }




}
