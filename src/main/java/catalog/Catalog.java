package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        this.catalogItems.add(catalogItem);
    }


    //   public int size(){
    //       return catalogItems.size();
    //   }


    public int getAllPageNumber() {
        int allPageNumber = 0;
        for (CatalogItem x : catalogItems) {
            allPageNumber += x.numberOfPagesAtOneItem();
        }
        return allPageNumber;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> printedLibraryItems = new ArrayList<>();
        for (CatalogItem x : catalogItems) {
            if (x.hasPrintedFeature()) {
                printedLibraryItems.add(x);
            }
        }
        return printedLibraryItems;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> audioLibraryItems = new ArrayList<>();
        for (CatalogItem x : catalogItems) {
            if (x.hasAudioFeature()) {
                audioLibraryItems.add(x);
            }
        }
        return audioLibraryItems;
    }


    public int getFullLength() {
        int fullLength = 0;
        for (CatalogItem x : catalogItems) {
            fullLength += x.fullLengthAtOneItem();
        }
        return fullLength;
    }

    public double averagePageNumberOver(int minLength) {
        if (minLength == 0) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        int length = 0;
        int nrOfLength = 0;
        for (CatalogItem x : catalogItems) {
            if (x.hasPrintedFeature()) {
                if (x.numberOfPagesAtOneItem() >= minLength) {
                    length += x.numberOfPagesAtOneItem();
                    nrOfLength++;
                }
            }
        }
        if (nrOfLength == 0) {
            throw new IllegalArgumentException("No page");
        }
        return (length / nrOfLength);
    }

    public void deleteItemByRegistrationNumber(String regNo) {
        for (CatalogItem x : catalogItems) {
            if (x.getRegistrationNumber().equals(regNo)) {
                catalogItems.remove(x);
                return;
            }
        }
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> founds = new ArrayList<>();
        if (searchCriteria.hasTitle()) {
            for (CatalogItem x : catalogItems) {
                if (x.getTitles().contains(searchCriteria.getTitle())) {
                    if (!founds.contains(x)) {
                        founds.add(x);
                    }
                }
            }

        }
        if (searchCriteria.hasContributor()) {
            for (CatalogItem x : catalogItems) {
                if (x.getContributors().contains(searchCriteria.getContributor())) {
                    if (!founds.contains(x)) {
                        founds.add(x);
                    }

                }
            }

        }
        return founds;
    }
}
