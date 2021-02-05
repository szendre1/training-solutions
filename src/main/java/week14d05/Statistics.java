package week14d05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Statistics {

    public Map<String, Integer> countWords(BufferedReader film, String... findWords) throws IOException {
        Map<String, Integer> results = new HashMap<>();
        String line = null;
        while ((line = film.readLine()) != null) {
            line = line.replaceAll("[.,1234567890?!:-]", "");
            line = line.replaceAll("<i>", "");
            line = line.replaceAll("</i>", "");
            line = line.toLowerCase();
            //System.out.println(line);
            String[] splitedWords = line.split(" ");
            for (String sw : splitedWords) {
                for (String fw : findWords) {
                    if (fw.toLowerCase().equals(sw)) {
                        Integer mapValue = results.containsKey(fw) ? results.get(fw) + 1 : 1;
                        results.put(fw,mapValue);
                    }
                }
            }
        }
        return results;
    }


    public static void main(String[] args) {
        //Path filmPath = Path.of("hachiko.srt");
        //try (BufferedReader film = Files.newBufferedReader(filmPath)){
        try (BufferedReader film = new BufferedReader(new InputStreamReader(new FileInputStream("hachiko.srt"), "windows-1250"))){
             Statistics statistics = new Statistics();
             String[] words={ "Hachiko", "haza","pályaudvar", "jó"};
            Map<String, Integer> result =  statistics.countWords(film,words);
            System.out.println(result);

        } catch (IOException e) {
            throw new IllegalStateException("Illegal file path", e);
        }
    }

}
