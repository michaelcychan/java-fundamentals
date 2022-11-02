package game;

public class WordChooser {
    public static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};

    public void main() {}

    public String getRandomWordFromDictionary() {
        Integer index = (int) (Math.random() * DICTIONARY.length);
        return DICTIONARY[index];
    }

}
