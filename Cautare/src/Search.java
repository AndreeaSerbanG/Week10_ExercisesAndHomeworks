public class Search {
    /*The program implements a method that determines whether a string is a palindrome or not,
    regardless of letter type and all non-letter characters
     */
    public static boolean isPalindromeIgnoreCase(String  str){
        str = str.toLowerCase();

        str = str.replaceAll("\\W", "");


        char[] letters = str.toCharArray();

        for( int i = 0 ; i < letters.length/2; i++){
            if(letters[i] != letters[letters.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
