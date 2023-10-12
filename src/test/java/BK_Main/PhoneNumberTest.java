package BK_Main;

import BKMainTest.PhoneNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gujarat on 03/11/16.
 */
public class PhoneNumberTest {
    @Test
    public void test1(){
        String input = "00-44  48 5555 8361";
        String expected = "004-448-555-583-61";
        PhoneNumber phoneNumber = new PhoneNumber();
        assertEquals(expected,phoneNumber.solution(input));
    }

    @Test
    public void test2(){
        String input = "00-44        - 48 5555 8361";
        String expected = "004-448-555-583-61";
        PhoneNumber phoneNumber = new PhoneNumber();
        assertEquals(expected,phoneNumber.solution(input));
    }

    @Test
    public void test3(){
        String input = "0 - 22 1985--324";
        String expected = "022-198-53-24";
        PhoneNumber phoneNumber = new PhoneNumber();
        assertEquals(expected,phoneNumber.solution(input));
    }

    @Test
    public void test4(){
        String input = "555372654";
        String expected = "555-372-654";
        PhoneNumber phoneNumber = new PhoneNumber();
        assertEquals(expected,phoneNumber.solution(input));
    }

    @Test
    public void testString(){
        String input = "00-44  48 5555 8361";
        String expected = "00444855558361";
        PhoneNumber phoneNumber = new PhoneNumber();
        assertEquals(expected,phoneNumber.removeUnecessaryChar(input));
    }

    @Test
    public void test5(){
        String input = "00-44";
        String expected = "00-44";
        PhoneNumber phoneNumber = new PhoneNumber();
        assertEquals(expected,phoneNumber.solution(input));
    }

    @Test
    public void test9(){
        String input = "0044";
        String expected = "00-44";
        PhoneNumber phoneNumber = new PhoneNumber();
        assertEquals(expected,phoneNumber.solution(input));
    }

    @Test
    public void test6(){
        String input = "00";
        String expected = "00";
        PhoneNumber phoneNumber = new PhoneNumber();
        assertEquals(expected,phoneNumber.solution(input));
    }

    @Test
    public void test7(){
        String input = "003";
        String expected = "003";
        PhoneNumber phoneNumber = new PhoneNumber();
        assertEquals(expected,phoneNumber.solution(input));
    }

    @Test
    public void test10(){
        String input = "0031231";
        String expected = "003-12-31";
        PhoneNumber phoneNumber = new PhoneNumber();
        assertEquals(expected,phoneNumber.solution(input));
    }

}
