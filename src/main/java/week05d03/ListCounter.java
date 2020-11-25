package week05d03;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCounter {

    public int Counter(List<String> myList){
        int talalat = 0;
        for (String x:myList) {
            if (x.toUpperCase().charAt(0)=='A'){
                talalat++;
            }
        }
        return talalat;
    }

    public static void main(String[] args) {
        ListCounter listCounter = new ListCounter();
        List<String> myList = new ArrayList<>(Arrays.asList("Az első", "Az első", "Az első"));
        myList.add("Az első");
        myList.add("a második");
        myList.add("harmadik");
        System.out.println(""+listCounter.Counter(myList));

    }

}
