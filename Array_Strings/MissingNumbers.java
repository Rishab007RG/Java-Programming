package LogicsProgram.Array_Strings;

import java.util.*;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length");
        int arrLength=sc.nextInt();
        int arr[]=new int[arrLength];
        System.out.println("Enter the array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        missingNumbers(arr);
    }
    public static void missingNumbers(int[] arr){
        int arrLowest= Arrays.stream(arr).min().getAsInt(); //New thing learnt
        int arrHighest=Arrays.stream(arr).max().getAsInt();
        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i < arrHighest; i++) {
            list1.add(arrLowest);
            arrLowest++;
        }
        System.out.println(list1+" list 1");
        List<Integer> list2=new ArrayList<>();
        for(int num:arr){
            list2.add(num);
        }
        System.out.println(list2+" list 2 before remove");
        list1.removeAll(list2);
        System.out.println(list1.toString());
    }
}
