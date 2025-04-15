package LogicsProgram.Array_Strings;

import java.util.ArrayList;
import java.util.List;

public class NumbersSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int [] arr={20,7,11,15};
        List<Integer> list=numbersSmallerThanTheCurrentNumber(arr);
        System.out.println(list);
    }
    public static List<Integer> numbersSmallerThanTheCurrentNumber(int [] arr){
        List<Integer> list=new ArrayList<>();
        int count=0;
        for (int arr1:arr){
            for (int arr2:arr){
                if(arr2<arr1){
                    count++;
                }
            }
            list.add(count);
            count=0;
        }
        return list;
    }
}
