package week06d01;

import java.util.Arrays;
import java.util.List;

public class ListSelector {


    public String ListSelector(List<String> lista) {
        if (lista == null) {
            throw new IllegalArgumentException("Nem adtál meg listát!!!");
        }
        if (lista.size() == 0) {
            return "";
        }
        StringBuilder s = new StringBuilder("");
        s.append("[");
        for (int x = 0; lista.size() > x; x++) {
            if (x % 2 == 0) {
                s.append(lista.get((int) x));
            }
        }
        s.append("] ");


        s.append("[");
        for (int x = 0; lista.size() > x; x++) {
            if (x % 2 == 0) {
                s.append(lista.get((int) x) + ",");
            }
        }
        StringBuilder s1 = new StringBuilder();
        s1.append(s.substring(0, s.length() - 1));
        s1.append("]");
        return (s1.toString());
    }


    public static void main(String[] args) {
        ListSelector ls = new ListSelector();
        String stringToList = ls.ListSelector(Arrays.asList("Egy", "Kettő", "Három", "Négy", "Öt", "Hat", "Hét"));
        System.out.println(stringToList);
    }
}
