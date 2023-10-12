/**
 * Created by gujarat on 15/10/16.
 */
public class FindingNumber {
    /**
     * the best way finding second largest number in given array
     */
    public int getSecondLargestBestWay(int [] inputArray){
        int max1 = -1;
        int max2 = -1;
        for (int i = 0; i < inputArray.length; i++) {
           if(inputArray[i]>max1) {
               max2 = max1;
               max1 = inputArray[i];
           }else if(inputArray[i]<max1 && inputArray[i]>max2){
               max2 = inputArray[i];
           }
        }
        return max2;
    }
    /**
     * find the second largest number form given array way1
     */
    public int getSecondLargestWay2(int [] inputArray){
        if(inputArray.length==0) return -1;
        int [] sortedArray =sortArray(inputArray);
        int highestNumber= sortedArray[sortedArray.length-1];
        for (int i = inputArray.length-2; i >=0; i--) {
            if(inputArray[i]<highestNumber){
                return inputArray[i];
            }
        }
        return -1;
    }

    /**
     * sorting array form lowest to highest
     */
    public int[] sortArray(int [] inputArray){
        for (int i = inputArray.length-1; i >=0 ; i--) {
            for (int j = 0; j < i; j++) {
               if(inputArray[j] > inputArray[j+1]) {
                   inputArray = swapArray(inputArray,j,j+1);
               }
            }
        }
        return inputArray;
    }

    public int[] swapArray(int[] inputArray, int index1,int index2){
       int temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;

        return inputArray;
    }
    /**
     * find the second largest number form given array way1
     */
    public int getSecondLargestWay1(int [] inputArray){
        int min = getLowestNumber(inputArray);
        int max = getLargetsNumber(inputArray);
        int secondLargest = -1;
        for (int i = 0; i < inputArray.length; i++) {
           if(secondLargest<inputArray[i] && inputArray[i]<max && min <=inputArray[i]) {
               secondLargest = inputArray[i];
           }

        }

        return secondLargest;
    }

    public int getLargetsNumber(int [] inputArray){
        int max = 0;
        for (int i = 0; i < inputArray.length; i++) {
           if(max<inputArray[i]) {
               max = inputArray[i];
           }

        }
        return max;
    }

    public int getLowestNumber(int [] inputArray){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
           if(min > inputArray[i]) {
               min = inputArray[i];
           }
        }
        return min;
    }
}
