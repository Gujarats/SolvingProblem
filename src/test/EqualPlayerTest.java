import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gujarat on 26/10/16.
 */
public class EqualPlayerTest {
    @Test
    public void testGetPlayerIdTrue(){
        EqualPlayer equalPlayer = new EqualPlayer();
        String result = equalPlayer.getEqualPlayer(10);
        String expected = "( ( a vs b ) vs ( ( c vs d ) vs e ) ) vs ( ( f vs g ) vs ( ( h vs i ) vs j ) )";
        assertEquals(expected,result);
    }

}
