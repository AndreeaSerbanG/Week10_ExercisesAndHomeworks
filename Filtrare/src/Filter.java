import java.util.Arrays;

public class Filter {
    /*The program reads from the keyboard a number n, which represents the number of words,
    followed by the reading of n words, which will be stored in a corresponding array,
    then reads from the keyboard a word, which contains only letters,
    and finally displays for each letter of the keyword, one at a time,
    all items in the set that begin with that letter.
     */
    public static String [] startsWithLetter(String [] array, char letter){
        String [] rArray = new String [array.length];
        int nOfElements = 0;

        for ( int i = 0; i < array.length; i++){
            char element [] = array[i].toCharArray();
            if(element[0] == letter){
                rArray[nOfElements] = array[i];
                nOfElements++;
            }

        }

        return Arrays.copyOf(rArray, nOfElements);
    }
}
