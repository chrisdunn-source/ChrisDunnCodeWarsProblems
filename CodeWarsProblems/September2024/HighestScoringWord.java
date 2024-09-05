/*
Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

For example, the score of abad is 8 (1 + 2 + 1 + 4).

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid.
 */
public class HighestScoringWord {
    // Method to find the highest scoring word in a string
    public static String high(String s) {
        String[] words = s.split(" "); // Split the input string into individual words
        int maxScore = 0; // Initialize the maximum score to 0
        String highestScoringWord = ""; // Initialize the highest scoring word to an empty string

        // Iterate through each word in the array
        for (String word : words) {
            int score = calculateScore(word); // Calculate the score for the current word
            // Update the highest scoring word if the current word has a higher score or appears earlier
            if (score > maxScore || (score == maxScore && s.indexOf(word) < s.indexOf(highestScoringWord))) {
                maxScore = score; // Update the maximum score
                highestScoringWord = word; // Update the highest scoring word
            }
        }

        return highestScoringWord; // Return the highest scoring word
    }

    // Method to calculate the score of a word based on letter positions in the alphabet
    private static int calculateScore(String word) {
        int score = 0; // Initialize the score to 0
        // Iterate through each character in the word
        for (char c : word.toCharArray()) {
            score += c - 'a' + 1; // Add the position value of the character to the score
        }
        return score; // Return the total score of the word
    }

    // Main method for testing the high method with sample inputs
    public static void main(String[] args) {
        // Test case 1: Single word input
        String input1 = "abad hello java";
        System.out.println("Highest scoring word for input1: " + high(input1)); // Output should be "abad"

        // Test case 2: Multiple words with same score
        String input2 = "b aa c";
        System.out.println("Highest scoring word for input2: " + high(input2)); // Output should be "b"
    }
}
