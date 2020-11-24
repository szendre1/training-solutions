package week05d02;

public class ChangeLetter {

    public String ChangeVowels(String adat){
        StringBuilder sbAdat = new StringBuilder("");
        String adat1 = adat.toLowerCase();
        for (int i=0;i<adat1.length();i++) {
            switch (adat1.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u'
                        -> sbAdat.append('*');
                default -> sbAdat.append(adat.charAt(i));
            }
        }
        return sbAdat.toString();
    }

    public static void main(String[] args) {
        String adat = "Hello World!  What do you think, is it OK?";
        ChangeLetter changeLetter = new ChangeLetter();
        System.out.println(adat);
        System.out.println(changeLetter.ChangeVowels(adat));
    }
}
