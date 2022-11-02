package game;

public class Game {
  String word;
  // create a constructor function, with the same name as the class
  public Game(String inputWord) {
    word = inputWord;
  }

  public String getWordToGuess() {
    StringBuilder sBuilder = new StringBuilder(word);
    for (int i = 1; i < word.length(); i++) {
      sBuilder.replace(i, i + 1, "_");
    }
    String output = sBuilder.toString();
    return output;
  }
}
