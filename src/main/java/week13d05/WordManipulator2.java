package week13d05;

import java.util.HashSet;
import java.util.Set;

public class WordManipulator2 {


    public int letterCounter(String mainString){
        if (mainString==null) {
            throw new IllegalArgumentException("Null parameter error!!!!!!!!!!!!!!!!!!!!!!!");
        }
        String tempString = mainString.toUpperCase().replaceAll("[\\W\\d\\s]","");
        char[] stringArray = tempString.toCharArray();  // W=nonWord d=digit  s=whitespace
        Set<Character> counter = new HashSet<>();
        for(char c: stringArray){
            counter.add(c);
        }
        return counter.size();
    }

    public static void main(String[] args) {
        String teszt="AAaaaaÁÁáá1    23BBbbbBb...????";
        WordManipulator2 wmp = new WordManipulator2();
        System.out.println(wmp.letterCounter(teszt));
    }


}
