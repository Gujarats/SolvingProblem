package BK_Main;

import BKMainTest.CheckPassword;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gujarat on 03/11/16.
 */
public class CheckPasswordTest {

    @Test
    public void testCheckPassword(){
        String password = "Ba";
        boolean expected = true;
        CheckPassword checkPassword = new CheckPassword();
        assertEquals(expected,checkPassword.isCorrect(password));
    }

    @Test
    public void testCheckPassword1(){
        String password = "BaA";
        boolean expected = true;
        CheckPassword checkPassword = new CheckPassword();
        assertEquals(expected,checkPassword.isCorrect(password));
    }
    @Test
    public void testCheckPassword2(){
        String password = "Ba1";
        boolean expected = false;
        CheckPassword checkPassword = new CheckPassword();
        assertEquals(expected,checkPassword.isCorrect(password));
    }


    @Test
    public void testCount1(){
        String password = "Ba1";
        int expected = 2;
        CheckPassword checkPassword = new CheckPassword();
        assertEquals(expected,checkPassword.solution(password));
    }

    @Test
    public void testCount2(){
        String password = "a0Ba";
        int expected = 2;
        CheckPassword checkPassword = new CheckPassword();
        assertEquals(expected,checkPassword.solution(password));
    }

    @Test
    public void testCount3(){
        String password = "a0ba";
        int expected = -1;
        CheckPassword checkPassword = new CheckPassword();
        assertEquals(expected,checkPassword.solution(password));
    }

    @Test
    public void testCount4(){
        String password = "123";
        int expected = -1;
        CheckPassword checkPassword = new CheckPassword();
        assertEquals(expected,checkPassword.solution(password));
    }

    @Test
    public void testCount5(){
        String password = "a0baBasBsd12b";
        int expected = 6;
        CheckPassword checkPassword = new CheckPassword();
        assertEquals(expected,checkPassword.solution(password));
    }


}
