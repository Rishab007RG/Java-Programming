package LogicsProgram.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReverseLinkedList_2 {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(swapping(list));
    }
    static List<Integer> swapping(List list){
        Scanner sc=new Scanner(System.in);
        System.out.println("The list is of length "+list.size()+" Enter the index value to be swapped");
        int node1=sc.nextInt();
        int node2=sc.nextInt();
        Object temp=list.get(node1);
        list.set(node1,list.get(node2));
        list.set(node2,temp);
        return list;
    }
}
