package objectclass;

public class Beer {

    String name;
    int price;

    public Beer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Ezt nekem tudnom kellene?:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Beer beer = (Beer) o;

        if (price != beer.price) return false;
        return name != null ? name.equals(beer.name) : beer.name == null;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + price;
        return result;
    }
}
