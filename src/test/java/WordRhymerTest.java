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
        String word = "EDUCATE";
        String possibleRhyme = "EDUCATE";
        // Act
        //// Call checkForRhyme with the above inputs
        boolean result = wordRhymer.checkForRhyme(word, possibleRhyme);
        // Assert
        //// Check checkForRhyme returned the correct result
        assertFalse(result);
    }

    @Test
    public void checkForRhyme_rhymes_bothWordsThreeOrMorePhonemes() {
        // Arrange
        String word = "COMMUNICATE";
        String possibleRhyme = "EDUCATE";
        // Act
        boolean result = wordRhymer.checkForRhyme(word, possibleRhyme);
        // Assert
        assertTrue(result);
    }

    @Test
    public void checkForRhyme_notRhymes_bothWordsThreeOrMorePhonemes() {
        // Arrange
        String word = "EDUCATE";
        String possibleRhyme = "VICE";
        // Act
        boolean result = wordRhymer.checkForRhyme(word, possibleRhyme);
        // Assert
        assertFalse(result);
    }

    @Test
    public void checkForRhyme_rhymes_wordLessThanThreePhonemes() {
        // Arrange
        String word = "ICE";
        String possibleRhyme = "VICE";
        // Act
        boolean result = wordRhymer.checkForRhyme(word, possibleRhyme);
        // Assert
        assertTrue(result);
    }

    @Test
    public void checkForRhyme_notRhymes_wordLessThanThreePhonemes() {
        // Arrange
        String word = "ICE";
        String possibleRhyme = "EDUCATE";
        // Act
        boolean result = wordRhymer.checkForRhyme(word, possibleRhyme);
        // Assert
        assertFalse(result);
    }

    @Test
    public void checkForRhyme_rhymes_possibleRhymeLessThanThreePhonemes() {
        // Arrange
        String word = "VICE";
        String possibleRhyme = "ICE";
        // Act
        boolean result = wordRhymer.checkForRhyme(word, possibleRhyme);
        // Assert
        assertTrue(result);
    }

    @Test
    public void checkForRhyme_notRhymes_possibleRhymeLessThanThreePhonemes() {
        // Arrange
        String word = "EDUCATE";
        String possibleRhyme = "ICE";
        // Act
        boolean result = wordRhymer.checkForRhyme(word, possibleRhyme);
        // Assert
        assertFalse(result);
    }
}