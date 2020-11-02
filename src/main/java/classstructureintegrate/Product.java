package classstructureintegrate;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void increasePrice(int incPrice) {
        this.price = this.price+incPrice;
    }

    public void decreasePrice(int decPrice) {
        this.price = this.price+decPrice;
    }
}
