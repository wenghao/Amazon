package dataStructures.linkedlist.week2;

/**
 * Created by HWENG on 1/16/2016.
 */
public class InsertFromEnd {

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

        InsertFromEnd insertFromEnd = new InsertFromEnd();

        Node first = new Node(1);
        Node second = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node head = first;
        int insertValue = 100;
        Node linkedList = insertFromEnd.InsertToEnd(head, insertValue);

        while(linkedList !=null){
            if(linkedList.next == null){
                break;
            }
            linkedList = linkedList.next;
        }

        if(linkedList != null && linkedList.data==insertValue ){
            System.out.println("You have successfully inserted the value " + insertValue + " to the list.");
        }else{
            System.out.println("You have failed to insert the value " + insertValue + " to the list");
        }

    }

    public Node InsertToEnd(Node head, int value){
        Node current = head;
        if(current == null){
            return null;
        }

        while(current!=null){
            if(current.next == null){
                break;
            }
            current = current.next;
        }
        Node newNode = new Node(value);
        current.next = newNode;
        return head;
    }

}
