package stringbuilder;

public class Palindrome {

    public boolean isPalindrome(String word){
        if (word==null){
            throw new NullPointerException("Mark must not be null!");
        }
        StringBuilder pali = new StringBuilder();
        pali.append(word);
        pali.reverse();
        return word.equals(pali.toString());
    }


    public static void main(String[] args) {
        String s="level";
        Palindrome palindrome = new Palindrome();
        System.out.println(s+" is "+ (palindrome.isPalindrome(s)? "palindrome.":"not palindrome."));
    }

}