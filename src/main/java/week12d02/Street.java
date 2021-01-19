package week12d02;

import java.util.ArrayList;
import java.util.List;

public class Street {
    private List<Site> sites = new ArrayList<>();

    public void sellSite(Site site) {
        sites.add(site);
    }

    public int lastSell() {
        Site lastSite = sites.get(sites.size() - 1);
        int siteNumber = 0;
        if (lastSite.getOddEven().equals("0")) {
            siteNumber = 0;
        } else {
            siteNumber = -1;
        }
        for (Site curSite : sites) {
            if (lastSite.getOddEven().equals(curSite.getOddEven())) {
                siteNumber += 2;
            }

        }
        return siteNumber;
    }

    public List<FencesStat> statistic() {
        List<FencesStat> fencesStats = new ArrayList<>();
        boolean found = false;
        for (Site curSite : sites) {
            for (FencesStat fs:fencesStats){
                if (fs.getFence().equals(curSite.getFence())){
                    fs.setFenceCount();
                    found = true;
                }
            }
            if (!found){
                fencesStats.add(new FencesStat(curSite.getFence()));
            }
        }
        return fencesStats;
    }
}
