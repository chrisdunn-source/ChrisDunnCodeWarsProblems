/*
Problem:
Write a function that takes in a string and replaces all the vowels [a,e,i,o,u] with their respective positions within that string.

Examples:
vowelToIndex("this is my string") should return "th3s 6s my str15ng"
vowelToIndex("Codewars is the best site in the world") should return "C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld"
*/

public class VowelPositionReplacer {
    public static String vowelToIndex(String s) {
        StringBuilder result = new StringBuilder(); // Create a StringBuilder to store the modified string
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // Get the character at index i from the input string
            if ("aeiouAEIOU".indexOf(c) != -1) { // Check if the character is a vowel
                result.append(i + 1); // Append the position of the vowel in the string
            } else {
                result.append(c); // If it's not a vowel, just append the character itself
            }
        }
        
        return result.toString(); // Convert the StringBuilder to a String and return it
    }

    public static void main(String[] args) {
        // Test the vowelToIndex function with example strings
        System.out.println(vowelToIndex("this is my string"));
        System.out.println(vowelToIndex("Codewars is the best site in the world"));
    }
}
