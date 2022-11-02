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
}
