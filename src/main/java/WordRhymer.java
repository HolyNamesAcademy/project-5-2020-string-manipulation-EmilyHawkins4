import java.util.ArrayList;
import java.util.List;

/**
 * Class that provides users with words that are eligible to be rhymes, and also checks whether words rhyme.
 * Rhymes are based on the matching of the words final phonemes.
 */
public class WordRhymer {

    private PhonemeDictionary phonemeDictionary = new PhonemeDictionary();

    /**
     * Returns the list of all words that are available for rhyming.
     *
     * @return the list of all possible rhymes
     */
    public List<String> getAllPossibleRhymes() {
        return phonemeDictionary.getEntries();
    }

    /**
     * Determines whether two words rhyme. A rhyme is determined by matching the final phonemes of the words.
     * Two words will be considered rhymes if their final three phonemes match. If either word has fewer than three
     * phonemes, all phonemes for the word with fewer than three phonemes must match at the end of the other word.
     *
     * @param word          - the phonemes for the word to be rhymed with
     * @param possibleRhyme - the phonemes for the word being considered a rhyme
     * @return true if possibleRhyme is a rhyme with word as determined by the phoneme matching rule noted above
     */
    //TODO check works
    public boolean checkForRhyme(String word, String possibleRhyme) {
        PhonemeDictionary phonemeDictionary = new PhonemeDictionary("resources/tst/testCmuDict.txt");
        ArrayList<String> wordEndingPhonemes = new ArrayList<>();
        wordEndingPhonemes = PhonemeDictionaryUtilities.getPhonemesFromLine(word);
        ArrayList<String> possibleRhymeEndingPhonemes = new ArrayList<>();
        possibleRhymeEndingPhonemes = PhonemeDictionaryUtilities.getPhonemesFromLine(possibleRhyme);
         int indexSubtraction = 2;
         while(indexSubtraction>=0){
             if(wordEndingPhonemes.get(wordEndingPhonemes.size()-indexSubtraction).equals(possibleRhymeEndingPhonemes.get(possibleRhymeEndingPhonemes.size()-indexSubtraction))){
                 if(wordEndingPhonemes.get(wordEndingPhonemes.size()-indexSubtraction+1).equals(possibleRhymeEndingPhonemes.get(possibleRhymeEndingPhonemes.size()-indexSubtraction+1))){
                     if(wordEndingPhonemes.get(wordEndingPhonemes.size()).equals(possibleRhymeEndingPhonemes.get(possibleRhymeEndingPhonemes.size()))){
                         return true;
                     }
                 }
             }
         }
        return false;
    }
}
