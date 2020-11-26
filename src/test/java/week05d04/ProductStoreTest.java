package week05d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProductStoreTest {

    @Test
    public void ProductTest() {
        Product product = new Product("Butter",2020,11,15);
        Store store = new Store();
        store.addProduct(product);
        store.addProduct(new Product("Bred",2020,11,28));
        store.addProduct(new Product("Apple",2020,11,25));
        store.addProduct(new Product("Pear",2020,11,29));


        assertEquals(2, store.getNumberOfExpired());

    }






}
