package game;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class MaskerTest {
    @Test public void testGetsMaskedWord() {
        Masker masker = new Masker();
        ArrayList<Character> guessedLetters = new ArrayList<Character>();
        guessedLetters.add('A');
        guessedLetters.add('K');

        assertEquals("Should return correct masked word", "MAK___", masker.getsMaskedWord("MAKERS", guessedLetters));
    }
}
