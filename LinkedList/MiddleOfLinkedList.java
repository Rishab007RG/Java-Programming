package LogicsProgram.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(11);
        list.add(23);
        list.add(33);
        list.add(45);
        list.add(58);
//        list.add(6);
        System.out.println(list.get(list.size()/2));

    }
}
