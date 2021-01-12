package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public Coordinate findMaximumCoordinate() {
        double latitudeMax = trackPoints.get(0).getCoordinate().getLatitude();
        double longitudeMax = trackPoints.get(0).getCoordinate().getLongitude();
        for (int i = 1; i < trackPoints.size(); i++) {
            if (latitudeMax < trackPoints.get(i).getCoordinate().getLatitude()) {
                latitudeMax = trackPoints.get(i).getCoordinate().getLatitude();
            }
            if (longitudeMax < trackPoints.get(i).getCoordinate().getLongitude()) {
                longitudeMax = trackPoints.get(i).getCoordinate().getLongitude();
            }
        }
        return new Coordinate(latitudeMax,longitudeMax);
    }

    public Coordinate findMinimumCoordinate() {
        double latitudeMin = trackPoints.get(0).getCoordinate().getLatitude();
        double longitudeMin = trackPoints.get(0).getCoordinate().getLongitude();
        for (int i = 1; i < trackPoints.size(); i++) {
            if (latitudeMin > trackPoints.get(i).getCoordinate().getLatitude()) {
                latitudeMin = trackPoints.get(i).getCoordinate().getLatitude();
            }
            if (longitudeMin > trackPoints.get(i).getCoordinate().getLongitude()) {
                longitudeMin = trackPoints.get(i).getCoordinate().getLongitude();
            }
        }
        return new Coordinate(latitudeMin,longitudeMin);
    }

    public double getDistance() {
        double distance = 0.0;
        for (int i = 1; i < trackPoints.size(); i++) {
            distance += trackPoints.get(i - 1).getDistanceFrom(trackPoints.get(i));
        }
        return distance;
    }

    public double getFullDecrease() {
        double decrease = 0.0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i - 1).getElevation() > trackPoints.get(i).getElevation()) {
                decrease += (trackPoints.get(i - 1).getElevation() - trackPoints.get(i).getElevation());
            }
        }
        return decrease;
    }

    public double getFullElevation() {
        double elevation = 0.0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i - 1).getElevation() < trackPoints.get(i).getElevation()) {
                elevation += (trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation());
            }
        }
        return elevation;
    }

    /*
    public double getRectangleArea() {
        double latitudeMin = trackPoints.get(0).getCoordinate().getLatitude();
        double latitudeMax = trackPoints.get(0).getCoordinate().getLatitude();
        double longitudeMin = trackPoints.get(0).getCoordinate().getLongitude();
        double longitudeMax = trackPoints.get(0).getCoordinate().getLongitude();
        for (int i = 1; i < trackPoints.size(); i++) {
            if (latitudeMin > trackPoints.get(i).getCoordinate().getLatitude()) {
                latitudeMin = trackPoints.get(i).getCoordinate().getLatitude();
            }
            if (latitudeMax < trackPoints.get(i).getCoordinate().getLatitude()) {
                latitudeMax = trackPoints.get(i).getCoordinate().getLatitude();
            }
            if (longitudeMin > trackPoints.get(i).getCoordinate().getLongitude()) {
                longitudeMin = trackPoints.get(i).getCoordinate().getLongitude();
            }
            if (longitudeMax < trackPoints.get(i).getCoordinate().getLongitude()) {
                longitudeMax = trackPoints.get(i).getCoordinate().getLongitude();
            }
        }
        return (latitudeMax-latitudeMin)*(longitudeMax-longitudeMin);
    }

     */

    public double getRectangleArea() {
        return (findMaximumCoordinate().getLatitude()-findMinimumCoordinate().getLatitude())
                *
                (findMaximumCoordinate().getLongitude()- findMinimumCoordinate().getLongitude());
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }


}
