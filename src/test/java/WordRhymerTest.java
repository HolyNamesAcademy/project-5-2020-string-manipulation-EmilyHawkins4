import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test class for WordRhymer
 */
public class WordRhymerTest {

    private WordRhymer wordRhymer = new WordRhymer();

    @Test
    public void checkForRhyme_wordDoesNotRhymeWithSelf() {
        // Arrange
        //// Choose a word
        //// Choose a possible rhyme that is the same as above word
        String word = "ABBREVIATE";
        String possibleRhyme = "ABBREVIATE";
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
        String word = "BANISH";
        String possibleRhyme = "SPANISH";
        // Act
        //// Call checkForRhyme with the above inputs
        boolean result = wordRhymer.checkForRhyme(word, possibleRhyme);
        // Assert
        //// Check checkForRhyme returned the correct result
        assertTrue(result);
    }

    @Test
    public void checkForRhyme_notRhymes_bothWordsThreeOrMorePhonemes() {
        // Arrange
        //// Choose a word with three or more phonemes
        //// Choose a non-rhyming word with three or more phonemes
        String word = "SPALLA";
        String possibleRhyme = "KNOWING";
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
        String word = "I";
        String possibleRhyme = "FLY";
        // Act
        //// Call checkForRhyme with the above inputs
        boolean result = wordRhymer.checkForRhyme(word, possibleRhyme);
        // Assert
        //// Check checkForRhyme returned the correct result
        assertTrue(result);
    }

    @Test
    public void checkForRhyme_notRhymes_wordLessThanThreePhonemes() {
        // Arrange
        //// Choose a word with three or more phonemes
        //// Choose a non-rhyming word with three or more phonemes
        String word = "DAY";
        String possibleRhyme = "SPANISH";
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
        String word = "FLY";
        String possibleRhyme = "I";
        // Act
        //// Call checkForRhyme with the above inputs
        boolean result = wordRhymer.checkForRhyme(word, possibleRhyme);
        // Assert
        //// Check checkForRhyme returned the correct result
        assertTrue(result);
    }

    @Test
    public void checkForRhyme_notRhymes_possibleRhymeLessThanThreePhonemes() {
        // Arrange
        //// Choose a word with three or more phonemes
        //// Choose a non-rhyming word with three or more phonemes
        String word = "SPANISH";
        String possibleRhyme = "DAY";
        // Act
        //// Call checkForRhyme with the above inputs
        boolean result = wordRhymer.checkForRhyme(word, possibleRhyme);
        // Assert
        //// Check checkForRhyme returned the correct result
        assertFalse(result);
    }
}
