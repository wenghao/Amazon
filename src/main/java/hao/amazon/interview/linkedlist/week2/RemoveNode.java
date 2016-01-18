package hao.amazon.interview.linkedlist.week2;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by HWENG on 1/16/2016.
 */
public class RemoveNode {

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
        RemoveNode removeNode = new RemoveNode();

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
        int value = 2;
        boolean isDeleted = false;
        Node linkedList = removeNode.DeleteNode(head, value);

        if(linkedList==null){
            System.out.println("The list does not contain the desired node.");
        }else{
            System.out.println("you have successfully deleted the desired node");
        }

        System.out.println("Printing out all node of the list");
        while(linkedList!=null){
            System.out.println("This node contains " + linkedList.data);
            linkedList = linkedList.next;
        }
    }

    public Node DeleteNode(Node head, int value){
        if(head==null) {
            return null;
        }

        if(head.data == value){
            return head.next;
        }
        Node current = head;
        boolean isDeleted = false;
        while(current.next!=null){
            if(current.next.data ==value){
                System.out.println("you have found the desired node " + current.next.data);
                current.next = current.next.next;
                isDeleted = true;
                break;
            }

        }
        if(isDeleted==false){
            return null;
        }
        return head;

    }

}
