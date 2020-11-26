package algorithmscount;

import java.util.List;

public class BankAccountCounter {
    public int CountMore(List<BankAccount> bankAccounts, double limit){
        int counter=0;
        for (BankAccount x:bankAccounts) {
            if (x.getBalance()>limit){
                counter++;
            }
        }
        return counter;
    }

}
