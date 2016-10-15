import object.Found;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gujarat on 10/10/16.
 */
public class BKTest {
    @Test
    public void TestGetLowestNumber(){
        int [] inputArray = new int[] {9,6,8,1,0,2};
        BK bk = new BK();
        Found found = bk.getLowestNumber(inputArray);

        assertEquals(0,found.getValue());
        assertEquals(true,found.isFound());
        assertEquals(4,found.getIndex());
    }

    @Test
    public void TestGetTheLowestNumber(){
        // TODO :  find the way to get random value from range valu 0 to 1000
        int [] inputArray = new int[1000];
        //for (int i = 0; i <1000 ; i++) {
        //
        //    Random random = new Random(1000);
        //

        //    int randomNumber = random.nextInt();
        //    inputArray[i] = randomNumber;
        //}

       // SortingAlgorithm sortingAlgorithm =new SortingAlgorithm();
        //sortingAlgorithm.printArray(inputArray);
    }
}
