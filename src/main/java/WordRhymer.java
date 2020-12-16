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
    //TODO fix everything
    public boolean checkForRhyme(String word, String possibleRhyme) {
        PhonemeDictionary phonemeDictionary = new PhonemeDictionary("resources/tst/testCmuDict.txt");
        if(word.equals(possibleRhyme)){
            return false;
        }
        List <String> wordPhonemes = null;
        wordPhonemes = phonemeDictionary.getPhonemes(word);
        List <String> prPhonemes = null;
        prPhonemes = phonemeDictionary.getPhonemes(possibleRhyme);

        if(wordPhonemes.size() >2 && prPhonemes.size() >2){
            boolean lastPhoneme = wordPhonemes.get(wordPhonemes.size()-1).equals(prPhonemes.get(prPhonemes.size()-1));
            boolean secondLastPhoneme = wordPhonemes.get(wordPhonemes.size()-2).equals(prPhonemes.get(prPhonemes.size()-2));
            boolean thirdLastPhoneme = wordPhonemes.get(wordPhonemes.size()-3).equals(prPhonemes.get(prPhonemes.size()-3));
            if(lastPhoneme && secondLastPhoneme && thirdLastPhoneme){
                return true;
            }
        }
        if(wordPhonemes.size()<3){
            if(wordPhonemes.size()==1 && wordPhonemes.get(0).equals(prPhonemes.get(prPhonemes.size()-1))){
                return true;
            }
            boolean lastP = wordPhonemes.get(1).equals(prPhonemes.get(prPhonemes.size()-1));
            boolean secondLastP = wordPhonemes.get(0).equals(prPhonemes.get(prPhonemes.size()-2));
            if(lastP && secondLastP){
                return true;
            }
        }
        if(prPhonemes.size()<3){
            if(prPhonemes.size()==1 && prPhonemes.get(0).equals(wordPhonemes.get(wordPhonemes.size()-1))){
                return true;
            }
            boolean lastP = wordPhonemes.get(wordPhonemes.size()-1).equals(prPhonemes.get(prPhonemes.size()-1));
            boolean secondLastP = wordPhonemes.get(wordPhonemes.size()-2).equals(prPhonemes.get(prPhonemes.size()-2));
            if(lastP && secondLastP){
                return true;
            }
        }
        return false;
    }
}
