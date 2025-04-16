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
        list.add("red");
        list.add("green");
//        list.add(40);
//        list.add(50);
        List<String> list2=new LinkedList<>();
        for (int i = list.size()-1; i >=0; i--) {
            list2.add(list.get(i));
        }
        boolean flag=true;
        if(list.size()==list2.size()){
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i)==list2.get(i)){
                }else {
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("The LinkedList is a palindrome");
        }else {
            System.out.println("The LinkedList is not a palindrome");
        }

    }
}
