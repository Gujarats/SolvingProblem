/**
 * Created by gujarat on 25/10/16.
 */
public class SearchAlgorithm {
    public int BinarySearch(int [] inputArray, int x){
        int high = inputArray.length-1;
        int low = 0;

        while(low<=high){
            int middle = (high+low)/2;
            System.out.println(inputArray[middle]);
            if(inputArray[middle]== x)
                return middle;
            else if(inputArray[middle]<x)
                low = middle+1;
            else
                high = middle-1;
        }
        return -1;
    }
}
