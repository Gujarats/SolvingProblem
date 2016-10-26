import Algorithm.SortingAlgorithm;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by gujarat on 15/10/16.
 */
public class FindingNumberTest {

    @Test
    public void testSortArray(){
        int [] inputArray = new int[] {9,6,8,1,0,2};
        int [] inputArray2 = new int[]{99,12,3,55,100,33,41,5000,0,2};

        int [] expected = new int[] {0,1,2,6,8,9};
        int [] expected2 = new int[]{0,2,3,12,33,41,55,99,100,5000};

        FindingNumber findingNumber = new FindingNumber();
        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();
        sortingAlgorithm.printArray(findingNumber.sortArray(inputArray));
        assertArrayEquals(expected,findingNumber.sortArray(inputArray));
        assertArrayEquals(expected2,findingNumber.sortArray(inputArray2));
    }

    @Test
    public void testGetSecondLargestNumberBestWay(){
        int [] inputArray = new int[]{3,4,10,2,45,7};
        FindingNumber findingNumber = new FindingNumber();
        int result = findingNumber.getSecondLargestBestWay(inputArray);
        assertEquals(10,result);
    }

    @Test
    public void testGetSecondLargestNumberTheBesWay2(){
        int [] inputArray = new int[]{1,1,1 ,1,1 ,1};
        FindingNumber findingNumber = new FindingNumber();
        int result = findingNumber.getSecondLargestBestWay(inputArray);
        assertEquals(-1,result);
    }


    @Test
    public void testGetSecondLargestNumberTheBesWay3(){
        int [] inputArray = new int[]{};
        FindingNumber findingNumber = new FindingNumber();
        int result = findingNumber.getSecondLargestBestWay(inputArray);
        assertEquals(-1,result);
    }

    @Test
    public void testGetSecondLargestNUmberTheBestWasy4(){
        int [] inputArray = new int[]{1,1,1 ,1,2 ,1};
        FindingNumber findingNumber = new FindingNumber();
        int result = findingNumber.getSecondLargestBestWay(inputArray);
        assertEquals(1,result);
    }

    @Test
    public void testGetSecondLargestNUmberTheBestWasy5(){
        int [] inputArray = new int[]{99,12,3,55,100,33,41,5000,0,2};
        FindingNumber findingNumber = new FindingNumber();
        int result = findingNumber.getSecondLargestBestWay(inputArray);
        assertEquals(100,result);
    }


    @Test
    public void testGetSecondLargestNumberWay2(){
        int [] inputArray = new int[]{3,4,10,2,45,7};
        FindingNumber findingNumber = new FindingNumber();
        int result = findingNumber.getSecondLargestWay2(inputArray);
        assertEquals(10,result);
    }


    @Test
    public void testGetSecondLargestNumberWay2Second(){
        int [] inputArray = new int[]{1,1,1 ,1,1 ,1};
        FindingNumber findingNumber = new FindingNumber();
        int result = findingNumber.getSecondLargestWay2(inputArray);
        assertEquals(-1,result);
    }

    @Test
    public void testGetSecondLargestNumberWay2Fourth(){
        int [] inputArray = new int[]{};
        FindingNumber findingNumber = new FindingNumber();
        int result = findingNumber.getSecondLargestWay2(inputArray);
        assertEquals(-1,result);
    }

    @Test
    public void testGetSecondLargestNUmberWay2Third(){
        int [] inputArray = new int[]{1,1,1 ,1,2 ,1};
        FindingNumber findingNumber = new FindingNumber();
        int result = findingNumber.getSecondLargestWay2(inputArray);
        assertEquals(1,result);
    }

    @Test
    public void getLargestNumberTest(){
        int [] inputArray = new int[]{3,4,10,2,45,7};
        FindingNumber findingNumber = new FindingNumber();
        int result = findingNumber.getLargetsNumber(inputArray);
        assertEquals(45,result);
    }

    @Test
    public void getLowestNumberTest(){
        int [] inputArray = new int[]{3,4,10,2,45,7};
        FindingNumber findingNumber = new FindingNumber();
        int result = findingNumber.getLowestNumber(inputArray);
        assertEquals(2,result);
    }

    @Test
    public void testSecondLargestTest(){
        int [] inputArray = new int[]{3,4,10,2,45,7};
        FindingNumber findingNumber = new FindingNumber();
        int result = findingNumber.getSecondLargestWay1(inputArray);
        assertEquals(10,result);

    }


    @Test
    public void testSecondLargest2Test(){
        int [] inputArray = new int[]{1,1,1 ,1,1 ,1};
        FindingNumber findingNumber = new FindingNumber();
        int result = findingNumber.getSecondLargestWay1(inputArray);
        assertEquals(-1,result);
    }

    @Test
    public void testSecondLargest3Test(){
        int [] inputArray = new int[]{1,1,1 ,1,2 ,1};
        FindingNumber findingNumber = new FindingNumber();
        int result = findingNumber.getSecondLargestWay1(inputArray);
        assertEquals(1,result);
    }

    @Test
    public void testSecondLargest4Test(){
        int [] inputArray = new int[]{4,2,1,1};
        FindingNumber findingNumber = new FindingNumber();
        int result = findingNumber.getSecondLargestWay1(inputArray);
        assertEquals(2,result);
    }

    @Test
    public void testSecondLargest5Test(){
        int [] inputArray = new int[]{1,1};
        FindingNumber findingNumber = new FindingNumber();
        int result = findingNumber.getSecondLargestWay1(inputArray);
        assertEquals(-1,result);
    }

    @Test
    public void testSecondLargest7Test(){
        int [] inputArray = new int[]{1};
        FindingNumber findingNumber = new FindingNumber();
        int result = findingNumber.getSecondLargestWay1(inputArray);
        assertEquals(-1,result);
    }
    @Test
    public void testSecondLargest6Test(){
        int [] inputArray = new int[]{};
        FindingNumber findingNumber = new FindingNumber();
        int result = findingNumber.getSecondLargestWay1(inputArray);
        assertEquals(-1,result);
    }


}
