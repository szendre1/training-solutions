package controlselection.accents;

public class WithoutAccents {


    public char convertToCharWithoutAccents(char karakter) {
        String oldChar = "áéíóöőúüűÁÉÍÓÖŐÚÜŰ";
        String newChar = "aeiooouuuAEIOOOUUU";
        int l = oldChar.indexOf(karakter);
        if (l!=-1){
            return newChar.charAt(l);
        } else return karakter;
    }
}
