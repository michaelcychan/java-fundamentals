package scrabble;

import org.junit.Test;
import static org.junit.Assert.*;

public class ScrabbleTest {
    @Test public void testEmpty() {
        Scrabble scrabble = new Scrabble("");
        int expected = 0;
        int actual = scrabble.score();

        assertEquals("Empty string has 0 point", expected, actual);
    }

    @Test public void testSpecialCharacters() {
        Scrabble scrabble = new Scrabble(" \t\n");
        int expected = 0;
        int actual = scrabble.score();

        assertEquals("Special characters have 0 point", expected, actual);
    }

    @Test public void testNullParameter() {
        Scrabble scrabble = new Scrabble(null);
        int expected = 0;
        int actual = scrabble.score();

        assertEquals("Null inputs have 0 point", expected, actual);
    }

    @Test public void testCharacterA() {
        Scrabble scrabble = new Scrabble("a");
        int expected = 1;
        int actual = scrabble.score();

        assertEquals("a has 1 point", expected, actual);
    }

    @Test public void testCharacterF() {
        Scrabble scrabble = new Scrabble("f");
        int expected = 4;
        int actual = scrabble.score();

        assertEquals("f has 4 points", expected, actual);
    }

    @Test public void testWordStreet() {
        Scrabble scrabble = new Scrabble("street");
        int expected = 6;
        int actual = scrabble.score();

        assertEquals("street has 6 points", expected, actual);
    }

    @Test public void testWordQuirky() {
        Scrabble scrabble = new Scrabble("quirky");
        int expected = 22;
        int actual = scrabble.score();

        assertEquals("quirky has 22 points", expected, actual);
    }

    @Test public void testWordCapitalOXYPHENBUTAZONE() {
        Scrabble scrabble = new Scrabble("OXYPHENBUTAZONE");
        int expected = 41;
        int actual = scrabble.score();

        assertEquals("OXYPHENBUTAZONE has 41 points", expected, actual);
    }
}
