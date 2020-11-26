package week05d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public int getNumberOfExpired(){
        int counter=0;
        for (Product p:products) {
            if (p.getEndDate().isBefore(LocalDate.now())){
                counter++;
            }
        }
        return counter;
    }
}
