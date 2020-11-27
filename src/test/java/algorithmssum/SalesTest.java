package algorithmssum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesTest {

        private List<Salesperson> salespersonList;

     //   private BankAccountCounter bac;

        @BeforeEach
        public void setUp() {
            salespersonList = new ArrayList<>();
            salespersonList.add(new Salesperson("Black Jack",1_000_000));
            salespersonList.add(new Salesperson("Old Joe",2_000_000));
            salespersonList.add(new Salesperson("Joly Jocker",3_000_000));
            salespersonList.add(new Salesperson("Bill Gates",4_000_000));
        }


        @Test
        public void SalesPersonTest() {
            assertEquals("Black Jack", salespersonList.get(0).getNane());
            assertEquals(1000000, salespersonList.get(0).getAmount());
        }

//    @BeforeEach


        @Test
        public void SalesSumtest() {
            assertEquals(10000000,new Sales().SalesCount(salespersonList));
        }
    }
