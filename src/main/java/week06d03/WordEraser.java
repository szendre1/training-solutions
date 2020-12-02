package week06d03;

public class WordEraser {
    public String eraserWord(String words, String word){
        if (words==null){
            throw new IllegalArgumentException("Hibás az első kifejezés!");
        }
        if (word == null) {
            return words;
        }
        if (word.trim()=="") {
            return words;
        }

        StringBuilder buildWords = new StringBuilder(words);
        buildWords.insert(0,' ');
        buildWords.insert(buildWords.length(),' ');
        word=" "+word.trim()+" ";
        int foundWord = buildWords.indexOf(word);
        while (foundWord>-1){
            buildWords.delete(foundWord,foundWord+word.length()-1);
            foundWord = buildWords.indexOf(word);
        }
        buildWords.deleteCharAt(0);
        buildWords.deleteCharAt(buildWords.length()-1);
        return buildWords.toString();
    }

}
