package LogicsProgram.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(100);
        list.add(2550);
        list.add(330);
        list.add(470);
        list.add(770);
        List<Integer> list2=new LinkedList<>();
        list2.add(40);
        list2.add(20);
        list2.add(3);
        list2.add(400);
        list2.add(100);
        list.addAll(list2);
        Collections.sort(list);
        System.out.println(list);
    }
}
