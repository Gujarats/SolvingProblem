import object.Found;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gujarat on 10/10/16.
 */
public class FindingLowestTest {
    @Test
    public void TestGetLowestNumber(){
        int [] inputArray = new int[] {9,6,8,1,0,2};
        FindingLowest findingLowest = new FindingLowest();
        Found found = findingLowest.getLowestNumber(inputArray);

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

       // Algorithm.SortingAlgorithm sortingAlgorithm =new Algorithm.SortingAlgorithm();
        //sortingAlgorithm.printArray(inputArray);
    }

    @Test
    public void Test(){
        FindingLowest findingLowest = new FindingLowest();
        int [] inputArray = new int[] {9,6,8,1,0,2};
        int result =findingLowest.getIndexLowest(inputArray);
        assertEquals(-1,result);

    }
}
