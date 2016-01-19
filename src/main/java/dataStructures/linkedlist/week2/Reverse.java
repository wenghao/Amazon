package dataStructures.linkedlist.week2;

/**
 * Created by HWENG on 1/16/2016.
 */
public class Reverse {

    public static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }

    public static void main(String[]args){
        System.out.println("Application starts...");

        Reverse reverse = new Reverse();

        Node first = new Node(1);
        Node second = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);

        first.next = second;
        second.next = three;
        three.next = four;
        four.next = five;
        Node head = first;

        Node reversedList = reverse.ReverseList(head);

        if(reversedList != null){
            while(reversedList != null){
                System.out.println("The node contains value " + reversedList.data);
                reversedList = reversedList.next;
            }
        }else{
            System.out.println("The list is empty.");
        }
    }

    public Node ReverseList(Node head){
        if(head == null){
            return null;
        }

        if(head.next == null){
            return head;
        }

        Node prev = null;
        Node next = null;
        Node current = head;

        while(current!= null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        return head;
    }
}
