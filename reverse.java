public class Reverse{

    public static String reverseString(String originalString) {
        String reversedString = ""; // Initialize an empty string to store the reversed characters

        // Iterate through the original string from the last character to the first
        for (int i = originalString.length()- 1; i >= 0; i--) {
            // Append each character to the reversedString
            reversedString += originalString.charAt(i); 
        }
        return reversedString;
    }

    public static void main(String[] args) {
        String myString = "Hello World";
        String reversed = reverseString(myString);
        System.out.println("Original string: "+myString);
        System.out.println("Reversed string: "+reversed);
    }
}
