package September2024;

import java.util.Arrays;
/*
Write a function partlist that gives all the ways to divide a list (an array) of at least two elements into two non-empty parts.

Each two non empty parts will be in a pair (or an array for languages without tuples or a structin C - C: see Examples test Cases - )
Each part will be in a string
Elements of a pair must be in the same order as in the original array.
 */
public class Partlist {

    public static String[][] partlist(String[] arr) {
        String[][] result = new String[arr.length - 1][2];

        for (int i = 0; i < arr.length - 1; i++) {
            // Create the first part by joining the elements from the start to the current index
            String firstPart = String.join(" ", Arrays.copyOfRange(arr, 0, i + 1));

            // Create the second part by joining the elements from the current index to the end
            String secondPart = String.join(" ", Arrays.copyOfRange(arr, i + 1, arr.length));

            // Store the pair of strings in the result array
            result[i] = new String[]{firstPart, secondPart};
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        String[] arr1 = {"apple", "banana", "cherry"};
        String[] arr2 = {"one", "two", "three", "four"};

        // Get the divided parts for each test case
        String[][] result1 = partlist(arr1);
        String[][] result2 = partlist(arr2);

        // Print the results
        for (String[] pair : result1) {
            System.out.println(Arrays.toString(pair));
        }

        System.out.println("----------");

        for (String[] pair : result2) {
            System.out.println(Arrays.toString(pair));
        }
    }
}
