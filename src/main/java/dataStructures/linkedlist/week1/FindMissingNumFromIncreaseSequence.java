package dataStructures.linkedlist.week1;

/**
 * Created by HWENG on 1/6/2016.
 */

/*Find the missing number in the increasing sequence. i.e. :
input: 1 2 3 5 6 7 output: 4. Tell the complexity.*/
public class FindMissingNumFromIncreaseSequence {
    public static void main(String [] args){
        System.out.println("Application starts...");

        FindMissingNumFromIncreaseSequence findMissingNumFromIncreaseSequence = new FindMissingNumFromIncreaseSequence();

        int [] arrNum = {1,2,3,4,5,7,8,9};

        int findMe;
        findMe = findMissingNumFromIncreaseSequence.findTheMissingNum(arrNum);

        if(findMe!=0){
            System.out.println("The missing number is " + findMe);
        }else{
            System.out.println("There is no missing number");
        }
    }

    public int findTheMissingNum(int [] arrNum){
        int findMe=0;
        for(int i=0; i<arrNum.length-1; i++){
            int previous = arrNum[i]+1;
            if(previous != arrNum[i+1]){
                findMe = arrNum[i]+1;
                break;
            }
        }
        return findMe;
    }
}
