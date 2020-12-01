package week06d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public Store(List<Product> products) {
        this.products = products;
    }

    public int getProductByCategoryName(Category category) {
        int counter = 0;
        for (Product x : products) {
            if (x.getCategory().equals(category)) {
                counter++;
            }
        }
        return counter;
    }

    // MAIN ******************************************************************************
    public static void main(String[] args) {
        Product product1 = new Product("Fish", Category.FROZEN, 10.00);
        Product product2 = new Product("Fish", Category.FROZEN, 10.00);
        Product product3 = new Product("Fish", Category.FROZEN, 10.00);
        List<Product> products = new ArrayList<>(Arrays.asList(product1, product2, product3,
                new Product("Bread1", Category.BAKEDGOODS, 10.00),
                new Product("Bread2", Category.BAKEDGOODS, 10.00)
        ));
        Store store = new Store(products);
        System.out.println(store.getProductByCategoryName(Category.BAKEDGOODS));
    }


}