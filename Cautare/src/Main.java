public class Main {
    public static void main(String[] args) {

        String str = "Red rum, sir, is murder!" ;
        System.out.println("Propozitia \"" + str + "\" este palindrom : " + Search.isPalindromeIgnoreCase(str));

        String str2 = "Was it a cat I saw?" ;
        System.out.println("\nPropozitia \"" + str2 + "\" este palindrom : " +Search.isPalindromeIgnoreCase(str2));

        String str3 = "Not a palindrome, I'm afraid.." ;
        System.out.println("\nPropozitia \"" + str3 + "\" este palindrom : " +Search.isPalindromeIgnoreCase(str3));

        String str4 = "Step on no pets." ;
        System.out.println("\nPropozitia \"" + str4 + "\" este palindrom : " +Search.isPalindromeIgnoreCase(str4));

    }
}