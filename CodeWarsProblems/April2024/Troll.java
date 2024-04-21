package April2024;
    /*
    Trolls are attacking your comment section!

    A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

    Your task is to write a function that takes a string and return a new string with all vowels removed.

    For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

    Note: for this kata y isn't considered a vowel.


     */
public class Troll {
    public static void main(String[] args) {
        // Test cases
        String comment1 = "This website is for losers LOL!";
        String comment2 = "I love Java programming!";
        String comment3 = "No trolls allowed.";

        // Call the disemvowel method on each test case and print the result
        System.out.println(disemvowel(comment1)); // Expected output: "Ths wbst s fr lsrs LL!"
        System.out.println(disemvowel(comment2)); // Expected output: " lv Jv prgrmmng!"
        System.out.println(disemvowel(comment3)); // Expected output: "N trlls llwd."
    }

    /**
     * Removes all vowels from the given string and returns the result.
     *
     * @param str the input string
     * @return the input string without vowels
     */
    public static String disemvowel(String str) {
        // Initialize an empty string to store the result
        String result = "";

        // Iterate through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Check if the character is a vowel (case-insensitive)
            if (!isVowel(c)) {
                // Append the non-vowel character to the result string
                result += c;
            }
        }

        // Return the final result without vowels
        return result;
    }

    /**
     * Checks if the given character is a vowel (case-insensitive).
     *
     * @param c the character to check
     * @return true if the character is a vowel, false otherwise
     */
    private static boolean isVowel(char c) {
        // Convert the character to lowercase for case-insensitive comparison
        c = Character.toLowerCase(c);

        // Check if the character is a vowel
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}