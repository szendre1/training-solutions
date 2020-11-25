package algorithmsmax;

import java.util.ArrayList;
import java.util.List;

public class SalepersonMain {

    public static void main(String[] args) {
        List<Salesperson> spList = new ArrayList<>();
        spList.add(new Salesperson("Black Jack",1000,5000));
        spList.add(new Salesperson("Old Joe",5000,6000));
        spList.add(new Salesperson("Bill Gates",8500,7000));
        spCalc spCalc1 = new spCalc();
        Salesperson sp = spCalc1.bigArbevetel(spList);
        System.out.println(sp.getName()+" "+sp.getAmount()+" "+sp.getTarget());
        sp = spCalc1.bigAlatta(spList);
        System.out.println(sp.getName()+" "+sp.getAmount()+" "+sp.getTarget());
        sp = spCalc1.bigFelette(spList);
        System.out.println(sp.getName()+" "+sp.getAmount()+" "+sp.getTarget());


    }
}
