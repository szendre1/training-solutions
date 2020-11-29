package formatlocaleprintf;

public class PrintFormat {

    public String checkException(String formatString, Integer i, Integer j) {
        int x = 0;
        int paramcount = 0;
        while (!(formatString.indexOf("%", x) == -1)) {
            paramcount++;
            x = formatString.indexOf("%", x) + 1;
        }
        if (paramcount<=2) {
            return String.format(formatString, i, j);
        } else {
            throw new IllegalArgumentException("Less objects then expected in format String!");
        }


    }

    public String printFormattedText(Double number){
        return String.format("Total is: %,.2f Ft",number);
    }

    public String printFormattedText(int count, String fruit){
        return String.format("We counted %d %s in the basket",count,fruit);
    }

    public String printFormattedText(int number){
        return String.format("Right edge of numbers set at 4 spaces from text:%4d",number,number);
    }


    public String printFormattedText(Integer i, Integer j, Integer k){
        return String.format("Multiple objects containing text:%d\t%d\t%d",i,j,k);
    }


}