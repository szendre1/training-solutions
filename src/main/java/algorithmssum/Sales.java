package algorithmssum;

import java.util.List;

public class Sales {
    public long SalesCount(List<Salesperson> salesList){
        long saleSum=0;
        for (Salesperson s:salesList){
            saleSum=saleSum+s.getAmount();
        }

        return saleSum;
    }
}
