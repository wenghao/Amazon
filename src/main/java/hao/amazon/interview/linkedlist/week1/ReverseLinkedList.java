package hao.amazon.interview.linkedlist.week1;

/**
 * Created by HWENG on 1/13/2016.
 */
public class ReverseLinkedList {
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
         ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Node linkedList = reverseLinkedList.reverseList(head);

        while(linkedList!=null){
            System.out.println("This node contains " + linkedList.data);
            linkedList = linkedList.next;
        }
    }

    public Node reverseList(Node head){
        if(head==null){
            return null;
        }
        Node next=null;
        Node prev=null;
        Node current = head;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
}
