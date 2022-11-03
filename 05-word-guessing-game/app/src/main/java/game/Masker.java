package game;

import java.util.ArrayList;

public class Masker {
    public static String getsMaskedWord(String completeWord, ArrayList<Character> guessedChar) {
        StringBuilder sBuilder = new StringBuilder(completeWord);
        for (int i = 1; i < completeWord.length(); i++) {
            if (!guessedChar.contains(completeWord.charAt(i))) {
                sBuilder.replace(i, i + 1, "_");
            }
        }
        return sBuilder.toString();
    }
}
