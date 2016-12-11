package Codility;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by gujarat on 02/11/16.
 */
@RunWith(Parameterized.class)
public class BinaryGapTest {

    @Parameterized.Parameters(name = "Test {index}: LongestGapBinary ({0})={1}")
    public static Collection<Object[]> dataHighestLength() {
        return Arrays.asList(new Object[][] {
                { "1000010001", 4},
                { "10000100010000001", 6},
                { "101001000_2", 2},
        });
    }

    private String inputBinary;
    private int expected;

    private BinaryGap binaryGap = new BinaryGap();

    public BinaryGapTest(String inputBinary, int expected) {
        this.inputBinary = inputBinary;
        this.expected = expected;
    }

    @Test
    public void test(){
        assertEquals(expected,binaryGap.getHigestLengt(inputBinary));
    }
}
