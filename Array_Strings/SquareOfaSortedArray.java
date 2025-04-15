package LogicsProgram.Array_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareOfaSortedArray {
    public static void main(String[] args) {
        int arr[]={5,3,7,1};
        System.out.println(squareOfaSortedArray(arr));
    }
    public static List<Integer> squareOfaSortedArray(int[] arr){
        List<Integer> list=new ArrayList<>();
        int[] array = Arrays.stream(arr).sorted().toArray();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]*array[i]);
        }
        return list;
    }
}
