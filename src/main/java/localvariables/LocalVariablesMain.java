package localvariables;

public class LocalVariablesMain {

    public static void main(String[] args) {
        boolean b;
        b=true;
        System.out.println(b);
        int a =2;
        int i = 3, j =4;
        int k=i;
        String s="Hello World";
        String t=s;

        {
            int x=8;
            System.out.println("Blokkon belül az X:"+x);
            System.out.println("Blokkon kívül: i:"+i+" j:"+j+" k:"+k+" "+s);
        }

    }




}
