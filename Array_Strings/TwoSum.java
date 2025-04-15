package LogicsProgram.Array_Strings;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr={2,7,11,15};
        int sum=22;
        int[] result=twoSum(arr,sum);
        System.out.println(result[0]+" + "+result[1]);
    }
    public static int[] twoSum(int [] arr,int sum){
        for (int arr1:arr){
//            System.out.println(arrValue+" arrayValue");
            for (int arr2:arr){
//                System.out.println(arr2+" arr2");
                int total=arr2+arr1;
                if(total==sum){
                    return new int[]{arr2,arr1};
                }
            }
        }
        return new int[]{};
    }
}
