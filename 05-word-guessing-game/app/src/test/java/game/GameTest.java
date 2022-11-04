package game;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

public class GameTest {
    @Test public void testGetsInitialRemainingAttempts() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTTEXT");

        Masker mockedMasker = mock(Masker.class);
    
        Game game = new Game(mockedChooser, mockedMasker);
        assertEquals("Should start with 10 attempts", Integer.valueOf(10), game.getRemainingAttempts());
    }

    @Test public void testGetsWordToGuessWithRandomWord(){
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTTEXT");

        Masker mockedMasker = mock(Masker.class);
        when(mockedMasker.getsMaskedWord("TESTTEXT", new ArrayList<Character>())).thenReturn("T_______");

        Game game = new Game(mockedChooser, mockedMasker);
        assertEquals("T_______", game.getWordToGuess());
    }

    @Test public void testGuessWrongLetter() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTTEXT");

        Masker mockedMasker = mock(Masker.class);
        when(mockedMasker.getsMaskedWord("TESTTEXT", new ArrayList<Character>())).thenReturn("T_______");

        Game game = new Game(mockedChooser, mockedMasker);
        
        assertEquals(false, game.guessLetter('Z'));
        assertEquals("Should down to 9 attempts after one wrong attempt", Integer.valueOf(9), game.getRemainingAttempts());
        assertEquals("encrypted word remains the same", "T_______", game.getWordToGuess());
    }

    @Test public void testGuessTwoWrongLetters() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTTEXT");

        Masker mockedMasker = mock(Masker.class);
        when(mockedMasker.getsMaskedWord("TESTTEXT", new ArrayList<Character>())).thenReturn("T_______");

        Game game = new Game(mockedChooser, mockedMasker);
        
        assertEquals(false, game.guessLetter('Z'));
        assertEquals(false, game.guessLetter('Y'));
        assertEquals(false, game.guessLetter('W'));
        assertEquals("Should down to 7 attempts after one wrong attempt", Integer.valueOf(7), game.getRemainingAttempts());
    }

    @Test public void testGuessCorrectLetter() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTTEXT");

        Masker mockedMasker = mock(Masker.class);
        ArrayList mockguessedList = new ArrayList<Character>();
        mockguessedList.add('E');
        when(mockedMasker.getsMaskedWord("TESTTEXT", mockguessedList)).thenReturn("T_______");

        Game game = new Game(mockedChooser, mockedMasker);
        
        assertEquals(true, game.guessLetter('E'));
        assertEquals("Should remain 10 attempts after one correct attempt", Integer.valueOf(10), game.getRemainingAttempts());
    }

    @Test public void testGuessCorrectLetterAndReturn() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTTEXT");

        Masker mockedMasker = mock(Masker.class);
        ArrayList mockguessedList = new ArrayList<Character>();
        mockguessedList.add('S');
        when(mockedMasker.getsMaskedWord("TESTTEXT", mockguessedList)).thenReturn("T_S_____");
        Game game = new Game(mockedChooser, mockedMasker);
        
        assertEquals(true, game.guessLetter('S'));
        assertEquals("Should remain 10 attempts after one correct attempt", Integer.valueOf(10), game.getRemainingAttempts());
        assertEquals("Should return a new text if guessed correctly once", "T_S_____", game.getWordToGuess());
    }

    @Test public void testGuessCorrectLetterAppearingMultipltTimesAndReturn() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTTEXT");

        Masker mockedMasker = mock(Masker.class);
        ArrayList mockguessedList = new ArrayList<Character>();
        mockguessedList.add('T');
        when(mockedMasker.getsMaskedWord("TESTTEXT", mockguessedList)).thenReturn("T__TT__T");
        Game game = new Game(mockedChooser, mockedMasker);
        
        assertEquals(true, game.guessLetter('T'));
        assertEquals("Should remain 10 attempts after one correct attempt", Integer.valueOf(10), game.getRemainingAttempts());
        assertEquals("Should return a new text if guessed correctly once", "T__TT__T", game.getWordToGuess());
    }

    @Test public void testWinning() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TEA");

        Masker mockedMasker = mock(Masker.class);
        ArrayList mockguessedList = new ArrayList<Character>();
        mockguessedList.add('E');
        mockguessedList.add('A');

        when(mockedMasker.getsMaskedWord("TEA", mockguessedList)).thenReturn("TEA");
        Game game = new Game(mockedChooser, mockedMasker);
        
        game.guessLetter('E');
        game.guessLetter('A');

        assertEquals(true, game.getWinStatus());
    }

    @Test public void testWinningWithDuplicateChar() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("COOL");

        Masker mockedMasker = mock(Masker.class);
        ArrayList mockguessedList = new ArrayList<Character>();
        mockguessedList.add('O');
        mockguessedList.add('L');

        when(mockedMasker.getsMaskedWord("COOL", mockguessedList)).thenReturn("COOL");
        Game game = new Game(mockedChooser, mockedMasker);
        
        game.guessLetter('O');
        game.guessLetter('L');

        assertEquals(true, game.getWinStatus());
    }

    @Test public void testWinningWithDuplicateCharWithBeginning() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TEST");

        Masker mockedMasker = mock(Masker.class);

        Game game = new Game(mockedChooser, mockedMasker);
        
        game.guessLetter('E');
        game.guessLetter('S');
        assertEquals(false, game.getWinStatus());

        game.guessLetter('T');
        assertEquals(true, game.getWinStatus());
        
    }
    
    @Test public void testWinningWithTheWordDEVELOPER() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Masker mockedMasker = mock(Masker.class);

        Game game = new Game(mockedChooser, mockedMasker);
        
        game.guessLetter('E');
        game.guessLetter('V');
        game.guessLetter('L');
        game.guessLetter('O');
        game.guessLetter('R');
        assertEquals(false, game.getWinStatus());

        game.guessLetter('P');
        assertEquals(true, game.getWinStatus());
        
    }
}
