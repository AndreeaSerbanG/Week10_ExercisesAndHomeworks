import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static void printInArray( String[] arr, char letter){
        if(arr.length != 0 ) {
            System.out.print(letter + ": ");
        }

        for( int i = 0 ; i < arr.length; i++){

            System.out.print(arr[i] + ", ");
            if(i == arr.length-1){
                System.out.println();
            }
        }
    }
    public static String removeDuplicateLetters(char keyArray[], int n){
        int index = 0;
        for( int i = 0; i < n; i++){
            int j;
            for( j = 0; j < i; j++ ){
                if (keyArray[i] == keyArray[j]){
                    break;
                }
            }
            if (j==i){
                keyArray[index++] = keyArray[i];
            }
        }
        return String.valueOf(Arrays.copyOf(keyArray,index));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul de cuvinte:");
        int arrayLength = sc.nextInt();

        String [] array = new String [arrayLength];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduceti cuvantul " + (i + 1) + ":");
            array[i] = sc.next();
        }
        System.out.println("Introduceti cuvantul cheie:");
        String key = sc.next();

        int n = key.length();
        char keyArray[] = key.toCharArray();
        removeDuplicateLetters(keyArray, n);

        n = array.length;

        for( int i = 0; i < n-1; i++){
            String results[] =  Filter.startsWithLetter(array, key.charAt(i));
            printInArray(results, key.charAt(i));
        }
    }
}