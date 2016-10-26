package Algorithm;

/**
 * Created by gujarat on 02/10/16.
 */
public class SortingAlgorithm {


    public int [] bubleSort(int [] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length-i-1; j++) {
               if(inputArray[j]>inputArray[j+1]) {
                   inputArray = swapArray(inputArray,j,j+1);
               }
            }
        }
        return inputArray;
    }

     public int [] bubleSortRecursive(int [] inputArray , int index){
         if(index > inputArray.length -1){
             return inputArray;
         }else{
             inputArray = bubleSortRecursive2(inputArray,0,inputArray.length-index-1);

             index++;
             return bubleSortRecursive(inputArray,index);
         }
    }

    public int [] bubleSortRecursive2(int [] inputArray,int index, int lastIndex){
        if(index > lastIndex-1) {
            return inputArray;
        }else{
            if(inputArray[index]>inputArray[index+1]){
                inputArray = swapArray(inputArray,index,index+1);
            }
            index++;
            return bubleSortRecursive2(inputArray,index,lastIndex);
        }
    }



    public int linearSearch(int value,int [] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            if(value==inputArray[i]) {
                return i;
            }

        }
        return -1;
    }

    public int linearSearchRecursice(int value, int [] inputArray, int index){
        if(value == inputArray[index]) {
            return index;
        }else{
            return linearSearchRecursice(value,inputArray,(index+1));
        }
    }

    public int [] insertionSort2(int [] inputArray){
        for (int i = 1; i < inputArray.length; i++) {
            int j = i;
            int temp = inputArray[j];
            while(j>0 && inputArray[j]<inputArray[j-1]){
                inputArray[j]= inputArray[j-1];
                j--;
            }

            inputArray[j] = temp;

        }
        return inputArray;
    }

    public int [] insertionSort(int [] inputArray){
        for (int i = 1; i < inputArray.length; i++) {
            for (int j = i; j >0 ; j--) {
                if(inputArray[j]<inputArray[j-1]){
                    inputArray = swapArray(inputArray,j,j-1);
                }

            }

        }
        return inputArray;
    }

    public int [] insertionSortUsingWhile(int [] inputArray){
        for (int i = 1; i < inputArray.length; i++) {
            int j=i;
            while(inputArray[j]<inputArray[j-1] && j>0){
                inputArray = swapArray(inputArray,j,j-1);
            }
        }
        return inputArray;
    }

    public int [] insertionSortAllWhile(int [] inputArray){
        int i = 1;
        while(i<inputArray.length)
        {
            int j = i;
            while(inputArray[j]<inputArray[j-1] && j>0){
                inputArray = swapArray(inputArray,j,j-1);
                j--;
            }
            i++;
        }
        return inputArray;
    }

    public int [] swapArray(int [] inputArray,int index1,int index2){
        //swap the array
        int temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;
        return inputArray;
    }

    public void swapArrayVoid(int [] inputArray,int index1,int index2){
        int temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;
    }

    public void printArray(int [] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(String.valueOf(inputArray[i])+' ');
        }
        System.out.println();
    }
}
