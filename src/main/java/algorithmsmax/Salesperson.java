package algorithmsmax;

public class Salesperson {
    private String name;
    private double amount;
    private double target;

    public Salesperson(String name, double amount, double target) {
        this.name = name;
        this.amount = amount;
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public double getTarget() {
        return target;
    }
}
