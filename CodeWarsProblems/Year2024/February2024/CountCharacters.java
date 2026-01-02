package February2024;
import java.util.HashMap;
import java.util.Map;
public class CountCharacters {
    public static void main(String[] args) {
        // Sample input string
        String str = "aba";

        // Call the count method to get the character count map
        Map<Character, Integer> charCount = count(str);

        // Print the resulting character count map
        System.out.println(charCount);
    }
    public static Map<Character, Integer> count(String str) {
        // Create a HashMap to store the character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the input string to a character array and iterate over each character
        for (char c : str.toCharArray()) {
            // Check if the character is already present in the map
            // If it is, retrieve its current count and increment it by 1
            // If it is not, use the default value of 0 and add 1 to it
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Return the resulting character count map
        return charCountMap;
    }
}
/*
We import the necessary classes for our code: java.util.HashMap and java.util.Map.

We define a class called Kata. This class will contain our counting method.

Inside the Kata class, we define a method named count that takes a string (str) as input and returns a Map<Character, Integer>. This means that the method will receive a string and will return a map where each character in the string is associated with its count.

Inside the count method, we create a new HashMap called charCountMap. This map will store the character counts.

We convert the input string (str) to a character array using the toCharArray() method. This allows us to iterate over each character in the string.

We enter a loop that iterates over each character in the character array. For each character, we do the following:

We check if the character is already present in the charCountMap using the getOrDefault method. If it is present, we retrieve its current count using charCountMap.get(c). If it is not present, we use the default value of 0.

We add 1 to the current count (either the retrieved count or the default value of 0) and put the updated count in the charCountMap using charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1).

The loop continues until all characters in the string have been processed.

After the loop, we have a charCountMap that contains the counts of all characters in the input string.

We return the charCountMap as the result of the count method.

In the main method, we define a sample input string (str) with the value "aba".

We call the count method with the input string and store the resulting character count map in the charCount variable.

Finally, we print the charCount map using System.out.println(charCount).
 */
