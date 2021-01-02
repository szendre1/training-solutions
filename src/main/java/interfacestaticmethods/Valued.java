package interfacestaticmethods;

import java.util.List;

public interface Valued {
    public double getValue();

    public static double totalValue(List<Valued> items){
        double sum=0;
        for(Valued x:items){
           sum+= x.getValue();
        }
        return sum;
    }

}
