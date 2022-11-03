package game;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GameTest {
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
        assertEquals("T_______", game.getWordToGuess());
    }

    @Test public void testGuessWrongLetter() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTTEXT");

        Game game = new Game(mockedChooser);
        
        assertEquals(false, game.guessLetter('Z'));
        assertEquals("Should down to 9 attempts after one wrong attempt", Integer.valueOf(9), game.getRemainingAttempts());
        assertEquals("encrypted word remains the same", "T_______", game.getWordToGuess());
    }

    @Test public void testGuessTwoWrongLetters() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTTEXT");

        Game game = new Game(mockedChooser);
        
        assertEquals(false, game.guessLetter('Z'));
        assertEquals(false, game.guessLetter('Y'));
        assertEquals(false, game.guessLetter('W'));
        assertEquals("Should down to 7 attempts after one wrong attempt", Integer.valueOf(7), game.getRemainingAttempts());
    }

    @Test public void testGuessCorrectLetter() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTTEXT");

        Game game = new Game(mockedChooser);
        
        assertEquals(true, game.guessLetter('E'));
        assertEquals("Should remain 10 attempts after one correct attempt", Integer.valueOf(10), game.getRemainingAttempts());
    }

    @Test public void testGuessCorrectLetterAndReturn() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTTEXT");

        Game game = new Game(mockedChooser);
        
        assertEquals(true, game.guessLetter('S'));
        assertEquals("Should remain 10 attempts after one correct attempt", Integer.valueOf(10), game.getRemainingAttempts());
        assertEquals("Should return a new text if guessed correctly once", "T_S_____", game.getWordToGuess());
    }

    @Test public void testGuessCorrectLetterAppearingMultipltTimesAndReturn() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTTEXT");

        Game game = new Game(mockedChooser);
        
        assertEquals(true, game.guessLetter('T'));
        assertEquals("Should remain 10 attempts after one correct attempt", Integer.valueOf(10), game.getRemainingAttempts());
        assertEquals("Should return a new text if guessed correctly once", "T__TT__T", game.getWordToGuess());
    }

    @Test public void testWinning() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TEA");

        Game game = new Game(mockedChooser);
        
        game.guessLetter('T');
        game.guessLetter('E');
        game.guessLetter('A');

        assertEquals(true, game.getWinStatus());
    }
    

}
