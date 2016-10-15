import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gujarat on 12/10/16.
 */
public class DigitExerciseTest {

    @Test
    public void testGetDigit(){
        DigitExercise digitExercise = new DigitExercise();
        int inputNumber = 1223221;
        assertEquals(1, digitExercise.firstDigit(inputNumber));

        inputNumber = 9012;
        assertEquals(9, digitExercise.firstDigit(inputNumber));

        // Test Second Digiti
        inputNumber = 122;
        assertEquals(2, digitExercise.secondDigit(inputNumber));
        inputNumber = 1332;
        assertEquals(3, digitExercise.secondDigit(inputNumber));
        inputNumber = 1934;
        assertEquals(9, digitExercise.secondDigit(inputNumber));

        //Test Third Digit
        inputNumber = 122;
        assertEquals(2, digitExercise.thirdDigit(inputNumber));
        inputNumber = 1324;
        assertEquals(2, digitExercise.thirdDigit(inputNumber));
        inputNumber = 1999999;
        assertEquals(9, digitExercise.thirdDigit(inputNumber));

        //Test Last Digit
        inputNumber = 123;
        assertEquals(3, digitExercise.lastDigit(inputNumber));
        inputNumber = 99;
        assertEquals(9, digitExercise.lastDigit(inputNumber));

        System.out.println(String.valueOf(Integer.MAX_VALUE));
    }

    @Test
    public void testPalindormic(){
        DigitExercise digitExercise = new DigitExercise();

        int inputNumber = 1221;
        assertEquals(true,digitExercise.isPalindormic(inputNumber));


        inputNumber = 12321;
        assertEquals(true,digitExercise.isPalindormic(inputNumber));

        inputNumber = 123321;
        assertEquals(true,digitExercise.isPalindormic(inputNumber));

        inputNumber = 1123321;
        assertEquals(false,digitExercise.isPalindormic(inputNumber));

    }

    @Test
    public void TestCountDigit(){
        DigitExercise digitExercise = new DigitExercise();

        int inputNumber = 9;
        assertEquals(1,digitExercise.getDigit(inputNumber));

        inputNumber = 90;
        assertEquals(2,digitExercise.getDigit(inputNumber));

        inputNumber = 900;
        assertEquals(3,digitExercise.getDigit(inputNumber));

        inputNumber = 9000;
        assertEquals(4,digitExercise.getDigit(inputNumber));

        inputNumber = 90000;
        assertEquals(5,digitExercise.getDigit(inputNumber));

        inputNumber = 900000;
        assertEquals(6,digitExercise.getDigit(inputNumber));

        inputNumber = 9000000;
        assertEquals(7,digitExercise.getDigit(inputNumber));

        inputNumber = 90000000;
        assertEquals(8,digitExercise.getDigit(inputNumber));

        inputNumber = 900000000;
        assertEquals(9,digitExercise.getDigit(inputNumber));

        inputNumber = 1000000000;
        assertEquals(10,digitExercise.getDigit(inputNumber));



        inputNumber = 9;
        assertEquals(1,digitExercise.getDigit2(inputNumber));

        inputNumber = 90;
        assertEquals(2,digitExercise.getDigit2(inputNumber));

        inputNumber = 900;
        assertEquals(3,digitExercise.getDigit2(inputNumber));

        inputNumber = 9000;
        assertEquals(4,digitExercise.getDigit2(inputNumber));

        inputNumber = 90000;
        assertEquals(5,digitExercise.getDigit2(inputNumber));

        inputNumber = 900000;
        assertEquals(6,digitExercise.getDigit2(inputNumber));

        inputNumber = 9000000;
        assertEquals(7,digitExercise.getDigit2(inputNumber));

        inputNumber = 90000000;
        assertEquals(8,digitExercise.getDigit2(inputNumber));

        inputNumber = 900000000;
        assertEquals(9,digitExercise.getDigit2(inputNumber));

        inputNumber = 1000000000;
        assertEquals(10,digitExercise.getDigit2(inputNumber));
    }
}
