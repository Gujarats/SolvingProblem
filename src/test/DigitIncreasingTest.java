import maharishi.DigitIncreasing;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gujarat on 17/10/16.
 */
public class DigitIncreasingTest {
    @Test
    public void test1(){
        boolean expected = true;
        int n = 7;
        DigitIncreasing digitIncreasing = new DigitIncreasing();
        assertEquals(expected,digitIncreasing.isDigitIncreasing(n));
    }

    @Test
    public void test2(){
        boolean expected = true;
        int n =36;
        DigitIncreasing digitIncreasing = new DigitIncreasing();
        assertEquals(expected,digitIncreasing.isDigitIncreasing(n));
    }

    @Test
    public void test3(){
        boolean expected = true;
        int n = 984;
        DigitIncreasing digitIncreasing = new DigitIncreasing();
        assertEquals(expected,digitIncreasing.isDigitIncreasing(n));
    }

    @Test
    public void test4(){
        boolean expected = true;
        int n = 7404;
        DigitIncreasing digitIncreasing = new DigitIncreasing();
        assertEquals(expected,digitIncreasing.isDigitIncreasing(n));
    }

    @Test
    public void test5(){
        boolean expected = false;
        int n = 37;
        DigitIncreasing digitIncreasing = new DigitIncreasing();
        assertEquals(expected,digitIncreasing.isDigitIncreasing(n));
    }
}
