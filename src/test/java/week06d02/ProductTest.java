package week06d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {


    @Test
    void getName() {
        Product product1 = new Product("Fish", Category.FROZEN, 10.00);
        assertEquals("Fish",product1.getName());
        assertEquals(10.0,product1.getPrice());
        assertEquals(Category.FROZEN,product1.getCategory());
    }

    @Test
    void getCategory() {
    }

    @Test
    void getPrice() {
    }
}