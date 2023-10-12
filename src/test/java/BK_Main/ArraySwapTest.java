package BK_Main;

import BKMainTest.ArraySwap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gujarat on 03/11/16.
 */
public class ArraySwapTest {
    @Test
    public void test1(){
        boolean expected = true;
        int [] input = {1,3,3,5};
        ArraySwap arraySwap = new ArraySwap();
        assertEquals(expected,arraySwap.solution(input));
    }

    @Test
    public void test2(){
        boolean expected = true;
        int [] input = {1,3,5};
        ArraySwap arraySwap = new ArraySwap();
        assertEquals(expected,arraySwap.solution(input));
    }

    @Test
    public void test3(){
        boolean expected = true;
        int [] input = {1,5,3,3,5};
        ArraySwap arraySwap = new ArraySwap();
        assertEquals(expected,arraySwap.solution(input));

    }

    @Test
    public void test3Index(){
        int expected = 3;
        int [] input = {1,5,3,3,5};
        ArraySwap arraySwap = new ArraySwap();
        assertEquals(expected,arraySwap.getSmallestIndex(1,input));

    }

    @Test
    public void test4(){
        boolean expected = true;
        int [] input = {1,3,5,3};
        ArraySwap arraySwap = new ArraySwap();
        assertEquals(expected,arraySwap.solution(input));
    }

    @Test
    public void test5(){
        boolean expected = true;
        int [] input = {1,3,5,3,7};
        ArraySwap arraySwap = new ArraySwap();
        assertEquals(expected,arraySwap.solution(input));
    }

    @Test
    public void test6(){
        boolean expected = true;
        int [] input = {6,3,3,1,7};
        ArraySwap arraySwap = new ArraySwap();
        assertEquals(expected,arraySwap.solution(input));
    }

    @Test
    public void test7(){
        boolean expected = false;
        int [] input = {6,3,1,1,7};
        ArraySwap arraySwap = new ArraySwap();
        assertEquals(expected,arraySwap.solution(input));
    }

    @Test
    public void test8(){
        boolean expected = true;
        int [] input = {0,1,3,1,7};
        ArraySwap arraySwap = new ArraySwap();
        assertEquals(expected,arraySwap.solution(input));
    }

    @Test
    public void test9(){
        boolean expected = true;
        int [] input = {1,3,2,1,7};
        ArraySwap arraySwap = new ArraySwap();
        assertEquals(expected,arraySwap.solution(input));
    }

    @Test
    public void test10(){
        boolean expected = true;
        int [] input = {1,3,2};
        ArraySwap arraySwap = new ArraySwap();
        assertEquals(expected,arraySwap.solution(input));
    }

    @Test
    public void test11(){
        boolean expected = true;
        int [] input = {1,2,3};
        ArraySwap arraySwap = new ArraySwap();
        assertEquals(expected,arraySwap.solution(input));
    }

    @Test
    public void test12(){
        boolean expected = true;
        int [] input = {1,2};
        ArraySwap arraySwap = new ArraySwap();
        assertEquals(expected,arraySwap.solution(input));
    }

    @Test
    public void test13(){
        boolean expected = true;
        int [] input = {2,1};
        ArraySwap arraySwap = new ArraySwap();
        assertEquals(expected,arraySwap.solution(input));
    }


    @Test
    public void test16(){
        boolean expected = false;
        int [] input = {1,2,3,4,11,16,0,1,2,3,4,6};
        ArraySwap arraySwap = new ArraySwap();
        assertEquals(expected,arraySwap.solution(input));
    }

    @Test
    public void test14(){
        boolean expected = true;
        int [] input = {13,1,2,10,12,12,-1};
        ArraySwap arraySwap = new ArraySwap();
        assertEquals(expected,arraySwap.solution(input));
    }
}
