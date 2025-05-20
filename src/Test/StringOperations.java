package Test;

public class StringOperations {
    public static void main(String[] args) {
        // Initialize strings
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String concatenatedString = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenatedString);

        // Length of a string
        int lengthOfStr1 = str1.length();
        int lengthOfStr2 = str2.length();
        System.out.println("Length of str1: " + lengthOfStr1);
        System.out.println("Length of str2: " + lengthOfStr2);

        // Substring
        String substring = concatenatedString.substring(6, 11); // Extracts "World"
        System.out.println("Substring: " + substring);

        // Character extraction
        char charAtIndex = concatenatedString.charAt(4); // Extracts the character at index 4 (which is 'o')
        System.out.println("Character at index 4: " + charAtIndex);
    }
}
