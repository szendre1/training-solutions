package week14d04;

import java.util.List;

public class Contract {
    private String Client;
    List<Integer> monthlyPrices;

    public Contract(String client, List<Integer> monthlyPrices) {
        Client = client;
        this.monthlyPrices = monthlyPrices;
    }

    public String getClient() {
        return Client;
    }

    public void setClient(String client) {
        Client = client;
    }

    public List<Integer> getMonthlyPrices() {
        return monthlyPrices;
    }

    public void setMonthlyPrices(List<Integer> monthlyPrices) {
        this.monthlyPrices = monthlyPrices;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "Client='" + Client + '\'' +
                ", monthlyPrices=" + monthlyPrices +
                '}';
    }
}
