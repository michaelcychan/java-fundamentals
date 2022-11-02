package game;

import java.util.ArrayList;

public class Game {
  String word;
  Integer attemptsLeft;
  public static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};

  // create a constructor function, with the same name as the class
  public Game(String inputWord) {
    this.word = getRandomWordFromDictionary();
    this.attemptsLeft = 10;
    
  }

  public String getWordToGuess() {
    StringBuilder sBuilder = new StringBuilder(this.word);
    for (int i = 1; i < this.word.length(); i++) {
      sBuilder.replace(i, i + 1, "_");
    }
    String output = sBuilder.toString();
    return output;
  }

  public Integer getRemainingAttempts() {
    return this.attemptsLeft;
  }

  public String getRandomWordFromDictionary() {
    Integer index = (int) (Math.random() * DICTIONARY.length);
    return DICTIONARY[index];
  }
}
