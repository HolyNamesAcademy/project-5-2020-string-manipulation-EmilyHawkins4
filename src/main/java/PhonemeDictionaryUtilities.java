import java.util.ArrayList;
import java.util.List;
import java.lang.String;

/**
 * This class provides methods that are helpful when working with the CMU Phoneme Dictionary
 */
public class PhonemeDictionaryUtilities{
    /**
     * Checks that the provided line is an entry in the file that contains a word and phonemes, and that it is not a
     * line containing comments.
     *
     * @param line - a line from the dictionary being parsed
     * @return true if the given line contains a word entry, false otherwise
     */
    //TODO check works
    public static boolean isPhonemeEntry(String line) {
        if(line.startsWith(";;;")){
            return false;
        }
        return true;
    }

    /**
     * Get the word component of a dictionary line. Lines are of the format: WORD PH1 PH2 PH3
     *
     * @param line - the dictionary line we want to extract the word from
     * @return the word part of line
     */
    //TODO check works
    public static String getWordFromLine(String line) {
        int space = line.indexOf(" ");
        return line.substring(0, space);
    }

    /**
     * Get the phonemes component from a dictionary line. Lines are of the format: WORD PH1 PH2 PH3
     *
     * @param line - the dictionary line we want to get the phonemes from
     * @return a list containing the phonemes of the word in order.
     */
    //TODO check works
    public static List<String> getPhonemesFromLine(String line) {
        List<String> phonemeList = new ArrayList<>();
        int space = line.indexOf(" ");
        phonemeList.add(line.substring(0, space));
        String phonemes = line.substring(space +1);
        int numWords = 1;
        for(int i = 0; i<phonemes.length(); i++){
           /* if(phonemes.charAt(i).equals(" ")){
                numWords++;
            }
            */
        }
        int iterations = 0;
        while(iterations < numWords){
            space = phonemes.indexOf(" ");
            phonemeList.add(phonemes.substring(0, space));
            phonemes = phonemes.substring(space+1);
            iterations ++;
        }
        return phonemeList;
    }
}
