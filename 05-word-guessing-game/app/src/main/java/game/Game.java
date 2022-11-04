package game;

import java.util.ArrayList;

public class Game {
    // Create variables opportunity to be declared in constructor function
    private String word;
    private Integer attemptsLeft;
    private ArrayList<Character> guessedChr;
    private Boolean win;
    private Integer uniqChar;
    private Masker masker;

    // create a constructor function, with the same name as the class
    public Game(WordChooser wordChooser, Masker masker) {
        this.word = wordChooser.getRandomWordFromDictionary();
        this.masker = masker;
        this.attemptsLeft = 10;
        this.guessedChr = new ArrayList<Character>();
        this.win = false;
        this.uniqChar = (int) this.word.substring(1).chars().distinct().count();
    }

    public String getWordToGuess() {
        return this.masker.getsMaskedWord(this.word, this.guessedChr);
    }

    public Integer getRemainingAttempts() {
        return this.attemptsLeft;
    }

    public Boolean guessLetter(Character chr) {
        if (this.word.indexOf(chr) == -1) {
            this.attemptsLeft -= 1;
            return false;
        } else {
            if (this.guessedChr.indexOf(chr) == -1) {
                this.guessedChr.add(chr);
            }
            if (this.guessedChr.size() == this.uniqChar) {
                this.win = true;
            }
            return true;
        }
    }

    public Boolean getWinStatus(){
        return this.win;
    }
}
