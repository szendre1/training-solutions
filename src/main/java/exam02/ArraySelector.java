package exam02;

public class ArraySelector {

    public String selectEvens(int[] myArray){
        if (myArray.length==0){
            return "";
        }
        String myStr="[";
        for (int i=0;i< myArray.length;i+=2){
            myStr +=myArray[i]+", ";
        }
        //myStr= myStr.replace((char) (myStr.length() - 2), ']');
        myStr = myStr.substring(0,myStr.length() - 2);
        myStr +="]";
        return myStr;
    }

}
