package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {
    public List<String> wordsWithChar(List<String> words, char c){
        List<String> tempWords = new ArrayList<>(words);
        for (int i=0;i<tempWords.size();i++) {
            if (tempWords.get(i).indexOf(c)==-1){
                tempWords.remove(i);
                i -= 1;
            }
        }
        return tempWords;
    }
}
