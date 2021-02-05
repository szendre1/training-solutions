package week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Statistics {

    public Map<String, Integer> countWords(BufferedReader film, String... findWords) throws IOException {
        Map<String, Integer> results = new HashMap<>();
        String line = null;
        while ((line = film.readLine()) != null) {
            String[] splitedLine = line.split(" ");
            for (String sl : splitedLine) {
                for (String fw : findWords) {
                    if (sl.toLowerCase().contains(fw.toLowerCase())) {
                        Integer mapValue = results.containsKey(fw) ? results.get(fw) + 1 : 1;
                        results.put(fw,mapValue);
                    }
                }
            }
        }
        return results;
    }


    public static void main(String[] args) {
        try (BufferedReader film = Files.newBufferedReader(Path.of("hachiko.srt"), Charset.forName("windows-1250"))){
       // try (BufferedReader film = new BufferedReader(new InputStreamReader(new FileInputStream("hachiko.srt"), Charset.forName("windows-1250")))){


             Statistics statistics = new Statistics();
             String[] words={ "Hachiko", "haza","pályaudvar", "jó"};
            Map<String, Integer> result =  statistics.countWords(film,words);
            System.out.println(result);

        } catch (IOException e) {
            throw new IllegalStateException("Illegal file path", e);
        }
    }

}
