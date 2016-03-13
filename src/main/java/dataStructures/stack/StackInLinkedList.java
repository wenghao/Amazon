package dataStructures.stack;


/**
 * Created by HWENG on 3/13/2016.
 */
public class StackInLinkedList {

    public class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    private Node top;
    public static void main(String[] args){
        System.out.println("Application starts...");

        StackInLinkedList sLinkedList = new StackInLinkedList();
        sLinkedList.push(3);
        sLinkedList.push(4);
        sLinkedList.push(5);
        sLinkedList.push(6);
        sLinkedList.push(7);

        while(sLinkedList.peak() != null){
            Node n = sLinkedList.pop();
            System.out.println("The popped value is " + n.data);
        }
    }

    public void push(int d){
        Node newNode = new Node(d);
        newNode.next = top;
        top = newNode;
    }

    public Node pop(){
        if(top!=null){
            Node n = top;
            top = top.next;
            return n;
        }else{
            return null;
        }
    }

    public Node peak(){
        return top;
    }

}
