package game;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GameTest {
    @Test public void testGetsInitialRemainingAttempts() {
        WordChooser mockedChooser = mock(WordChooser.class);
    
        Game game = new Game(mockedChooser);
        assertEquals("Should start with 10 attempts", Integer.valueOf(10), game.getRemainingAttempts());
    }

    @Test public void testGetsWordToGuessWithRandomWord(){
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTTEXT");

        Game game = new Game(mockedChooser);
        assertEquals(game.getWordToGuess(), "T_______");
    }

    @Test public void testGuessWrongLetter() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTTEXT");

        Game game = new Game(mockedChooser);
        
        assertEquals(false, game.guessLetter('Z'));
        assertEquals("Should down to 9 attempts after one wrong attempt", Integer.valueOf(9), game.getRemainingAttempts());
    }

    @Test public void testGuessCorrectLetter() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTTEXT");

        Game game = new Game(mockedChooser);
        
        assertEquals(true, game.guessLetter('E'));
        assertEquals("Should remain 10 attempts after one correct attempt", Integer.valueOf(10), game.getRemainingAttempts());
    }

}
