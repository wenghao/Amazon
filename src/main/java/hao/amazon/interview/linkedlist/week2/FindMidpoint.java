package hao.amazon.interview.linkedlist.week2;

/**
 * Created by HWENG on 1/16/2016.
 */

/*
*Find the midpoint of the linked list.
 If the size of the linked list is even,then the midpoint is located in the totalLength/2 position.
 If the size of the linked list is odd,then the midpoint is located in the (totalLength+1)/2 position.
 */
public class FindMidpoint {

    public static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }

    public static void main(String[] args){
        System.out.println("application starts...");
        FindMidpoint findMidpoint = new FindMidpoint();

        Node first =new Node(1);
        Node second =new Node(2);
        Node three =new Node(3);
        Node four =new Node(4);
        Node five =new Node(5);
        Node six =new Node(6);
        Node seven =new Node(7);
        Node eight =new Node(8);
        Node nine =new Node(9);

        first.next = second;
        second.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        seven.next = eight;
        eight.next = nine;

        Node head = first;
        Node findMe = findMidpoint.FindMidNode(head);

        if(findMe != null){
            System.out.println("You have found a middle node " + findMe.data + ".");
        }else{
            System.out.println("This linked list is empty.");
        }

    }

    public Node FindMidNode(Node head){
        if(head==null){
            return null;
        }

        Node current = head;
        if(head.next == null){
            return head;
        }
        int listLength = 0;
        int midLength = 0;
        while(head != null){
            listLength++;
            head = head.next;
        }

        System.out.println("The size of the list is " + listLength);
        if(listLength%2==0){
            midLength = listLength/2;
        }else{
            midLength = (listLength+1)/2;
        }

        System.out.println("The mid length is " + midLength);
        System.out.println("The current node is " + current.data);
        while(midLength > 1 && current.next != null){
            current = current.next;
            midLength--;
        }

        return current;
    }
}
