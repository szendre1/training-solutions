package controliteration.pi;

public class PiMain {
    public static void main(String[] args) {
        String piVers1 ="Nem a régi s durva közelítés Mi szótól szóig így kijön Betűiket számlálva... Ludolph eredménye már, Ha itt végezzük húsz jegyen. De rendre kijő még tíz pontosan. Azt is bízvást ígérhetem.";
        String piVers2 = "Ezt a kört a pível számítsad ki!";
        String piSzam = "";
        int szoHossz=0;
        //int stringPointer =0;

        for (int stringPointer = 0; stringPointer < piVers1.length() ; stringPointer++) {
            switch (piVers1.charAt(stringPointer)) {
                case ' ','.','!',',' -> {
                    if (szoHossz>0) {
                        piSzam += szoHossz;
                        szoHossz=0;
                        if (piSzam.equals("3")){
                            piSzam += ".";
                        }
                    }
                }
                default -> { szoHossz ++ ; }
            }

        }
        System.out.println(piSzam);


        piSzam = "";
        szoHossz=0;
        for (int stringPointer = 0; stringPointer < piVers2.length() ; stringPointer++) {
            switch (piVers2.charAt(stringPointer)) {
                case ' ','.','!',',' -> {
                    if (szoHossz>0) {
                        piSzam += szoHossz;
                        szoHossz=0;
                        if (piSzam.equals("3")){
                            piSzam += ".";
                        }
                    }
                }
                default -> { szoHossz ++ ; }
            }

        }
        System.out.println(piSzam);

        System.out.println(Math.PI);
    }







}
