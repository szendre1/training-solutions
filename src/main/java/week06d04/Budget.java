package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {
    List<Item> mylist = new ArrayList();

    public Budget(List<Item> mylist) {
        this.mylist = mylist;
    }

    public List<Item> getItemsByMonth(int month){
        List<Item> monthList = new ArrayList();
        for (Item x:mylist){
            if (x.getMonth()==month){
                monthList.add(x);
            }
        }
        return monthList;
    }
}
