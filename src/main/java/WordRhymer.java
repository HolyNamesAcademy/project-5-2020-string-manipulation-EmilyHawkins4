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
    //TODO: fix everything
    public boolean checkForRhyme(String word, String possibleRhyme) {
        PhonemeDictionary phonemeDictionary = new PhonemeDictionary("resources/tst/testCmuDict.txt");
        // check if words are the same
        if (word.equals(possibleRhyme)) {
            return false;
        }

        //isolating the phonemes
        List<String> wordPhonemes = phonemeDictionary.getPhonemes(word);
        List<String> prPhonemes = phonemeDictionary.getPhonemes(possibleRhyme);

        // checking for words more then 2 phonemes
        if (wordPhonemes.size() > 2 && prPhonemes.size() > 2) {
            if (wordPhonemes.get(wordPhonemes.size() - 1).equals(prPhonemes.get(prPhonemes.size() - 1))) {
                boolean last = true;
                if (wordPhonemes.get(wordPhonemes.size() - 2).equals(prPhonemes.get(prPhonemes.size() - 2))) {
                    boolean last2nd = true;
                    if (wordPhonemes.get(wordPhonemes.size() - 3).equals(prPhonemes.get(prPhonemes.size() - 3))) {
                        boolean last3rd = true;
                        if (last && last2nd && last3rd) {
                            return true;
                        }
                    }
                }
            }
        }

        //checking for when "word" is less then 3 phonemes
        if(wordPhonemes.size()<3){
            // checking for 1 phoneme
            if(wordPhonemes.size()==1){
                if(wordPhonemes.get(0).equals(prPhonemes.get(prPhonemes.size()-1))){
                    return true;
                }
            }
            // checking for 2 phonemes
            if(wordPhonemes.get(1).equals(prPhonemes.get(prPhonemes.size()-1))){
                if(wordPhonemes.get(0).equals(prPhonemes.get(prPhonemes.size()-2))){
                    return true;
                }
            }
        }

        //checking for when "possibleRhyme" is more then 3 phonemes
        if(prPhonemes.size()<3){
            // checking for 1 phoneme
            if(prPhonemes.size()==1){
                if(prPhonemes.get(0).equals(wordPhonemes.get(wordPhonemes.size()-1))){
                    return true;
                }
            }
            // checking for 2 phonemes
            if(prPhonemes.get(1).equals(wordPhonemes.get(wordPhonemes.size()-1))){
                if(prPhonemes.get(0).equals(wordPhonemes.get(wordPhonemes.size()-2))){
                    return true;
                }
            }
        }

        // if nothing rhymes
        return false;

    }
}
