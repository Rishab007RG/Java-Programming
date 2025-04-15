package LogicsProgram.Array_Strings;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int [] arr={4,6,8,3};
        int total=17;
        int[] result=threeSum(arr,total);
        System.out.println(result[0]+" "+result[1]+" "+result[2]);
    }
    public static int[] threeSum(int[] arr,int total){

        for (int arr1:arr){
            for(int arr2:arr){
                for (int arr3:arr){
                    if(total==arr1+arr2+arr3){
                        return new int[]{arr1,arr2,arr3};
                    }
                }
            }
        }
        return new int[]{};
    }
}
