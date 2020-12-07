import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PhonemeDictionaryUtilitiesTest {
    @Test
    //TODO - implement me!
    public void isPhonemeEntry_CommentLine() {
        // Arrange
        //// Find an example of comment line
        String line = ";;;   - comments (like this section) are allowed";
        // Act
        //// Pass the line to isPhonemeEntry
        boolean isPhonemeEmptyResult = PhonemeDictionaryUtilities.isPhonemeEntry(line);
        // Assert
        //// Check isPhonemeEntry returned the correct result
        assertFalse(isPhonemeEmptyResult);
    }

    @Test
    //TODO - implement me!
    public void isPhonemeEntry_PhonemeLine() {
        // Arrange
        //// Find an example of phoneme line
        String line = "ABBREVIATE  AH0 B R IY1 V IY0 EY2 T";
        // Act
        //// Pass the line to isPhonemeEntry
        boolean isPhonemeEmptyResult = PhonemeDictionaryUtilities.isPhonemeEntry(line);
        // Assert
        //// Check isPhonemeEntry returned the correct result
        assertTrue(isPhonemeEmptyResult);
    }

    @Test
    //TODO - implement me!
    public void getWordFromLineReturnsWord() {
        // Arrange
        //// Find an example of phoneme line
        String line = "ABBREVIATE  AH0 B R IY1 V IY0 EY2 T";
        // Act
        //// Pass the line to getWordFromLine
        String getWordFromLineResult = PhonemeDictionaryUtilities.getWordFromLine(line);
        // Assert
        //// Check getWordFromLine returned the correct word and nothing more
        assertEquals(getWordFromLineResult, "ABBREVIATE");
    }

    @Test
    //TODO - implement me!
    public void getPhonemesFromLineReturnsPhonemes() {
        // Arrange
        //// Find an example of phoneme line
        //// Create a list of what you expect to get back from getPhonemesFromLine
        String line = "ABBREVIATE  AH0 B R IY1 V IY0 EY2 T";
        ArrayList <String> expectedPhonemes = new ArrayList<String>();
        expectedPhonemes.add("AH0");
        expectedPhonemes.add("B");
        expectedPhonemes.add("R");
        expectedPhonemes.add("IY1");
        expectedPhonemes.add("V");
        expectedPhonemes.add("IY0");
        expectedPhonemes.add("EY2");
        expectedPhonemes.add("T");
        // Act
        //// Pass the line to getPhonemesFromLine
        ArrayList <String> getPhonemesFromLineResult = new ArrayList<String>();
        getPhonemesFromLineResult = PhonemeDictionaryUtilities.getPhonemesFromLine(line);
        // Assert
        //// Check getPhonemesFromLine returned the correct list
        assertEquals(expectedPhonemes, getPhonemesFromLineResult);
    }
}
