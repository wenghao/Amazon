package dataStructures.linkedlist.week3;

/**
 * Created by HWENG on 1/28/2016.
 */
public class RearrangeLinkedList {
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
        RearrangeLinkedList rearrange = new RearrangeLinkedList();

        Node zero = new Node(0);
        Node first = new Node(1);
        Node second = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);

        zero.next = first;
        first.next = second;
        second.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;

        Node head = zero;
        Node newList = rearrange.rearrangeList(head);
        rearrange.printList(newList);

    }

    public Node rearrangeList(Node head){
        Node[] nodeList = new Node[2];
        nodeList = splitList(head);
        Node node1 = nodeList[0];
        Node node2 = nodeList[1];
        Node reverList = reverseList(node2);

        Node newNode = new Node(0);
        Node curr = newNode;
        while(node1!=null || reverList!=null){
            if(node1!=null){
                curr.next = node1;
                curr = curr.next;
                node1 = node1.next;
            }

            if(reverList!=null){
                curr.next = reverList;
                curr = curr.next;
                reverList = reverList.next;
            }
        }

        return newNode.next;

    }

    public void printList(Node head){
        if(head == null){
            System.out.print("The list is null");
        }
        while(head!=null){
            System.out.print(head.data + "-> ");
            head = head.next;
        }
    }

    public Node[] splitList(Node head){
        Node[] nodeList = new Node[2];
        Node current = head;
        if(current == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node node1 = head;
        Node node2 = slow.next;
        slow.next = null;
        nodeList[0] = node1;
        nodeList[1] = node2;

        return nodeList;
    }

    public Node reverseList(Node list) {
        if (list == null) {
            return null;
        } else {
            Node current = list;
            Node prev = null;
            Node next = null;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }
    }
}
