package week13d05;

import java.util.HashMap;
import java.util.Map;

public class WordManipulator {


    public int letterCounter(String mainString){
        if (mainString==null) {
            throw new IllegalArgumentException("Null parameter error!!!!!!!!!!!!!!!!!!!!!!!");
        }
        Map<Character, Integer> counter = new HashMap();
        mainString = mainString.toUpperCase().replaceAll("[\\W\\d\\s]","");
        char[] stringArray = mainString.toCharArray();  // W=nonWord d=digit  s=whitespace
        for (char c:stringArray){
                counter.put(c, 1);
        }
        return counter.size();
    }
}
