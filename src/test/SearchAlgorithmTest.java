import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gujarat on 25/10/16.
 */
public class SearchAlgorithmTest {
    @Test
    public void binarySearchTest(){
        SearchAlgorithm searchAlgorithm  = new SearchAlgorithm();
        int [] inputArray = {2, 3, 5, 7, 11, 13, 17, 23, 29};
        int number = 15;
        int expected = -1;
        assertEquals(expected, searchAlgorithm.BinarySearch(inputArray,number));
    }
}
