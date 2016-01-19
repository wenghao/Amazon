package dataStructures.linkedlist.week2;

/**
 * Created by HWENG on 1/18/2016.
 */

/*
*Remove the midpoint of the linked list.
 If the size of the linked list is even,then the midpoint is located in the totalLength/2 position.
 If the size of the linked list is odd,then the midpoint is located in the (totalLength+1)/2 position.
 */
public class RemoveMidpoint {

    public static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }

    public static void main(String []args){
        System.out.println("Application starts...");
        RemoveMidpoint removeMidpoint = new RemoveMidpoint();

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
        Node linkedList = removeMidpoint.RemoveMiddlePoint(head);

        if(linkedList!=null){
            while(linkedList!=null){
                System.out.println("This node contains " + linkedList.data + " .");
                linkedList = linkedList.next;
            }
        }else{
            System.out.println("This linked list is empty.");
        }
    }

    public Node RemoveMiddlePoint(Node head){
        //return null if the linked list is null
        if(head==null){
            return null;
        }

        //return the first node if the second node is null
        if(head.next==null){
            return head;
        }

        int listSize = 0;
        int midLength = 0;
        Node current = head;
        Node newList = head;

        //get the size of the linked list
        while(current!=null){
            listSize++;
            current = current.next;
        }
        System.out.println("The size of the linked list is " + listSize);

        //get the midpoint of the linked list
        if(listSize%2 == 0 ){
            midLength = listSize/2;
        }else{
            midLength = (listSize+1)/2;
        }
        System.out.println("The midpoint of the linked list is " + midLength);

        while(midLength > 0){

            if(midLength==2){
                newList.next = newList.next.next;
                System.out.println("The new list is " + newList.data);
                break;
            }
            newList = newList.next;
            midLength--;
        }
        return head;
    }
}
