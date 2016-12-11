import maharishi.DigitIncreasing;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gujarat on 17/10/16.
 */
public class DigitIncreasingTest {


    public class testObject {
        private int input;
        private boolean expected;

        public testObject(int input, boolean expected) {
            this.input = input;
            this.expected = expected;
        }

        public int getInput() {
            return input;
        }

        public boolean isExpected() {
            return expected;
        }
    }

    public void DigitIncreasing(int input, boolean expected){
        try{
            DigitIncreasing digitIncreasing = new DigitIncreasing();
            assertEquals(expected,digitIncreasing.isDigitIncreasing(input));
        }catch (AssertionError ex){
            System.out.println("input = "+input);
            System.out.println("expected = "+expected);
            ex.printStackTrace();
        }

    }


    @Test
    public void testTable(){
        testObject[] testObjects = new testObject[]{
                new testObject(7,true),
                new testObject(36,true),
                new testObject(984,true),
                new testObject(7404,true),
                new testObject(37,false),
       };

        for (testObject test : testObjects){
            DigitIncreasing(test.getInput(),test.isExpected());
        }
    }

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
