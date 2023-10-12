package Codility;

import java.util.Stack;

/**
 * Created by gujarat on 02/11/16.
 */
public class BinaryGap {


   public String getBinary(int inputNumber) {
       String result="";
       int leftDigit = inputNumber % 2;
       inputNumber = inputNumber/2;
       result += String.valueOf(leftDigit);
       if (inputNumber==1){
           return "1"+result;
       }

       return getBinary(inputNumber)+result;
   }

   public String getBinaryLoop(int inputNumber){
       String result = "";
       while(inputNumber>0) {
           int leftDigit = inputNumber%2;
           inputNumber = inputNumber/2;
           result = String.valueOf(leftDigit)+result;
       }

       return result;
   }

   //get the highest length for 0 from binary
    public int getHigestLengt(String inputBinary){
        int highestLength=0;
        int zeroLength=0;
        char [] inputBinaryArray = inputBinary.toCharArray();
        for (int i = 0; i < inputBinaryArray.length; i++) {
            if(inputBinaryArray[i] == '1'){
                if(highestLength<zeroLength)
                    highestLength=zeroLength;
                zeroLength=0;
            }else {
                zeroLength++;
            }
        }

        return highestLength;
    }

}
