import java.util.Arrays;

public class main{

    public static boolean areAnagrams(String str1, String str2) {
        // 1. Normalize the strings
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        

        // 2. Check Lengths
        if (str1.length() != str2.length()) {
            return false;
        }

        // 3. Convert to Character Arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // 4. Sort Arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // 5. Compare Sorted Arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Siltent";
        String s3 = "Hello";
        String s4 = "World";

        System.out.println("'" + s1 + "' and '" + s2 + "' are anagrams: " + areAnagrams(s1, s2)); 
        System.out.println("'" + s3 + "' and '" + s4 + "' are anagrams: " + areAnagrams(s3, s4)); 
        System.out.println("'Debit Card' and 'Bad Credit' are anagrams: " + areAnagrams("Debit Card", "Bad Credit")); 
    }
}
