package algorithm;

/**
 * Created by HWENG on 2/17/2016.
 */
public class SelectionSort {
    public static void main(String[] args){
        System.out.println("Application starts...");

        int[] arr = {3,34,200,3,5,3,1,34,5,34};
        SelectionSort ss = new SelectionSort();
        arr = ss.sortArrUsingSelection(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "-> ");
        }
    }

    public int[] sortArrUsingSelection(int [] arr){

        for(int i = arr.length-1; i > 0; i--){
            int maxIndex = 0;
            int max = 0;
            for(int j = 0; j<=i; j++){
                if(arr[j]>max){
                    max=arr[j];
                    maxIndex = j;
                }
            }
            swap(arr, maxIndex, i);
        }
        return arr;
    }

    public void swap(int[] arr, int maxIndex, int lastIndex){
        int temp = 0;
        temp = arr[maxIndex];
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }
}
