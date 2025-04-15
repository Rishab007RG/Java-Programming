package LogicsProgram.Array_Strings;

import java.util.Arrays;
import java.util.Scanner;

//public class MissingNumber {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the length of the array");
//        int length=sc.nextInt();
//        int arr[]=new int[length];
//        System.out.println("Enter the array value");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=sc.nextInt();
//        }
//        System.out.println(missingNumber(arr));;
//    }
//    public static String missingNumber(int [] arr){
//        int num=0;
//        for(int arr2:arr){
//            if(num!=arr2){
//                break;
//            }num++;
//        }
//        return num==0?"no missing number":"the missing number is: "+num;
//
//    }
//}


public class MissingNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array lenght");
        int arrLength=sc.nextInt();
        int arr[]=new int[arrLength];
        System.out.println("Enter the array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        missingNumber(arr);
    }
    public static void missingNumber(int[] arr){
        int arrLowest= Arrays.stream(arr).min().getAsInt(); //New thing learnt
        int actualLength=0;
        int expectedLength=0;
        for (int i = 0; i <= arr.length; i++) {
            expectedLength+=arrLowest;
            arrLowest++;
        }
        for(int num:arr){
            actualLength+=num;
        }
        System.out.println(expectedLength-actualLength);
    }
}

