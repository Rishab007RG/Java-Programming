package LogicsProgram.LinkedList;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("green");
        list.add("red");
        list.add("Rishab");
//        list.add(40);
//        list.add(50);
        List<String> list2=new LinkedList<>();
        list2.add("Rishab");
        list2.add("red");
        list2.add("green");
        Collections.reverse(list2);

        if(list.equals(list2)){
            System.out.println("Is an Palindrome LinkedList");
        }else {
            System.out.println("Is not an Palindrome LinkedList");

        }
    }
}
