package week10d05;

import java.util.Arrays;

public class Calculator {

    public int findMinSum(int[] arr){
        int MinSum =0;
        Arrays.sort(arr);
        for (int i=0;i<4;i++){
            MinSum +=arr[i];
        }
        System.out.println(MinSum);
       
    return MinSum;
    }
}