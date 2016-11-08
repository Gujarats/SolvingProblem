package Codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gujarat on 02/11/16.
 */
public class BinaryGapTest {
    @Test
    public void testGetHighestBinary(){
        int inputNumber = 20;
        String expected = "10100";
        BinaryGap binaryGap = new BinaryGap();
        assertEquals(expected,binaryGap.getBinary(inputNumber));
    }

    @Test
    public void testGetHighestBinary2(){
        int inputNumber = 123;
        String expected = "1111011";
        BinaryGap binaryGap = new BinaryGap();
        assertEquals(expected,binaryGap.getBinary(inputNumber));
    }

    @Test
    public void testGetHighestLength(){
        String inputBinary = "1000010001";
        int expected = 4;
        BinaryGap binaryGap = new BinaryGap();
        assertEquals(expected,binaryGap.getHigestLengt(inputBinary));
    }


    @Test
    public void testGetHighestLength2(){
        String inputBinary = "10000100010000001";
        int expected = 6;
        BinaryGap binaryGap = new BinaryGap();
        assertEquals(expected,binaryGap.getHigestLengt(inputBinary));
    }


    @Test
    public void testGetHighestLength3(){
        String inputBinary = "101001000_2";
        int expected = 2;
        BinaryGap binaryGap = new BinaryGap();
        assertEquals(expected,binaryGap.getHigestLengt(inputBinary));
    }
}
