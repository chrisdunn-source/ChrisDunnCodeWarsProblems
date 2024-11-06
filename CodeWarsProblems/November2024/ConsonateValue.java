public class ConsonantValue {
    // Method to find the highest value of consonant substrings in a given string
    public static int solve(final String s) {
        int maxSum = 0; // Variable to store the maximum sum of consonant substrings found
        int currentSum = 0; // Variable to keep track of the sum of the current consonant substring

        // Loop through each character in the input string
        for (char c : s.toCharArray()) {
            // Check if the character is a consonant (not a vowel)
            if ("aeiou".indexOf(c) == -1) {
                // Calculate the value of the consonant based on its position in the alphabet
                currentSum += c - 'a' + 1;
            } else {
                // Update the maxSum if the currentSum is higher
                maxSum = Math.max(maxSum, currentSum);
                // Reset the currentSum for the next consonant substring
                currentSum = 0;
            }
        }

        // Handle the case where the highest value is at the end of the string
        maxSum = Math.max(maxSum, currentSum);

        // Return the highest value of consonant substrings
        return maxSum;
    }

    // Main method to test the solve method with example strings
    public static void main(String[] args) {
        System.out.println(solve("zodiacs")); // Output: 26
        System.out.println(solve("strength")); // Output: 57
    }
}
