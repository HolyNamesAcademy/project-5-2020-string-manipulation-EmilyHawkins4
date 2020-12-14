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
    //TODO write the stuff
    public boolean checkForRhyme(String word, String possibleRhyme) {
        PhonemeDictionary phonemeDictionary = new PhonemeDictionary("resources/tst/testCmuDict.txt");
        if(word.equals(possibleRhyme)){
            return false;
        }
       List<String> wordEndingPhonemes;
        wordEndingPhonemes = phonemeDictionary.getPhonemes(word);
        List<String> possibleRhymeEndingPhonemes;
        possibleRhymeEndingPhonemes = phonemeDictionary.getPhonemes(possibleRhyme);

        if(wordEndingPhonemes.size() <3 || possibleRhymeEndingPhonemes.size()<3) {
            if (wordEndingPhonemes.size() < 3) {
                if (wordEndingPhonemes.get(0).equals(possibleRhymeEndingPhonemes.get(0))) {
                    if (wordEndingPhonemes.size() == 1) {
                        return true;
                    }
                    if (wordEndingPhonemes.get(1).equals(possibleRhymeEndingPhonemes.get(1))) {
                        return true;
                    }
                }
            }
            else if (possibleRhymeEndingPhonemes.size() < 3) {
                int subtract = 1;
                if (wordEndingPhonemes.get(0).equals(possibleRhymeEndingPhonemes.get(0))) {
                    subtract++;
                    if (possibleRhymeEndingPhonemes.size() == 1) {
                        return true;
                    }
                    if (wordEndingPhonemes.get(1).equals(possibleRhymeEndingPhonemes.get(1))) {
                        return true;
                    }
                }
            }
        }
        List<String> lastWordEndingPhonemes;
        lastWordEndingPhonemes.add(wordEndingPhonemes.get(wordEndingPhonemes.size()-1));
        List<String> lastPossibleRhymeEndingPhonemes;
        lastPossibleRhymeEndingPhonemes.add(possibleRhymeEndingPhonemes.get(possibleRhymeEndingPhonemes.size()-1));

            if(wordEndingPhonemes.get(wordEndingPhonemes.size()-1).equals(possibleRhymeEndingPhonemes.get(possibleRhymeEndingPhonemes.size()-1))){
                if(wordEndingPhonemes.get(wordEndingPhonemes.size()-2).equals(possibleRhymeEndingPhonemes.get(possibleRhymeEndingPhonemes.size()-2))) {
                    if(wordEndingPhonemes.get(wordEndingPhonemes.size()-3).equals(possibleRhymeEndingPhonemes.get(possibleRhymeEndingPhonemes.size()-3))) {
                        return true;
                    }
                }
            }


        return false;
    }
}
