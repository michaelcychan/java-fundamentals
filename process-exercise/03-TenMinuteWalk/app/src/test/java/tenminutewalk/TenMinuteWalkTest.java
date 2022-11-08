package tenminutewalk;

import org.junit.Test;
import static org.junit.Assert.*;
public class TenMinuteWalkTest {
    @Test public void testTooShortWalk() {
        char[] walkArray = {'w', 's'};

        boolean expected = false;
        boolean actual = TenMinuteWalk.valid(walkArray);
        assertEquals("The input walk array does not match criteria", expected, actual);
    }

    @Test public void testAValidInput() {
        char[] walkArray = {'w', 's', 'e', 'e', 'n', 'n', 'e', 's', 'w', 'w'};

        boolean expected = true;
        boolean actual = TenMinuteWalk.valid(walkArray);
        assertEquals("The input walk array matches criteria", expected, actual);
    }

    @Test public void testAWrongWalk() {
        char[] walkArray = {'w', 's', 'e', 'n', 'n', 'e', 's', 'w', 'w', 'w'};

        boolean expected = false;
        boolean actual = TenMinuteWalk.valid(walkArray);
        assertEquals("The input walk does not return to the same position", expected, actual);
    }

    @Test public void testAnotherWrongWalk() {
        char[] walkArray = {'w', 's', 'e', 's', 's', 'e', 's', 'w', 'n', 'n'};

        boolean expected = false;
        boolean actual = TenMinuteWalk.valid(walkArray);
        assertEquals("The input walk does not return to the same position", expected, actual);
    }
}
