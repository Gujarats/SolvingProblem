/**
 * Created by gujarat on 15/10/16.
 */
public class SumArray {
    public int sumOddEven(int [] inputArray){
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < inputArray.length; i++) {
           if(inputArray[i]%2==0) {
               //even number
               sumEven = sumEven + inputArray[i];
           }else{
               sumOdd = sumOdd + inputArray[i];
           }
        }

        return sumOdd-sumEven;
    }
}
