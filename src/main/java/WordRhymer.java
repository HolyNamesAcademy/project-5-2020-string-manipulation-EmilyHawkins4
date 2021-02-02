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
    public boolean checkForRhyme(String word, String possibleRhyme) {

        if (word.equalsIgnoreCase(possibleRhyme)) {
            return false;
        }

        List<String> wordPhonemes = phonemeDictionary.getPhonemes(word);
        List<String> prPhonemes = phonemeDictionary.getPhonemes(possibleRhyme);

        if(wordPhonemes.size()==0 || prPhonemes.size()==0){
            return false;
        }

        if (wordPhonemes.size() >= 3 && prPhonemes.size() >= 3) {
            if (wordPhonemes.get(wordPhonemes.size() - 1).equalsIgnoreCase(prPhonemes.get(prPhonemes.size() - 1))) {
                if (wordPhonemes.get(wordPhonemes.size() - 2).equalsIgnoreCase(prPhonemes.get(prPhonemes.size() - 2))) {
                    if (wordPhonemes.get(wordPhonemes.size() - 3).equalsIgnoreCase(prPhonemes.get(prPhonemes.size() - 3))) {
                        return true;
                    }
                }
            }
        }

        if(wordPhonemes.size()==2 || prPhonemes.size()==2){
            if(wordPhonemes.get(wordPhonemes.size()-2).equalsIgnoreCase(prPhonemes.get(prPhonemes.size()-2))){
                if(wordPhonemes.get(wordPhonemes.size()-1).equalsIgnoreCase(prPhonemes.get(prPhonemes.size()-1))){
                    return true;
                }
            }
        }

        if(wordPhonemes.size()==1 || prPhonemes.size()==1){
            if(wordPhonemes.get(wordPhonemes.size()-1).equalsIgnoreCase(prPhonemes.get(prPhonemes.size()-1))){
                return true;
            }
        }

        return false;

    }
}
