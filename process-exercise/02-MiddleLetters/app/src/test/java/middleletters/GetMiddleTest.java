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
}
