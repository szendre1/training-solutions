package interfacedefaultmethods.print;

public class Printer {

    public String print(Printable prepare){
        StringBuilder edited = new StringBuilder();
        for (int x=0;x<prepare.getLength();x++){
            if (!prepare.getColor(x).equals("#000000")){
                edited.append("["+prepare.getColor(x)+"]"); //color
            }
            edited.append(prepare.getPage(x)+"\n");
        }
        return edited.toString();
    }
}
