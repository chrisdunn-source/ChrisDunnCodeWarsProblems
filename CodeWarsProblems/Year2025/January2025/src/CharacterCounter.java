/*
 * Problem:
 * Given a string, return a list of integers detailing the count of uppercase letters, lowercase letters, numbers, and special characters.
 * The order is: uppercase letters, lowercase letters, numbers, and special characters.
 * Example: "*'&ABCDabcde12345" --> [4, 5, 5, 3]
 */

public class CharacterCounter {

    // Method to count the occurrences of uppercase letters, lowercase letters, numbers, and special characters in the input string
    public static int[] countCharacterTypes(String word) {
        int upperCaseCount = 0; // Initialize count for uppercase letters
        int lowerCaseCount = 0; // Initialize count for lowercase letters
        int numberCount = 0;    // Initialize count for numbers
        int specialCharCount = 0; // Initialize count for special characters

        // Iterate over each character in the input string
        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCaseCount++; // Increment the count of uppercase letters
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++; // Increment the count of lowercase letters
            } else if (Character.isDigit(ch)) {
                numberCount++; // Increment the count of numbers
            } else {
                specialCharCount++; // Increment the count of special characters
            }
        }

        // Return an array containing the counts of each character type in the specified order
        return new int[]{upperCaseCount, lowerCaseCount, numberCount, specialCharCount};
    }

    // Main method to test the countCharacterTypes method
    public static void main(String[] args) {
        // Test the countCharacterTypes method with the example "*'&ABCDabcde12345"
        int[] counts = countCharacterTypes("*'&ABCDabcde12345");
        
        // Print the counts of uppercase letters, lowercase letters, numbers, and special characters
        for (int count : counts) {
            System.out.print(count + " ");
        }
        // Expected output: 4 5 5 3
    }
}
