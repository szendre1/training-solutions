package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] weekDays = {"Hetfő", "Kedd", "Szerda", "Csütörtök","Péntek","Szombat","Vasárnap"};
        System.out.println(weekDays[1]);
        int[] hatvanyok = new int[5];
        for (int i = 0; i <5 ; i++) {
            hatvanyok[i] = (i+1)*(i+1);
        }

        for (int i:hatvanyok) {
            System.out.print((i)+" ");
        }
        System.out.println();

        Boolean[] logikai = {false,true,false,true,false,true};
        for (boolean x:logikai) {
            System.out.print(x+" ");
        }
        System.out.println();








    }
}
