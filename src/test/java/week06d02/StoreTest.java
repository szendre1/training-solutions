package week06d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    void main() {

        Product product1 = new Product("Fish", Category.FROZEN, 10.00);
        Product product2 = new Product("Fish", Category.FROZEN, 10.00);
        Product product3 = new Product("Fish", Category.FROZEN, 10.00);
        List<Product> products = new ArrayList<>(Arrays.asList(product1, product2, product3,
                new Product("Bread1", Category.BAKEDGOODS, 10.00),
                new Product("Bread2", Category.BAKEDGOODS, 10.00)
        ));
        Store store = new Store(products);
        assertEquals(2,store.getProductByCategoryName(Category.BAKEDGOODS));

    }

}