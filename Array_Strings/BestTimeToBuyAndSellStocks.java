package LogicsProgram.Array_Strings;

import java.util.Arrays;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int arr[]={7,4,5,3,6,4};
        System.out.println(bestTimeToBuyAndSellStocks(arr));
    }
    public static int bestTimeToBuyAndSellStocks(int[] arr){
        int greatest=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j]-arr[i]>greatest){
                    greatest=arr[j]-arr[i];
                }
            }
        }
        return greatest;
    }
}
