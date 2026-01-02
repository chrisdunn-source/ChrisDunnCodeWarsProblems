package February2024;

public class DuplicateEncoder {
    public static void main(String[] args) {
        // Test cases
        String word1 = "din";
        String encoded1 = DuplicateEncoder.encode(word1);
        System.out.println("Encoded \"" + word1 + "\": " + encoded1);

        String word2 = "recede";
        String encoded2 = DuplicateEncoder.encode(word2);
        System.out.println("Encoded \"" + word2 + "\": " + encoded2);

        String word3 = "Success";
        String encoded3 = DuplicateEncoder.encode(word3);
        System.out.println("Encoded \"" + word3 + "\": " + encoded3);

        String word4 = "(( @";
        String encoded4 = DuplicateEncoder.encode(word4);
        System.out.println("Encoded \"" + word4 + "\": " + encoded4);

    }
    public static String encode(String word) {
        // Convert the word to lowercase to ignore capitalization when determining duplicates
        word = word.toLowerCase();

        // Create a StringBuilder to store the encoded string
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the word
        for (int i = 0; i < word.length(); i++) {
            // Get the current character in the loop iteration
            char currentChar = word.charAt(i);

            // Check if the first occurrence of the current character is the same as the last occurrence
            if (word.indexOf(currentChar) == word.lastIndexOf(currentChar)) {
                // If the character appears only once in the word, append "(" to the result
                result.append("(");
            } else {
                // If the character appears more than once in the word, append ")" to the result
                result.append(")");
            }
        }

        // Convert the result StringBuilder to a string and return it
        return result.toString();
    }

}
/*
The encode method takes a word as input and returns the encoded string.
To ignore capitalization when determining duplicates, we convert the word to lowercase using the toLowerCase method and assign the result back to the word variable.
We create a StringBuilder named result to store the encoded string. The StringBuilder is a mutable sequence of characters that allows efficient appending of characters.
We iterate through each character in the word using a loop. The loop variable i starts at 0 and increments until it reaches the length of the word.
Inside the loop, we get the current character using the charAt method, which returns the character at the specified index in the word.
We then check if the first occurrence of the current character is the same as the last occurrence. We do this by comparing the index returned by indexOf (which finds the first occurrence of a character) with the index returned by lastIndexOf (which finds the last occurrence of a character).
If the first occurrence index is the same as the last occurrence index, it means the character appears only once in the word. In this case, we append "(" to the result using the append method of the StringBuilder.
If the first occurrence index is different from the last occurrence index, it means the character appears more than once in the word. In this case, we append ")" to the result.
After iterating through all the characters in the word, we convert the result StringBuilder to a string using the toString method of the StringBuilder and return it as the encoded string.
 */
