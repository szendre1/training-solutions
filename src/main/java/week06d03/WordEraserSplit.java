package week06d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordEraserSplit {

    private boolean isEmpty(String word){
        return word == null || word.trim().equals("");
    }

    public String eraserWord(String words, String word) {
        if (words == null) {
            throw new IllegalArgumentException("Hibás az első kifejezés!");
        }
        if (isEmpty(word)) {
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
