package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {
    private String registrationNumber; //readOnly
    private int price; // readOnly
    private List<Feature> features = new ArrayList<>();

    public CatalogItem(String registrationNumber, int price, Feature ...features) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.features= new ArrayList<>(Arrays.asList(features));
    }



    public List<String> getContributors(){
        List<String> contributors= new ArrayList<>();
        for (Feature x:features){
            contributors.addAll(x.getContributors());
        }
        return contributors;
    }

    public List<String> getTitles(){
        List<String> titles= new ArrayList<>();
        for (Feature x:features){
            titles.add(x.getTitle());
        }
        return titles;
    }

    public boolean hasAudioFeature(){
        for (Feature x:features){
            if (x.getClass()== AudioFeatures.class){
                return true;
            }
          //  System.out.println(x.getClass());
        }
        return false;
    }

    public boolean hasPrintedFeature(){
        for (Feature x:features){
            if (x.getClass()== PrintedFeatures.class){
                return true;
            }
            //  System.out.println(x.getClass());
        }
        return false;
    }

    public int numberOfPagesAtOneItem(){
        int pagesAll=0;
        for (Feature x:features){
            if (x.getClass()== PrintedFeatures.class){
                pagesAll+=((PrintedFeatures) x).getNumberOfPages();
            }
        }
        return pagesAll;
    }

    public int fullLengthAtOneItem(){
        int lengthAll=0;
        for (Feature x:features){
            if (x.getClass()== AudioFeatures.class){
                lengthAll+=((AudioFeatures) x).getLength();
            }
        }
        return lengthAll;
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getPrice() {
        return price;
    }

    public List<Feature> getFeatures() {
        return features;
    }
}
