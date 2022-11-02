package game;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GameTest {
    @Test public void testGetsWordToGuess() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTTEXT");

        Game game = new Game(mockedChooser);

        String expectedOutput = "T_______";
        assertEquals(game.getWordToGuess(), expectedOutput);
    }

    @Test public void testGetsInitialRemainingAttempts() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTTEXT");

        Game game = new Game(mockedChooser);
        assertEquals("Should start with 10 attempts", Integer.valueOf(10), game.getRemainingAttempts());
    }

    @Test public void testGetsWordToGuessWithRandomWord(){
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTTEXT");

        Game game = new Game(mockedChooser);
        assertEquals(game.getWordToGuess(), "T_______");
    }
}
