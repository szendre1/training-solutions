package statements;

public class Investment {
    private double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        active = true;
    }

    public double getYield(int days) {
        return( (fund*interestRate/100)/365*days);
    }

    public double getCost() {
        return cost;
    }

    public int getFund() {
        return fund;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public boolean isActive() {
        return active;
    }

    public double close(int day) {
        if (!active) { return 0;}
        else{
            active = false;

            return ((fund+getYield(day))-(fund+(getYield(day)))/100*cost);
        }




    }
}
