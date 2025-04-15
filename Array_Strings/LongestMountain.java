package LogicsProgram.Array_Strings;

import java.util.ArrayList;
import java.util.List;

public class LongestMountain {
    public static void main(String[] args) {
        int [] arr={2, 1, 4, 7, 3, 2, 5};
        System.out.println(longestMountain(arr));
    }
    public static int longestMountain(int[] arr){
        List<Integer> list=new ArrayList();
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]> arr[i-1] && arr[i]>arr[i+1]){
                int left=i;
                int right=i;
                while(arr[left-1]<arr[left] && left>0){
                    list.add(arr[left-1]);
                    left--;

                }
                while(arr[right]>arr[right+1] && right<arr.length-1){
                    list.add(right+1);

                    right++;
                }
                list.add(arr[i]);
            }
        }
        return list.size();
    }
}
