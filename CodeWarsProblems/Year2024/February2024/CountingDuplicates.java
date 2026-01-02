package February2024;
import java.util.Map;
import java.util.HashMap;
/*
    Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

    Example
    "abcde" -> 0 # no characters repeats more than once
    "aabbcde" -> 2 # 'a' and 'b'
    "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
    "indivisibility" -> 1 # 'i' occurs six times
    "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
    "aA11" -> 2 # 'a' and '1'
    "ABBA" -> 2 # 'A' and 'B' each occur twice
 */
public class CountingDuplicates {
    public static void main(String[] args) {
        // Example invocations of the duplicateCount function
        System.out.println(duplicateCount("abcde")); // 0
        System.out.println(duplicateCount("aabbcde")); // 2
        System.out.println(duplicateCount("aabBcde")); // 2
        System.out.println(duplicateCount("indivisibility")); // 1
        System.out.println(duplicateCount("Indivisibilities")); // 2
        System.out.println(duplicateCount("aA11")); // 2
        System.out.println(duplicateCount("ABBA")); // 2
    }

    public static int duplicateCount(String text) {
        // Convert the input string to lowercase for case-insensitive comparison
        text = text.toLowerCase();

        // Create a frequency map to store the count of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate over each character in the string and update the frequency map
        for (char c : text.toCharArray()) {
            // Get the current count of the character from the frequency map,
            // or 0 if the character is not yet present in the map
            int count = frequencyMap.getOrDefault(c, 0);

            // Increment the count for the character by 1 and update the frequency map
            frequencyMap.put(c, count + 1);
        }

        // Count the number of characters that occur more than once
        int count = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency > 1) {
                // If the frequency of a character is greater than 1, it means the character
                // occurs more than once, so increment the count
                count++;
            }
        }

        return count;
    }
}
