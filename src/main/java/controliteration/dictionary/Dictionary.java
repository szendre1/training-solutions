package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    private List<DictionaryItem> dictionaryItems = new ArrayList<>();

    public void addItem(String word, List<String> translations ){
        for (DictionaryItem newItem : dictionaryItems) {
            if (newItem.getWord().equals(word)){
                newItem.addTranslations(translations);
                return;
            }
        }
        dictionaryItems.add(new DictionaryItem(word,translations));

    }


    public List<String> findTranslations(String word){
        for (DictionaryItem findItem : dictionaryItems) {
            if (findItem.getWord().equals(word)){
                return(findItem.getTranslations());
            }

        }
        return (new ArrayList<>());

    }
}
