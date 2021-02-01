package week14d01;

import java.util.*;

public class Indexer {

    public Map<Character, List<String>> index(List<String> names){
        Map<Character,List<String>> map = new HashMap<>();
        for (String s: names) {
            Character firstLetter=s.charAt(0);
            if (map.containsKey(firstLetter)) {
                List<String> newList= new ArrayList<>();
                newList.addAll(map.get(firstLetter));
                newList.add(s);
                map.put(firstLetter,newList);
            } else {
                List<String> newWordList= new ArrayList<>(Arrays.asList(s));
                map.put(firstLetter,newWordList);
            }
        }
    return map;
    }

    public static void main(String[] args) {
        List<String> startList = new ArrayList<>(Arrays.asList("Abraham","Lujza", "Magdolna","Odon",
                "Aladar", "Lajos", "Otto", "Lorant", "Aladar" ));
        Indexer indexer = new Indexer();
        Map<Character,List<String>> returnMap = indexer.index(startList);
        System.out.println(returnMap);
    }


}
