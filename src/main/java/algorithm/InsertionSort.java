package algorithm;

/**
 * Created by HWENG on 2/17/2016.
 */
public class InsertionSort {
    public static void main(String[] args){
        System.out.println("Application starts...");

        int [] arr = {3,5,1,2,4,100,34,3,5,2,1,1,1,1};

        InsertionSort is = new InsertionSort();
        arr = is.sortArrUsingInsertion(arr);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + "-> ");
        }
    }

    public int[] sortArrUsingInsertion(int[] arr){

        int temp;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
