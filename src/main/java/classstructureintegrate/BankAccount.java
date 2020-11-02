package classstructureintegrate;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String owner, String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int deposit) {
        this.balance = this.balance+deposit;
    }

    public void withdraw(int withdraw) {
        this.balance = this.balance-withdraw;
    }

    public void transfer(BankAccount to, int transfer) {  // hát ezt lesnem kellett!
        this.balance = this.balance-transfer;
        to.deposit(transfer);
    }

    public String getInfo(){
        return (this.owner+" ("+this.accountNumber+"): "+this.balance);
    }

    public String getOwner() {
        return owner;
    }
}
