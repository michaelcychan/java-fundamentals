package game;

public class Game {
    String word;
    Integer attemptsLeft;

    // create a constructor function, with the same name as the class
    public Game(WordChooser wordChooser) {
        this.word = wordChooser.getRandomWordFromDictionary();
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
}
