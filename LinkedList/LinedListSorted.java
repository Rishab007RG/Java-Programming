package LogicsProgram.JavaProgramming;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinedListSorted {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(220);
        list.add(3440);
        list.add(40);
        list.add(10);
//        Collections.sort(list);
//        System.out.println(list);
        System.out.println(sorting(list));
    }
    static List<Integer> sorting(List<Integer> list){
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-1-i; j++) {
                if(list.get(j)>list.get(j+1)){
                    int temp=list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }

        return list;
    }

}
