package week07d03;

import java.util.List;

public class NumberList {

    public boolean isIncreasing(List<Integer> x){
        int currentX=x.get(0);
        for(int y:x){
            if (y < currentX){
                return false;
            }
            currentX=y;
        }
        return true;
    }

}
