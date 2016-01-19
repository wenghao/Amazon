package dataStructures.linkedlist.week2;

/**
 * Created by HWENG on 1/16/2016.
 */
public class InsertFromFront {

    public static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }

    public static void main(String[] args){
        System.out.println("Application starts...");

        InsertFromFront insertFromFront = new InsertFromFront();
        int insertValue = 100;
        Node first = new Node(1);
        Node head = first;

        Node linkedList = insertFromFront.InsertToList(head, insertValue);

        if(linkedList != null && linkedList.data == insertValue){
            System.out.println("The new node has been inserted into the list successfully.");
        }else{
            System.out.println("You have failed to insert the value " + insertValue + " to list");
        }
    }

    public Node InsertToList(Node head, int value){
        if(head == null){
            return null;
        }
        Node newNode = new Node(value);
        newNode.next = head;
        return newNode;
    }
}
