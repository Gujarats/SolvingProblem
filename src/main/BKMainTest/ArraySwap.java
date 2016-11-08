package BKMainTest;

/**
 * Created by gujarat on 03/11/16.
 */
public class ArraySwap {
    public boolean solution(int [] A){
        // check if the array already sorted
        for (int i = 0; i <A.length ; i++) {
            // find unsorted index
            if(i!=A.length-1){
                if(A[i]> A[i+1]){
                    // get smallest index
                    int indexSmall = getSmallestIndex(i,A);

                    //swapvalue
                    A = swapValue(i,indexSmall,A);
                    // check if already sorted with one swap
                    if(isSorted(A)){
                        return true;
                    }else
                        return false;
                }
            }

        }

        return true;
    }


    public boolean isSorted(int [] A){
        for (int i = 0; i <A.length ; i++) {
            if(i!=A.length-1){
                if (A[i] > A[i + 1]) {
                    return false;
                }
            }

        }
        return true;
    }

    public int getSmallestIndex(int index, int [] A){
        int smallest = Integer.MAX_VALUE;
        int indexSmall = 0;
        for (int i = index; i < A.length; i++) {
            if(smallest>=A[i]) {
                smallest = A[i];
                indexSmall = i;
            }
        }

        return indexSmall;
    }

    public int [] swapValue(int index1,int index2, int [] A){
        int temp = A[index1] ;
        A[index1] = A[index2];
        A[index2] = temp;
        return A;
    }
}
