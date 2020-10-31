package classsctructureconstructors;

public class Store {
    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
        this.stock = 0;
    }

    public void store(int stock){
        this.stock=this.stock+stock;
    }

    public void dispatch(int dispatch){
        this.stock=this.stock-dispatch;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }
}
