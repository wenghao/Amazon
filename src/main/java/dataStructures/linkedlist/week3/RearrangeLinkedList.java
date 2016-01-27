package dataStructures.linkedlist.week3;

import com.sun.org.apache.regexp.internal.RE;
import sun.awt.image.ImageWatched;

/**
 * Created by HWENG on 1/24/2016.
 */
public class RearrangeLinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int d) {
        data = d;
        next = null;
        }
    }

    public static void main(String[]args){
        System.out.println("Application starts...");

        RearrangeLinkedList RLinkedList = new RearrangeLinkedList();
        Node first = new Node(1);
        Node second = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);

        first.next = second;
        second.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        Node head = first;

        Node LinkedList = RLinkedList.RearrangeList(head);
        while(LinkedList!=null){
            System.out.println("The node contains " + LinkedList.data);
            LinkedList = LinkedList.next;
        }

    }

    public Node RearrangeList(Node head){

        Node current = head;

        //find the midpoint and split the list into two
        Node A = head;
        Node B = head;
        Node Midpoint = null;
        while(B != null){
            if(B.next.next==null){
                Midpoint = A.next;
                A.next = null;
                A = head;
                break;
            }
            A = A.next;
            B = B.next.next;
        }


        //Reverse the second half of the list
        current = Midpoint;
        Node prev = null;
        Node next = null;

        while(current!=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        Node ReverseList = prev;

        Node newList = A;
        Node temp = null;
        Node temp1 = null;
        while(newList != null){
            if(ReverseList == null){
                break;
            }else{
                temp = newList.next;
                temp1 = ReverseList;
                newList.next = temp1;
                temp1.next = temp;
            }

            newList = newList.next.next;
            ReverseList = ReverseList.next;
        }

        return A;

    }


}
