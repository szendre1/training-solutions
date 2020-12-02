package immutable;



public class CelestialCoordinates {
    private int x;
    private int y;
    private int z;

    public CelestialCoordinates(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString(){
        String s= "CelestialCoordinates: x="+x+", y="+y+", z="+z;
        return s;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
