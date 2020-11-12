package teszt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTeszt {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("c");
        s.add("aa");
        s.add("b");
        Collections.sort(s);
        System.out.println(s);

    }


}
