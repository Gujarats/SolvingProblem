import object.Found;
import org.omg.CORBA.INTERNAL;

import java.math.BigInteger;

/**
 * Created by gujarat on 09/10/16.
 */
public class FindingLowest {
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

    /*
    The fastest way to find lowest number in the arrray.
     */
    public int getIndexLowest(int [] inputArray){
        Integer i =Integer.MAX_VALUE+ Integer.MAX_VALUE;
        int  I =Integer.MAX_VALUE+ 2147483647+1;
        int o = Integer.MIN_VALUE;
        int I2 = Integer.MAX_VALUE + Integer.MAX_VALUE;
        System.out.println("I "+I);
        System.out.println("I2 "+I2);
        System.out.println("o "+o);
        if(I2==i)
            return -1;
        return 0;
    }
}
