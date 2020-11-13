package week03;

public class Operation {
    private int leftValue ;
    private int rigghtValue;

    public Operation(String value) {
        this.leftValue = Integer.parseInt(value.substring(0,value.indexOf("+")).toString());
        this.rigghtValue = Integer.parseInt(value.substring(value.indexOf("+")+1)) ;
    }

    public int getResult(){
        return leftValue+rigghtValue;
    }

    public static void main(String[] args) {
        Operation operation = new Operation("10+20");
        System.out.println(operation.getResult());
    }

}
