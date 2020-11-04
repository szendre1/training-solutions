package week02;

public class ProductMain {
    public static void main(String[] args) {
        Product firstProduct = new Product("Ajtó","0001");
        Product secondProduct = new Product("Ablak","0002");
        Product thirdProduct = new Product("Ajtó","0003");
        System.out.println("Egyenlő nevű termékek: "+firstProduct.areTheyEqual(secondProduct));
        System.out.println("Egyenlő nevű termékek: "+firstProduct.areTheyEqual(thirdProduct));


    }
}
