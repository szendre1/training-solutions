package week06d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordEraserSplit {

    public String eraserWord(String words, String word) {
        if (words == null) {
            throw new IllegalArgumentException("Hibás az első kifejezés!");
        }
        if (word == null) {
            return words;
        }
        if (word.trim().equals("")) {
            return words;
        }
        List<String> wordList = new ArrayList<>(Arrays.asList(words.split(" ")));
        String newWords = "";
        for (String x : wordList) {
            if (!x.equals(word.trim())) {
                newWords = newWords + x + " ";
            }
        }
        return newWords.trim();
    }
}
