import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by gujarat on 02/10/16.
 */
public class SortingAlgorithmTest {
    @Test
    public void testSwapArray(){
        int [] inputArray = new int[] {9,6,8,1,0,2};

        assertEquals(9,inputArray[0]);
        assertEquals(6,inputArray[1]);

        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();
        int [] result = sortingAlgorithm.swapArray(inputArray,0,1);

        assertEquals(6,result[0]);
        assertEquals(9,result[1]);

    }

    @Test
    public void testInsertionSort(){

        int [] inputArray = new int[] {9,6,8,1,0,2};
        int [] inputArray2 = new int[]{99,12,3,55,100,33,41,5000,0,2};

        int [] expected = new int[] {0,1,2,6,8,9};
        int [] expected2 = new int[]{0,2,3,12,33,41,55,99,100,5000};

        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();
        int [] result = sortingAlgorithm.insertionSort(inputArray);
        assertArrayEquals(expected,result);


        int [] result22 = sortingAlgorithm.insertionSort(inputArray2);
        assertArrayEquals(expected2,result22);


       int [] resultWhile = sortingAlgorithm.insertionSortUsingWhile(inputArray);

        sortingAlgorithm.printArray(resultWhile);
        assertArrayEquals(expected,resultWhile);

        int [] resultAllWhile = sortingAlgorithm.insertionSortAllWhile(inputArray);
        assertArrayEquals(expected,resultAllWhile);

        int [] result2 = sortingAlgorithm.insertionSort2(inputArray);
        assertArrayEquals(expected,result2);
    }

    @Test
    public void testLinearSearch(){
        int [] inputArray = new int[] {9,6,8,1,0,2};
        int expected = 3;

        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();
        int result = sortingAlgorithm.linearSearchRecursice(1,inputArray,0);
        assertEquals(expected,result);

        result = sortingAlgorithm.linearSearch(1,inputArray);
        assertEquals(expected,result);
    }


    @Test
    public void TestBubbleSort(){
        int [] expected = new int[] {0,1,2,6,8,9};
        int [] inputArray = new int[] {9,6,8,1,0,2};

        int [] inputArray2 = new int[]{99,12,3,55,100,33,41,5000,0,2};
        int [] expected2 = new int[]{0,2,3,12,33,41,55,99,100,5000};

        //test with for loop
        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();
        int[] result = sortingAlgorithm.bubleSort(inputArray);
        assertArrayEquals(expected,result);

        //test with recursive
        result = sortingAlgorithm.bubleSortRecursive(inputArray,0);
        assertArrayEquals(expected,result);

        result = sortingAlgorithm.bubleSortRecursive(inputArray2,0);
        assertArrayEquals(expected2,result);

        result = sortingAlgorithm.bubleSort(inputArray2);
        assertArrayEquals(expected2,result);
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
