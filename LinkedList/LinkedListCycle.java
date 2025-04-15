package LogicsProgram.LinkedList;


public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node1;
        boolean result=cycleList(node1);
        String value=result?"":"not ";
        System.out.println("The current LinkedList is "+value+"a LinkedListCycle");
    }
    public static boolean cycleList(ListNode node1){
        if(node1==null || node1.next==null)return false;
        ListNode head=node1;
        ListNode node=node1;
        while (node.next!=null && node!=null){
            node=node.next;
            if(node.next==head)return true;
        }
        return false;
    }
}

class ListNode{
    int x;
    ListNode next;
    ListNode(int x){
        this.x=x;
    }
}
