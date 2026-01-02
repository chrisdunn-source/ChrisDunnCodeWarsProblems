package June2024;

import java.util.Arrays;
    /*
    You will be given a list of strings. You must sort it alphabetically (case-sensitive, and based on the ASCII values of the chars) and then return the first value.

    The returned value must be a string, and have "***" between each of its letters.

    You should not remove or add elements from/to the array.


     */
public class SortAndStar {

    public static String twoSort(String[] s) {
        // Step 1: Sort the array alphabetically
        Arrays.sort(s);

        // Step 2: Retrieve the first string from the sorted array
        String firstString = s[0];

        // Step 3: Insert "***" between each letter of the selected string
        String result = String.join("***", firstString.split(""));

        // Step 4: Return the resulting string
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        String[] strings1 = {"apple", "banana", "cherry"};
        System.out.println(twoSort(strings1)); // Expected output: a***p***p***l***e

        String[] strings2 = {"java", "programming", "language"};
        System.out.println(twoSort(strings2)); // Expected output: j***a***v***a

        String[] strings3 = {"zoo", "animal", "zebra"};
        System.out.println(twoSort(strings3)); // Expected output: a***n***i***m***a***l
    }
}
