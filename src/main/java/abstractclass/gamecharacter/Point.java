package abstractclass.gamecharacter;

public abstract class Point {
    private double x;
    private double y;

    public double distance(double x, double y ){
        return Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2));
    }

}
