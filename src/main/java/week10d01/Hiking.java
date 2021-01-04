package week10d01;

public class Hiking {
    private double latitude;
    private double longitude;
    private double height;

    public Hiking(double latitude, double longitude, double height) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.height = height;
    }

    public Double getPlusElevation(Double... heights) {
        double heightsDif = 0;
        if (heights.length < 2) {
            throw new IllegalArgumentException("Érványtelen paraméterek");
        }
        for (int i = 0; i < heights.length - 1; i++) {
            if (heights[i + 1] > heights[i]) {
                heightsDif += heights[i + 1] - heights[i];
            }
        }
        return heightsDif;
    }

}
