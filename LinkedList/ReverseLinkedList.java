package LogicsProgram.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
//        System.out.println(list.reversed());
        System.out.println(list.size());
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.println(list.get(i));
        }
    }
}
