package week12d02;

public class Site {
    private String oddEven;
    private double length;
    private Fence fence;

    public Site(String oddEven, double length, Fence fence) {
        this.oddEven = oddEven;
        this.length = length;
        this.fence = fence;
    }

    public String getOddEven() {
        return oddEven;
    }

    public double getLength() {
        return length;
    }

    public Fence getFence() {
        return fence;
    }
}
