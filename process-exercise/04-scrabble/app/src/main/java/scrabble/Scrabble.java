package scrabble;

import java.util.Hashtable;

public class Scrabble {
    private int score;
    private String text;
    private Hashtable<String, Integer> scoresTable = new Hashtable<>();

    public Scrabble(String text) {
        presetScoresTable();
        if (text == null) {
            this.text = "";
        } else {
            this.text = text;
        }
        if (this.text == "") {
            this.score = 0;
        } else {
            calculatePoints();
        }
    }

    public int score() {
        return score;
    }

    private void presetScoresTable() {
        scoresTable.put("a", 1);
        scoresTable.put("b", 3);
        scoresTable.put("e", 1);
        scoresTable.put("f", 4);
        scoresTable.put("i", 1);
        scoresTable.put("h", 4);
        scoresTable.put("k", 5);
        scoresTable.put("n", 1);
        scoresTable.put("o", 1);
        scoresTable.put("p", 3);
        scoresTable.put("q", 10);
        scoresTable.put("r", 1);
        scoresTable.put("s", 1);
        scoresTable.put("t", 1);
        scoresTable.put("u", 1);
        scoresTable.put("x", 8);
        scoresTable.put("y", 4);
        scoresTable.put("z", 10);
    }

    private void calculatePoints(){
        for (int i = 0; i < this.text.length(); i++) {
            Integer charPoint = scoresTable.get(this.text.substring(i,i+1).toLowerCase());
            if (charPoint != null) {
                this.score += charPoint;
            }
        }
    }
}
