package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {
    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public int numberOfTrackActivities() {
        int numberOf = 0;
        for (Activity i : activities) {
            if (i instanceof ActivityWithTrack) {
                numberOf++;
            }
        }
        return numberOf;
    }

    public int numberOfWithoutTrackActivities() {
        int numberOf = 0;
        for (Activity i : activities) {
            if (i instanceof ActivityWithoutTrack) {
                numberOf++;
            }
        }
        return numberOf;
    }

    public List<Report> distancesByTypes() {
        List<Report> report = new ArrayList<>();
        int distance = 0;
        for (ActivityType currType : ActivityType.values()) {
            distance = 0;
            for (Activity currAct : activities) {
                if (currAct.getType().equals(currType)) {
                    distance += currAct.getDistance();
                }
            }
            report.add(new Report(currType, distance));
        }
        return report;
    }

}
