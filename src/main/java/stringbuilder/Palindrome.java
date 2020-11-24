package stringbuilder;

public class Palindrome {

    public boolean isPalindrome(String word){
        if (word==null){
            throw new NullPointerException("Mark must not be null!");
        }
        StringBuilder pali = new StringBuilder();
        pali.append(word.toUpperCase());
        pali.reverse();
        return word.toUpperCase().equals(pali.toString());
    }


    public static void main(String[] args) {
        String s="Level";
        Palindrome palindrome = new Palindrome();
        System.out.println(s+" is "+ (palindrome.isPalindrome(s)? "palindrome.":"not palindrome."));
    }

}