package algorithmscount;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTester {

private List<BankAccount> accounts;
private BankAccountCounter bac;

@BeforeEach
    public void setUp() {
    accounts = new ArrayList<>();
    bac = new BankAccountCounter();
    accounts.add(new BankAccount("Black Jack", "12345678", 1000));
    accounts.add(new BankAccount("Joly Jocker", "12345677", 2000));
    accounts.add(new BankAccount("Bill Gates", "12345676", 3000));
    accounts.add(new BankAccount("John Doe", "12345675", 4000));
}


    //BankAccount bankAccount = new BankAccount("Bill Gates", "12345678-12345678-12345678", 1000000);

    @Test
    public void BankAccountTest() {
        BankAccount bankAccount = new BankAccount("Bill Gates", "12345678-12345678-12345678", 1000000);
        assertEquals("Bill Gates", bankAccount.getNameOfOwner());
        assertEquals("12345678-12345678-12345678", bankAccount.getAccountNumber());
        assertEquals(1000000, bankAccount.getBalance());
        accounts.remove(0);

    }

//    @BeforeEach


    @Test
    public void BankCounterTest() {
        assertEquals(3, bac.CountMore(accounts,1999));

    }
}
