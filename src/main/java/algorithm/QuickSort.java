package algorithm;

/**
 * Created by HWENG on 2/18/2016.
 */
public class QuickSort {

    public static void main(String [] args){

        System.out.println("Quick Sort Application starts...");
        QuickSort qs = new QuickSort();
        int resArray[];
        int A[]={1,3,2,6,4,34,10};
        //pass array A to quickSort
        resArray = qs.quickSort(A,0, A.length-1);

        for(int i=0; i < resArray.length; i++)
        {
            System.out.print(resArray[i] + " ,");
        }

    }

    public int[] quickSort(int A[], int start, int end)
    {
        if(start < end){
            int PIndex = partition(A, start, end);
            quickSort(A, start, PIndex -1);
            quickSort(A, PIndex +1, end);
        }
        return A;
    }


    public int partition(int A[],int start, int end ){

        int PIndex = start;
        int pivot = A[end];

        for(int i = start; i < end; i++)
        {
            if(A[i]<=pivot)
            {
                swap(A,i, PIndex);
                PIndex = PIndex+1;
            }
        }

        swap(A,PIndex, end);
        return PIndex;
    }

    public void swap(int A[],int PIndex, int end){
        int temp = A[PIndex];
        A[PIndex] = A[end];
        A[end] = temp;
    }
}
