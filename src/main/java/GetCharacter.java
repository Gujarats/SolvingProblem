/**
 * Created by gujarat on 15/10/16.
 */
public class GetCharacter {
    public char[] getCharacter(char[] inputChar, int startIndex, int endIndex) {
        //checking valid input parameters
        if (!((inputChar.length - startIndex) >= endIndex) || !(startIndex >= 0 && endIndex >= 0))
            return null;
        if (endIndex == 0)
            //return empty array because null and emtpy array is different
            return new char[]{};

        char[] result = new char[endIndex];
        int indexResult = 0;
        for (int i = startIndex; i < inputChar.length; i++) {
            result[indexResult] = inputChar[i];
            indexResult++;
            if (indexResult == endIndex)
                break;
        }
        return result;
    }

    public char [] getCharBest(char [] inputArray,int startIndex,int end){
        if(startIndex <0 || end<0 || (inputArray.length-startIndex)<end)
            return null;
        char [] result = new char[end];
        for (int resultIndex=0; resultIndex < end; startIndex++,resultIndex++) {
           result[resultIndex] = inputArray[startIndex];
        }
        return result;
    }

}
