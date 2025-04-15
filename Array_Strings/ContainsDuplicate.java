package LogicsProgram.Array_Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length");
        int length=sc.nextInt();
        int arr[]=new int[length];
        System.out.println("Enter the array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] num){
        List<Integer> list=new ArrayList();
        for (int num1:num){
            if(list.contains(num1)){
                return true;
            }
            list.add(num1);
        }
        return false;
    }
}
