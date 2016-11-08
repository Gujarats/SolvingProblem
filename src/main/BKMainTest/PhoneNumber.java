package BKMainTest;

/**
 * Created by gujarat on 03/11/16.
 */
public class PhoneNumber {
    public String solution(String S) {
        S = removeUnecessaryChar(S);
        char [] inputChars = S.toCharArray();
        String result="";
        int numberExist = 0;
        int limitDigit;

        if(is4Left(0,inputChars.length-1)){
            limitDigit = 2;
        }else{
            limitDigit = 3;
        }

        for (int i = 0; i < inputChars.length; i++) {
           if(inputChars[i] >= '0' && inputChars[i] <= '9'){

               if(numberExist==limitDigit){
                   result += "-";
                   numberExist=0;

                   if(is4Left(i,inputChars.length-1)){
                       limitDigit = 2;
                       numberExist=0;
                   }else{
                       limitDigit = 3;
                   }
               }


               result += inputChars[i];
               numberExist++;
           }
        }

        return result;
    }

    // check if string cointain 3 numbers after - or if not exist check 3 numbers
    public boolean is4Left(int index, int length){
        return (length-index+1==4);
    }

    public String removeUnecessaryChar(String inputString){
        inputString = inputString.replaceAll("\\s","");
        inputString= inputString.replaceAll("-","");
        return inputString;
    }
}
