package dataStructures.linkedlist.week3;

/**
 * Created by HWENG on 1/16/2016.
 */

/*use doubly linked list to solve this problem*/
public class Palindrome {
    public static class Node{
        char data;
        Node prev;
        Node next;

        public Node(char d){
            data = d;
            next = null;
            prev = null;
        }
    }

    public static void main(String[]args){
        System.out.println("Application starts...");
        Palindrome palindrome = new Palindrome();

        Node first = new Node('s');
        Node second = new Node('e');
        Node three = new Node('d');
        Node four = new Node('d');
        Node five = new Node('e');
        Node six = new Node('s');
        first.next = second;
        second.prev = first;
        second.next = three;
        three.prev = second;
        three.next = four;
        four.prev = three;
        four.next = five;
        five.prev = four;
        five.next = six;
        six.prev = five;

        Node head = first;

        boolean isPalindrome = palindrome.IsPalindrome(head);

        if(isPalindrome){
            System.out.println("This is a palindrome linked list");
        }else{
            System.out.println("This is not a palindrome linked list");
        }

    }

    public boolean IsPalindrome(Node head){
        Node front = head;
        Node end = head;
        while(end.next!=null){
            end = end.next;
        }

        while(front!=end && front.next != end){
            if(front.data!=end.data){
                return false;
            }
            front = front.next;
            end = end.prev;
        }
        return true;
    }
}
