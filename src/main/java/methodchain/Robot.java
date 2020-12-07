package methodchain;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    public int distance = 0;
    public int azimut = 0;
    List<Robot> robots = new ArrayList<>();

    public Robot go(int meter) {
        this.distance = this.distance + meter;
        return this;
    }

    public Robot rotate(int angle) {
        this.azimut = this.azimut + angle;
        return this;
    }

    public int getDistance() {
        return distance;
    }

    public int getAzimut() {
        return azimut;
    }

    // A szorgalmit új objektum nélkül valósítottam meg,
    // tekintettel hogy az új objektum ugyanolyan adatokat tárolna, mint a mostani;
    // Nem az volt a feladat, de szebb megoldás lett volna ha a go és rotate metódusok
    // hívják meg a registerNavigationPoint() metódust, autómatizálva a nav.pont rögzítést.
    // Sokat szövegelek, aki ezt elolvassa, jelentkezhet nálam egy ajándék Bounty csokira!

    public Robot registerNavigationPoint() {
        robots.add(new Robot());
        robots.get(robots.size() - 1).distance = this.distance;
        robots.get(robots.size() - 1).azimut = this.azimut;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder xStr=new StringBuilder("[");
        for (Robot x : robots) {
            xStr.append("distance: " + x.distance +
                    " azimut: " + x.azimut + ", ");
        }

        xStr.replace(xStr.length()-2,xStr.length(),"]");
        return xStr.toString();
    }


    public String getNavigationList() {
        return this.toString();
    }

}
