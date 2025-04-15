package LogicsProgram.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.removeAll(list);
        System.out.println(list+" is empty");
    }
}
