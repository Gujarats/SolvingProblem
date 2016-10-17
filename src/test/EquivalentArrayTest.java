import maharishi.EquivalentArrays;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gujarat on 17/10/16.
 */
public class EquivalentArrayTest {
    @Test
    public void equivalentArrayTest(){
        int [] a1 = {0,1,2};
        int [] a2 = {2,0,1};
        int expected = 1;
        EquivalentArrays equivalentArrays =new EquivalentArrays();
        assertEquals(expected,equivalentArrays.equivalentArrays(a1,a2));

    }

    @Test
    public void equivalentArrayTest1(){
        int [] a1 = {0,1,2,1};
        int [] a2 = {2,0,1};
        int expected = 1;
        EquivalentArrays equivalentArrays =new EquivalentArrays();
        assertEquals(expected,equivalentArrays.equivalentArrays(a1,a2));

    }

    @Test
    public void equivalentArrayTest2(){
        int [] a2 = {0,1,2,1};
        int [] a1 = {2,0,1};
        int expected = 1;
        EquivalentArrays equivalentArrays =new EquivalentArrays();
        assertEquals(expected,equivalentArrays.equivalentArrays(a1,a2));

    }

    @Test
    public void equivalentArrayTest3(){
        int [] a1 = {3,1,2,0};
        int [] a2 = {0,2,1,0};
        int expected = 0;
        EquivalentArrays equivalentArrays =new EquivalentArrays();
        assertEquals(expected,equivalentArrays.equivalentArrays(a1,a2));

    }

    @Test
    public void equivalentArrayTest5(){
        int [] a2 = {3,1,2,0};
        int [] a1 = {0,2,1,0};
        int expected = 0;
        EquivalentArrays equivalentArrays =new EquivalentArrays();
        assertEquals(expected,equivalentArrays.equivalentArrays(a1,a2));

    }

    @Test
    public void equivalentArrayTest6(){
        int [] a2 = {};
        int [] a1 = {0,2,1,0};
        int expected = 0;
        EquivalentArrays equivalentArrays =new EquivalentArrays();
        assertEquals(expected,equivalentArrays.equivalentArrays(a1,a2));

    }

    @Test
    public void equivalentArrayTest7(){
        int [] a1 = {};
        int [] a2 = {0,2,1,0};
        int expected = 0;
        EquivalentArrays equivalentArrays =new EquivalentArrays();
        assertEquals(expected,equivalentArrays.equivalentArrays(a1,a2));

    }

    @Test
    public void equivalentArrayTest8(){
        int [] a1 = {};
        int [] a2 = {};
        int expected = 1;
        EquivalentArrays equivalentArrays =new EquivalentArrays();
        assertEquals(expected,equivalentArrays.equivalentArrays(a1,a2));

    }
}
