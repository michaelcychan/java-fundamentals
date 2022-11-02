package game;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class WordChooserTest {
    @Test public void shouldGetARandomWordFromDictionary() {
        WordChooser wc = new WordChooser();
        String[] mock_dict = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};
        assertTrue("The returned text is not in the list", Arrays.asList(mock_dict).contains(wc.getRandomWordFromDictionary()));
    }
}
