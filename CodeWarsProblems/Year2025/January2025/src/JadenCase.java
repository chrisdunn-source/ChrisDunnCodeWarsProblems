/*
Problem:
Jaden Smith, the son of Will Smith, is known for capitalizing every word in his tweets. Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.

Example:
Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased: "How Can Mirrors Be Real If Our Eyes Aren't Real"

Note that the Java version expects a return value of null for an empty string or null.
*/

public class JadenCase {

    // Method to convert a string to Jaden Smith's capitalization style
    public String toJadenCase(String phrase) {
        // Check if the input phrase is null or empty
        if (phrase == null || phrase.isEmpty()) {
            return null; // Return null for an empty string or null input
        }

        // Split the input phrase into words
        String[] words = phrase.split(" ");

        // Create a StringBuilder to build the Jaden-cased phrase
        StringBuilder jadenCasedPhrase = new StringBuilder();

        // Capitalize each word and append it to the StringBuilder
        for (String word : words) {
            // Check if the word is not empty
            if (!word.isEmpty()) {
                // Capitalize the first letter of the word and append it to the StringBuilder
                jadenCasedPhrase.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }

        // Remove the extra space at the end and return the Jaden-cased phrase
        return jadenCasedPhrase.toString().trim();
    }

    // Main method to run test cases
    public static void main(String[] args) {
        // Create an instance of JadenCase class
        JadenCase jadenCase = new JadenCase();
        
        // Input phrase to convert to Jaden case
        String phrase = "How can mirrors be real if our eyes aren't real";
        
        // Call the toJadenCase method and store the result
        String jadenCasedPhrase = jadenCase.toJadenCase(phrase);
        
        // Print the Jaden-cased phrase
        System.out.println(jadenCasedPhrase);
    }
}
