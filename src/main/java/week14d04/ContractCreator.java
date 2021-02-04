package week14d04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContractCreator {

private Contract contract;

    public ContractCreator(String client, List<Integer> monthlyPrices){
        List<Integer> newList = new ArrayList<>(monthlyPrices);
        contract = new Contract(client, monthlyPrices);
    }

    public Contract create(String name){
        Contract contract = new Contract(name,new ArrayList<>(this.contract.getMonthlyPrices()));
        return contract;
    }

    public static void main(String[] args) {
        ContractCreator contractCreator = new ContractCreator("John Doe", new ArrayList<>(Arrays.asList(10,10,10)));
        Contract contact1 = contractCreator.create("Jack Doe");
        Contract contact2 = contractCreator.create("Jane Doe");

        System.out.println(contractCreator);
        System.out.println(contact1);
        System.out.println(contact2);

        contact1.getMonthlyPrices().set(0,20);
        System.out.println(contractCreator);
        System.out.println(contact1);
        System.out.println(contact2);


    }

    @Override
    public String toString() {
        return "ContractCreator{" +
                "contract=" + contract +
                '}';
    }
}
