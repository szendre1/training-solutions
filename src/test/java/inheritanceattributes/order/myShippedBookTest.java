package inheritanceattributes.order;

import inheritanceattributes.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class myShippedBookTest {
    @Test
    public void purchaseTest() {
        //Given
        Object book = new ShippedBook("Gyűrűk ura", 3000, 1200);
        //Then
        assertEquals(6000, book.purchase(2));
        assertEquals(7200, book.order(2));
    }
}
