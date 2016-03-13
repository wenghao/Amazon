package dataStructures.stack;

/**
 * Created by HWENG on 3/12/2016.
 */
public class SimpleStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public SimpleStack(int size){
        maxSize = size;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j){
        stackArray[++top] = j;
    }

    public long pop(){
        return stackArray[top--];
    }

    public long peak(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }


    public static void main(String[]args){
        System.out.println("Application starts....");

        SimpleStack ss = new SimpleStack(10);

        ss.push(10);
        ss.push(20);
        ss.push(30);
        ss.push(40);
        ss.push(50);
        ss.push(60);
        ss.push(70);
        ss.push(80);
        ss.push(90);
        ss.push(100);


        while(!ss.isEmpty()){
            long value = ss.pop();
            System.out.println("The popped value is " + value);
        }

        System.out.println("Application ends....");

    }
}
