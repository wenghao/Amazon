package hao.amazon.interview.linkedlist.week1;

/**
 * Created by HWENG on 1/10/2016.
 */
public class LinkedListInsertFromFront {
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

        LinkedListInsertFromFront insert = new LinkedListInsertFromFront();

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);
        Node insertMe = new Node(100);

        Node head = first;
        head.next = second;
        second.next = third;
        third.next = four;

        Node insertFrom = insert.insertFromFront(head,insertMe);
        Node insertBack = insert.insertToBack(head,insertMe);



        if(insertBack!=null){
            while(insertBack !=null){
                System.out.println(insertBack.data);
                insertBack = insertBack.next;
            }
        }else{
            System.out.println("The list is empty.");
        }

    }

    public Node insertFromFront(Node head, Node newNode){
        if(head ==null){
            return null;
        }else{
            Node current = head;
            head = newNode;
            head.next = current;
            return head;
        }
    }

    public Node insertToBack(Node head, Node newNode){
        if(head == null){
            return null;
        }else{
            Node current = head;
            while(current!=null){
                if(current.next==null){
                    current.next = newNode;
                    System.out.println("Append new node to the end node");
                    break;
                }
                current = current.next;
            }
            return head;
        }
    }

}
