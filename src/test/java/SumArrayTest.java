import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gujarat on 15/10/16.
 */
public class SumArrayTest {
    @Test
    public void testSumArrayEvenOdd(){
        int [] inputArray = new int[]{1,2};
        SumArray sumArray = new SumArray();
        assertEquals(-1,sumArray.sumOddEven(inputArray));
    }

    @Test
    public void testSumArrayEvenOdd2(){
        int [] inputArray = new int[]{1};
        SumArray sumArray = new SumArray();
        assertEquals(1,sumArray.sumOddEven(inputArray));
    }

    @Test
    public void testSumArrayEvenOdd3(){
        int [] inputArray = new int[]{1,2,3};
        SumArray sumArray = new SumArray();
        assertEquals(2,sumArray.sumOddEven(inputArray));
    }

    @Test
    public void testSumArrayEvenOdd4(){
        int [] inputArray = new int[]{1,2,3,4};
        SumArray sumArray = new SumArray();
        assertEquals(-2,sumArray.sumOddEven(inputArray));
    }

    @Test
    public void testSumArrayEvenOdd5(){
        int [] inputArray = new int[]{3,3,4,4};
        SumArray sumArray = new SumArray();
        assertEquals(-2,sumArray.sumOddEven(inputArray));
    }

    @Test
    public void testSumArrayEvenOdd6(){
        int [] inputArray = new int[]{};
        SumArray sumArray = new SumArray();
        assertEquals(0,sumArray.sumOddEven(inputArray));
    }

    @Test
    public void testSumArrayEvenOdd7(){
        int [] inputArray = new int[]{1,1};
        SumArray sumArray = new SumArray();
        assertEquals(2,sumArray.sumOddEven(inputArray));
    }


}
