package week10d02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxTravel {

    public Integer getMaxIndex(List<Integer> personUpParam) {
        List<Integer> personUP = new ArrayList<>(personUpParam);
        Collections.sort(personUP);
        Integer currentx = personUP.get(0);
        Integer maxNr = 0;
        Integer maxEqualsCount = 0;
        Integer equalsCount = 0;
       for (int i = 0; i < personUP.size(); i++) {
            if (currentx == personUP.get(i)) {
                equalsCount++;
        } else {
                if (maxEqualsCount < equalsCount) {
                    maxEqualsCount = equalsCount;
                    maxNr = personUP.get(i - 1);
                }
                equalsCount = 1;
                currentx = personUP.get(i);
            }
        }
        if (maxEqualsCount < equalsCount) {
            maxEqualsCount = equalsCount;
            maxNr = personUP.get(personUP.size()-1);
        }
        return maxNr;
    }
}
