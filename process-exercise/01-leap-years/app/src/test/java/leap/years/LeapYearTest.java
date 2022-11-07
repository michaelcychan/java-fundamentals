package leap.years;

import org.junit.Test;
import static org.junit.Assert.*;
public class LeapYearTest {
    @Test public void testYear2000() {
        Boolean expected = true;
        Boolean actual = LeapYear.isLeap(2000);
        assertEquals("Year 2000 is a leap year", expected, actual);
    }
    @Test public void testYear1970() {
        Boolean expected = false;
        Boolean actual = LeapYear.isLeap(1970);
        assertEquals("Year 1970 is not a leap year", expected, actual);
    }
    @Test public void testYear1900() {
        Boolean expected = false;
        Boolean actual = LeapYear.isLeap(1900);
        assertEquals("Year 1900 is not a leap year", expected, actual);
    }
    @Test public void testYear1988() {
        Boolean expected = true;
        Boolean actual = LeapYear.isLeap(1988);
        assertEquals("Year 1988 is a leap year", expected, actual);
    }
    @Test public void testYear1500() {
        Boolean expected = false;
        Boolean actual = LeapYear.isLeap(1500);
        assertEquals("Year 1500 is not a leap year", expected, actual);
    }
    @Test public void testYear2023() {
        Boolean expected = false;
        Boolean actual = LeapYear.isLeap(2023);
        assertEquals("Year 2023 is not a leap year", expected, actual);
    }
}
