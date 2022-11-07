package middleletters;

import org.junit.Test;
import static org.junit.Assert.*;
public class GetMiddleTest {
    @Test public void testWordTest(){
        String expected = "es";
        String actual = GetMiddle.getMiddle("test");
        String errorMessage = "The middle letters for the word \"test\" is \"es\"";
        assertEquals(errorMessage, expected, actual );
    }
    @Test public void testWordTesting(){
        String expected = "t";
        String actual = GetMiddle.getMiddle("testing");
        String errorMessage = "The middle letters for the word \"testing\" is \"t\"";
        assertEquals(errorMessage, expected, actual );
    }
    @Test public void testWordMiddle(){
        String expected = "dd";
        String actual = GetMiddle.getMiddle("middle");
        String errorMessage = "The middle letters for the word \"middle\" is \"dd\"";
        assertEquals(errorMessage, expected, actual );
    }
    @Test public void testWordA(){
        String expected = "A";
        String actual = GetMiddle.getMiddle("A");
        String errorMessage = "The middle letters for the word \"A\" is \"A\"";
        assertEquals(errorMessage, expected, actual );
    }

    @Test public void testWordof(){
        String expected = "of";
        String actual = GetMiddle.getMiddle("of");
        String errorMessage = "The middle letters for the word \"of\" is \"of\"";
        assertEquals(errorMessage, expected, actual );
    }
}
