package week06d03;

public class WordEraserRecursive {
    public String earseWord(String words, String word){
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
        if (foundWord>-1){
            buildWords.delete(foundWord,foundWord+word.length()-1);
            WordEraserRecursive we = new WordEraserRecursive();
            //    Ez miért nem jó?
            buildWords= new StringBuilder(we.earseWord(buildWords.toString(),word));

//            String words2=we.earseWord(buildWords.toString(),word);
//            buildWords.delete(0,buildWords.length());
//            buildWords.append(words2);
        }
        buildWords.deleteCharAt(0);
        buildWords.deleteCharAt(buildWords.length()-1);
        return buildWords.toString();
    }
}
