import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by gujarat on 15/10/16.
 */
public class GetCharacterTest {
    @Test
    public void testGetChar(){
        char [] inputArray = new char[]{'a','b','c'};
        int startIndex = 0;
        int endIndex = 4;
        GetCharacter getCharacter = new GetCharacter();
        char[] result = getCharacter.getCharacter(inputArray,startIndex,endIndex);

        assertArrayEquals(null,result);
    }

    @Test
    public void restGetChar2(){
        char [] inputArray = new char[]{'a','b','c'};
        int startIndex = 0;
        int endIndex = 3;
        GetCharacter getCharacter = new GetCharacter();
        char[] result = getCharacter.getCharacter(inputArray,startIndex,endIndex);
        char [] expected = new char[]{'a','b','c'};
        assertArrayEquals(expected,result);
    }

    @Test
    public void restGetChar3(){
        char [] inputArray = new char[]{'a','b','c'};
        int startIndex = 0;
        int endIndex = 2;
        GetCharacter getCharacter = new GetCharacter();
        char[] result = getCharacter.getCharacter(inputArray,startIndex,endIndex);
        char [] expected = new char[]{'a','b'};
        assertArrayEquals(expected,result);
    }

    @Test
    public void restGetChar4(){
        char [] inputArray = new char[]{'a','b','c'};
        int startIndex = 2;
        int endIndex = 2;
        GetCharacter getCharacter = new GetCharacter();
        char[] result = getCharacter.getCharacter(inputArray,startIndex,endIndex);
        assertArrayEquals(null,result);
    }

    @Test
    public void restGetChar5(){
        char [] inputArray = new char[]{'a','b','c'};
        int startIndex = 0;
        int endIndex = 1;
        GetCharacter getCharacter = new GetCharacter();
        char[] result = getCharacter.getCharacter(inputArray,startIndex,endIndex);
        char [] expected = new char[]{'a'};
        assertArrayEquals(expected,result);
    }
    @Test
    public void restGetChar6(){
        char [] inputArray = new char[]{'a','b','c'};
        int startIndex = 2;
        int endIndex = 1;
        GetCharacter getCharacter = new GetCharacter();
        char[] result = getCharacter.getCharacter(inputArray,startIndex,endIndex);
        char [] expected = new char[]{'c'};
        assertArrayEquals(expected,result);
    }

    @Test
    public void testGetChar7(){
        char [] inputArray = new char[]{'a','b','c'};
        int startIndex = 3;
        int endIndex = 1;
        GetCharacter getCharacter = new GetCharacter();
        char[] result = getCharacter.getCharacter(inputArray,startIndex,endIndex);

        assertArrayEquals(null,result);
    }

    @Test
    public void testGetChar8(){
        char [] inputArray = new char[]{'a','b','c'};
        int startIndex = -1;
        int endIndex = -1;
        GetCharacter getCharacter = new GetCharacter();
        char[] result = getCharacter.getCharacter(inputArray,startIndex,endIndex);

        assertArrayEquals(null,result);
    }

    @Test
    public void testGetChar9(){
        char [] inputArray = {'a','b','c'};
        int startIndex = 1;
        int endIndex = 0;
        GetCharacter getCharacter = new GetCharacter();
        char[] result = getCharacter.getCharacter(inputArray,startIndex,endIndex);
        char [] expected = {};
        assertArrayEquals(expected,result);
    }

    @Test
    public void testGetChar10(){
        char [] inputArray = {'a','b','c'};
        int startIndex = 1;
        int endIndex = 0;
        GetCharacter getCharacter = new GetCharacter();
        char[] result = getCharacter.getCharBest(inputArray,startIndex,endIndex);
        char [] expected = {};
        assertArrayEquals(expected,result);
    }

    @Test
    public void testGetChar11(){
        char [] inputArray = new char[]{'a','b','c','e','f'};
        int startIndex = -1;
        int endIndex = 1;
        GetCharacter getCharacter = new GetCharacter();
        char[] result = getCharacter.getCharBest(inputArray,startIndex,endIndex);

        assertArrayEquals(null,result);
    }

    @Test
    public void testGetChar12(){
        char [] inputArray = new char[]{'a','b','c','e','f'};
        int startIndex = 0;
        int endIndex = -2;
        GetCharacter getCharacter = new GetCharacter();
        char[] result = getCharacter.getCharBest(inputArray,startIndex,endIndex);

        assertArrayEquals(null,result);
    }

    @Test
    public void testGetChar13(){
        char [] inputArray = new char[]{'a','b','c','e','f'};
        int startIndex = 2;
        int endIndex =  2;
        GetCharacter getCharacter = new GetCharacter();
        char[] result = getCharacter.getCharBest(inputArray,startIndex,endIndex);
        char [] expected = new char[]{'c','e'};
        assertArrayEquals(expected,result);
    }
}
