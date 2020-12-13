import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test class for WordRhymer
 */
public class WordRhymerTest {

    private WordRhymer wordRhymer = new WordRhymer();

    @Test
    //TODO check works
    public void checkForRhyme_wordDoesNotRhymeWithSelf() {
        // Arrange
        //// Choose a word
        //// Choose a possible rhyme that is the same as above word
        String word = "ABBREVIATE  AH0 B R IY1 V IY0 EY2 T";
        String possibleRhyme = "ABDUCTOR  AE0 B D AH1 K T ER0";
        // Act
        //// Call checkForRhyme with the above inputs
        boolean result = wordRhymer.checkForRhyme(word, possibleRhyme);
        // Assert
        //// Check checkForRhyme returned the correct result
        assertFalse(result);
    }

    @Test
    //TODO check works
    public void checkForRhyme_rhymes_bothWordsThreeOrMorePhonemes() {
        // Arrange
        //// Choose a word with three or more phonemes
        //// Choose a rhyming word with three or more phonemes
        String word = "BANISH  B AE1 N IH0 SH";
        String possibleRhyme = "SPANISH  S P AE1 N IH0 SH";
        // Act
        //// Call checkForRhyme with the above inputs
        boolean result = wordRhymer.checkForRhyme(word, possibleRhyme);
        // Assert
        //// Check checkForRhyme returned the correct result
        assertTrue(result);
    }

    @Test
    //TODO check works
    public void checkForRhyme_notRhymes_bothWordsThreeOrMorePhonemes() {
        // Arrange
        //// Choose a word with three or more phonemes
        //// Choose a non-rhyming word with three or more phonemes
        String word = "SPALLA  S P AE1 L AH0";
        String possibleRhyme = "KNOWING  N OW1 IH0 NG";
        // Act
        //// Call checkForRhyme with the above inputs
        boolean result = wordRhymer.checkForRhyme(word, possibleRhyme);
        // Assert
        //// Check checkForRhyme returned the correct result
        assertFalse(result);
    }

    @Test
    //TODO check works
    public void checkForRhyme_rhymes_wordLessThanThreePhonemes() {
        // Arrange
        //// Choose a word with three or more phonemes
        //// Choose a non-rhyming word with three or more phonemes
        String word = "I  AY1";
        String possibleRhyme = "FLY  F L AY1";
        // Act
        //// Call checkForRhyme with the above inputs
        boolean result = wordRhymer.checkForRhyme(word, possibleRhyme);
        // Assert
        //// Check checkForRhyme returned the correct result
        assertTrue(result);
    }

    @Test
    //TODO check works
    public void checkForRhyme_notRhymes_wordLessThanThreePhonemes() {
        // Arrange
        //// Choose a word with three or more phonemes
        //// Choose a non-rhyming word with three or more phonemes
        String word = "DAY  D EY1";
        String possibleRhyme = "SPANISH  S P AE1 N IH0 SH";
        // Act
        //// Call checkForRhyme with the above inputs
        boolean result = wordRhymer.checkForRhyme(word, possibleRhyme);
        // Assert
        //// Check checkForRhyme returned the correct result
        assertFalse(result);
    }

    @Test
    //TODO check works
    public void checkForRhyme_rhymes_possibleRhymeLessThanThreePhonemes() {
        // Arrange
        //// Choose a word with three or more phonemes
        //// Choose a non-rhyming word with three or more phonemes
        String word = "FLY  F L AY1";
        String possibleRhyme = "I  AY1";
        // Act
        //// Call checkForRhyme with the above inputs
        boolean result = wordRhymer.checkForRhyme(word, possibleRhyme);
        // Assert
        //// Check checkForRhyme returned the correct result
        assertTrue(result);
    }

    @Test
    //TODO check works
    public void checkForRhyme_notRhymes_possibleRhymeLessThanThreePhonemes() {
        // Arrange
        //// Choose a word with three or more phonemes
        //// Choose a non-rhyming word with three or more phonemes
        String word = "SPANISH  S P AE1 N IH0 SH";
        String possibleRhyme = "DAY  D EY1";
        // Act
        //// Call checkForRhyme with the above inputs
        boolean result = wordRhymer.checkForRhyme(word, possibleRhyme);
        // Assert
        //// Check checkForRhyme returned the correct result
        assertFalse(result);
    }
}
