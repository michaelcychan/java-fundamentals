package game;


import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
  @Test public void testGetsWordToGuess() {
    String inputWord = "MAKERS";
    Game game = new Game(inputWord);

    String expectedOutput = "M_____";
    assertEquals(game.getWordToGuess(), expectedOutput);
  }

  @Test public void testGetsInitialRemainingAttempts() {
    String inputWord = "MAKERS";
    Game game = new Game(inputWord);

    assertEquals("Should start with 10 attempts", Integer.valueOf(10), game.getRemainingAttempts());
  }

  @Test public void testGetRandomWord() {
    String inputWord = "MAKERS";
    Game game = new Game(inputWord);

    assertEquals("Should return MAKERS", String.valueOf("MAKERS"), game.getRandomWordFromDictionary());
  }
}
