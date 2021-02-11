package week15d04;

public class Covid {
    //private String dateRep;
    private String year_week;
    private int cases_weekly;


    public Covid(String year_week, int cases_weekly) {
        this.year_week = year_week;
        this.cases_weekly = cases_weekly;
    }

    public String getYear_week() {
        return year_week;
    }

    public int getCases_weekly() {
        return cases_weekly;
    }

    @Override
    public String toString() {
        return "Covid{" +
                "year_week='" + year_week + '\'' +
                ", cases_weekly=" + cases_weekly +
                '}';
    }
}
