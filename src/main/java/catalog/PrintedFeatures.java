package catalog;

import java.util.ArrayList;
import java.util.List;

import static catalog.Validators.isBlank;
import static catalog.Validators.isEmpty;

public class PrintedFeatures implements Feature{


    private String title;
    private int numberOfPages;
    private List<String> authors = new ArrayList<>();

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if (isBlank(title)){
            throw new IllegalArgumentException("Empty title");
        }
        if (numberOfPages<1){
            throw new IllegalArgumentException("Érvénytelen hossz!");
        }
        if (isEmpty(authors)){
            throw new IllegalArgumentException("Empty title");
        }
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    @Override
    public List<String> getContributors() {
        List<String > contributors= new ArrayList<>();
        contributors.addAll(authors);
        return contributors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
