package week08d03;

import java.util.*;

public class StringLists {

    public List<String> stringListsUnion(List<String> first, List<String> second) {
        List<String> newList = new ArrayList<>(first);
        newList.addAll(second);
        return new ArrayList<>(new HashSet<>(newList));
    }

}
