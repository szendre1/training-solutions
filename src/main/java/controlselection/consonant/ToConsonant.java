package controlselection.consonant;

public class ToConsonant {

    public char convertToConsonant(char karakter) {
        if ("aeiou".indexOf(karakter)!=-1){
            return (char) (karakter+1);
        } else return karakter;
    }
}
