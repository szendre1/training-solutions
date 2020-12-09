package inheritanceattributes.order;

import inheritanceattributes.Book;

public class ShippedBook extends Book {

    private int shippingCost;

    public ShippedBook(String title, int price, int shippingCost) {
        super(title, price);
        this.shippingCost=shippingCost;
    }

    public int order(int pieces){
        return purchase(pieces)+shippingCost;
    }

    @Override
    public String toString() {
        return this.getTitle()+":" + price +
                " - " + shippingCost;
    }
}
