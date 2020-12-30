package catalog;

public class SearchCriteria {
    private String contributor;
    private String title;

    public SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public static SearchCriteria createByBoth(String title, String contributor) {
        if (contributor==null){
            throw new IllegalArgumentException("Bad contributor");
        }
        if (title==null){
            throw new IllegalArgumentException("Bad title");
        }
        SearchCriteria sc = new SearchCriteria(contributor, title);
        return sc;
    }

    public static SearchCriteria createByContributor(String contributor) {
        if (contributor==null){
            throw new IllegalArgumentException("Bad contributor");
        }
        SearchCriteria sc = new SearchCriteria(contributor, "");
        return sc;
    }

    public static SearchCriteria createByTitle(String title) {
        if (title==null){
            throw new IllegalArgumentException("Bad title");
        }
        SearchCriteria sc = new SearchCriteria("", title);
        return sc;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    public boolean hasContributor() {
        if (contributor.isBlank()||contributor.equals("")){
            return false;
        }
        return true;
    }

    public boolean hasTitle() {
        if (title.isBlank()||title.equals("")){
            return false;
        }
        return true;}



}
