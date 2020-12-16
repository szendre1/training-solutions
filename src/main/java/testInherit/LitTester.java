package testInherit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LitTester {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(Arrays.asList("Az első", "Az első", "Az első"));
        myList.add("Az első");
        myList.add("a második");
        myList.add("harmadik");
        System.out.println(myList);


        List<Integer> list1, list2 = null;
        Integer[] intarr = { 3, 4, 2, 1 };
        list1 = new ArrayList<Integer>(Arrays.asList(intarr));
        list1.add(30);
        list2 = Arrays.asList(intarr);
        list2.add(40); //Here, we can't modify the existing list,because it's a wrapper
        System.out.println(list2);


    }

}
