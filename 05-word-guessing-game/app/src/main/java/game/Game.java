package game;

import java.util.ArrayList;

public class Game {
    // Create variables opportunity to be declared in constructor function
    private String word;
    private Integer attemptsLeft;
    private ArrayList<Character> guessedChr;
    private Boolean win;

    // create a constructor function, with the same name as the class
    public Game(WordChooser wordChooser) {
        this.word = wordChooser.getRandomWordFromDictionary();
        this.attemptsLeft = 10;
        this.guessedChr = new ArrayList<Character>();
        this.win = false;
    }

    public String getWordToGuess() {
        StringBuilder sBuilder = new StringBuilder(this.word);
        this.win = true;
        for (int i = 1; i < this.word.length(); i++) {
            if (this.guessedChr.contains(this.word.charAt(i))) {} else {
                sBuilder.replace(i, i + 1, "_");
                this.win = false;
            }
        }
        return sBuilder.toString();
    }

    public Integer getRemainingAttempts() {
        return this.attemptsLeft;
    }

    public Boolean guessLetter(Character chr) {
        if (this.word.indexOf(chr) == -1) {
            this.attemptsLeft -= 1;
            return false;
        } else {
            this.guessedChr.add(chr);
            return true;
        }
    }

    public Boolean getWinStatus(){
        return this.win;
    }
}
