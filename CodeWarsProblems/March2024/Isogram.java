package March2024;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean isIsogram(String str) {
        // Convert the string to lowercase to ignore letter case
        String lowercaseStr = str.toLowerCase();

        // Create a set to store unique letters
        Set<Character> uniqueLetters = new HashSet<>();

        // Iterate over each character in the lowercase string
        for (char c : lowercaseStr.toCharArray()) {
            // If the character is already in the set, it's a repeating letter, so return false
            if (uniqueLetters.contains(c)) {
                return false;
            }

            // Add the character to the set
            uniqueLetters.add(c);
        }

        // The loop completed without finding any repeating letters, so it's an isogram
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isIsogram("Dermatoglyphics")); // true
        System.out.println(isIsogram("moose")); // false
        System.out.println(isIsogram("aba")); // false
    }
}