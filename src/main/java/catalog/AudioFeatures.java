package catalog;

import java.util.ArrayList;
import java.util.List;

import static catalog.Validators.isBlank;

public class AudioFeatures implements Feature {

    private List<String> composer = new ArrayList<>();
    private int length;
    private List<String> performes = new ArrayList<>();
    private String title;

    public AudioFeatures(String title, int length, List<String> performes) {
        if (isBlank(title)){
            throw new IllegalArgumentException("Érvénytelen cím!");
        }
        if (length<1){
            throw new IllegalArgumentException("Érvénytelen hossz!");
        }

        this.title = title;
        this.length = length;
        this.performes = performes;
    }

    public AudioFeatures(String title, int length, List<String> performes, List<String> composer) {
        this.title = title;
        this.length = length;
        this.composer = composer;
        this.performes = performes;
    }



    @Override
    public List<String> getContributors() {
        List<String > contributors= new ArrayList<>();
        contributors.addAll(composer);
        contributors.addAll(performes);
        return contributors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
}
