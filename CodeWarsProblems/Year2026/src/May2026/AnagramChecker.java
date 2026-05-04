package May2026;
/*
An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).

Note: anagrams are case insensitive

Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.

Examples
"foefet" is an anagram of "toffee"

"Buckethead" is an anagram of "DeathCubeK"
 */
import java.util.Arrays;

public class AnagramChecker {
    // This function checks if two words are anagrams (words with same letters but rearranged)

    public static boolean isAnagram(String a, String b) {
        // Change both words to lowercase to ignore capitalization
        a = a.toLowerCase();
        b = b.toLowerCase();

        // If the words have different lengths, they can't be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Convert the words into a format that's easy to compare
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        // Sort the individual letters of both words
        Arrays.sort(aChars);
        Arrays.sort(bChars);

        // If the sorted letters are the same, the words are anagrams
        return Arrays.equals(aChars, bChars);
    }

    // This part of the code runs when executed
    public static void main(String[] args) {
        // Test examples to see if the isAnagram function works correctly
        System.out.println(isAnagram("foefet", "toffee")); // Should be true
        System.out.println(isAnagram("Buckethead", "DeathCubeK")); // Should be true
    }
}
