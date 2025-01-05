/*
 * Problem:
 * Given a string and an array of integers representing indices, capitalize all letters at the given indices.
 * For example:
 * capitalize("abcdef", [1, 2, 5]) = "aBCdeF"
 * capitalize("abcdef", [1, 2, 5, 100]) = "aBCdeF". There is no index 100.
 * The input will be a lowercase string with no spaces and an array of digits.
 */

public class CapitalizeLetters {

    public static String capitalize(String s, int[] indices) {
        char[] charArray = s.toCharArray();

        // Iterate over the provided indices and capitalize the characters at those indices
        for (int index : indices) {
            if (index >= 0 && index < charArray.length) {
                charArray[index] = Character.toUpperCase(charArray[index]);
            }
        }

        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(capitalize("abcdef", new int[]{1, 2, 5})); // Expected: aBCdeF
        System.out.println(capitalize("abcdef", new int[]{1, 2, 5, 100})); // Expected: aBCdeF
    }
}
