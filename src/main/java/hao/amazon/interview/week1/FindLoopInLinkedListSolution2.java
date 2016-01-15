package hao.amazon.interview.week1;

/**
 * Created by HWENG on 1/10/2016.
 */
public class FindLoopInLinkedListSolution2 {
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
        FindLoopInLinkedListSolution2 findLoopInLinkedListSolution2 = new FindLoopInLinkedListSolution2();
        Node first = new Node(1);
        Node second = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);

        Node head = first;
        first.next = second;
        second.next = three;
        three.next = four;
        four.next = five;
        five.next = three;

        int nodePosi = findLoopInLinkedListSolution2.findStratNodeInLoop(head);
        if(nodePosi !=0){
            System.out.println("There is a loop in this linked list. The starting node of the loop is " + nodePosi);
        }else{
            System.out.println("There is no loop in this linked list");
        }
    }

    public int findStratNodeInLoop(Node head){
        if(head==null){
            return 0;
        }

        Node A = head;
        Node B = head;
        boolean hasLoop = false;

        while(A!=null && B!=null){
            if(A == B && A != head){
                hasLoop =true;
                B = head;
                break;
            }
            A = A.next;
            B = B.next.next;
            if(A.next ==null || B.next == null){
                System.out.println("You have reached the end of the list. \nNO loop has been found. ");
                break;
            }
        }

        while(hasLoop){
            if(A == B) {
                return A.data;
            }
            A = A.next;
            B = B.next;
        }
        return 0;
    }
}
