import java.util.ArrayList;
import java.util.List;

/** Helper class for finding rhymes. */
public class RhymeGenerator {

    // The class that can provide possible rhymes, and determine if two words are rhymes
    private WordRhymer rhymer = new WordRhymer();

    /**
     * Generates a list up to numRhymingWords size of words that rhyme with wordToRhyme.
     *
     * @param wordToRhyme     - the word to find rhyming words for
     * @param numRhymingWords - the maximum number of rhyming words to find
     * @return A list containing words that rhyme with wordToRhyme. If no rhyming words can be found and empty list
     * will be returned.
     */
    //TODO finish steps
    public List<String> findRhymingWords(String wordToRhyme, int numRhymingWords) {
       List<String> rhymes = new ArrayList<>();
        PhonemeDictionary phonemeDictionary = new PhonemeDictionary("resources/tst/testCmuDict.txt");
        List<String> phonemesForWord = phonemeDictionary.getPhonemes(wordToRhyme);
        String rhymeWord = phonemesForWord.get(phonemesForWord.size()-1);
        //loop through phonemes of other words

        // check if phonemes are the same

        // add to arraylist
        return rhymes;
    }
}
