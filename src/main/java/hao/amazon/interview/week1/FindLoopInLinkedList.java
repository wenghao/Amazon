package hao.amazon.interview.week1;

import java.util.HashMap;

/**
 * Created by HWENG on 1/10/2016.
 */
public class FindLoopInLinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }

    public static void main(String [] args){
        System.out.println("Application starts...");

        FindLoopInLinkedList findLoopInLinkedList = new FindLoopInLinkedList();
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);

        first.next = second;
        second.next = third;
        third.next = four;
        four.next = second;

        int foundIt = findLoopInLinkedList.findLoop(first);

        if(foundIt !=0){
            System.out.println("You have found a loop. The starting node of the loop is in position " + foundIt +
                    " .\nFor your reference, the head node is starting at position 1.");
        }else{
            System.out.println("There is no loop in this linked list.");
        }
    }

    public int findLoop(Node head){
        HashMap<Node,Integer> hm = new HashMap<Node,Integer>();
        int count = 1;
        while(head != null){
            if(hm.containsKey(head)){
                return hm.get(head);
            }else{
                hm.put(head,count++);
            }
            head =head.next;
        }
        return 0;
    }
}
