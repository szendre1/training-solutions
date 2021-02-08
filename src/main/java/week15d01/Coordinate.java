package week15d01;

// https://www.baeldung.com/java-find-map-max

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Coordinate {

    public Map.Entry<Integer, Integer> maxY(Map<Integer, Integer> paramCoordinates) {
        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : paramCoordinates.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }
        return maxEntry;
    }


    public Map.Entry<Integer, Integer> maxY1(Map<Integer, Integer> paramCoordinates) {
        Optional<Map.Entry<Integer, Integer>> maxEntry = paramCoordinates.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));
        return maxEntry.get();
    }

    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate();
        Map<Integer, Integer> myCoordinates = new HashMap<>();
        myCoordinates.put(1,1);
        myCoordinates.put(2,7);
        myCoordinates.put(8,2);
        myCoordinates.put(4,3);
        myCoordinates.put(5,6);

        Map.Entry<Integer, Integer> maxValue = coordinate.maxY(myCoordinates);
        System.out.println("x:"+maxValue.getKey()+" y:"+ maxValue.getValue());


    }
}
