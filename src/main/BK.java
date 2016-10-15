import object.Found;

/**
 * Created by gujarat on 09/10/16.
 */
public class BK {
    public Found getLowestNumber(int [] inputArray){
        // TODO : find the way how to initialize empy / null integer

        Found found = new Found();
        int lowestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            if(lowestNumber>inputArray[i]){
                lowestNumber=inputArray[i];
                found.setValue(lowestNumber);
                found.setFound(true);
                found.setIndex(i);
            }
        }
        return found;
    }
}
