package July2024;

import java.util.Arrays;
/*
Given a two-dimensional array of integers, return the flattened version of the array with all the integers in the sorted (ascending) order.

Example:

Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].
 */

public class FlattenSort {

    // Method to flatten a 2D array and sort its elements in ascending order
    public static int[] flattenAndSort(int[][] array) {
        // Calculate the total length of the flattened array
        int totalLength = 0;
        for (int[] subArray : array) {
            totalLength += subArray.length;
        }

        // Create a new array to store the flattened elements
        int[] flattenedArray = new int[totalLength];
        int index = 0;

        // Flatten the 2D array into the single array
        for (int[] subArray : array) {
            for (int num : subArray) {
                flattenedArray[index++] = num;
            }
        }

        // Sort the flattened array in ascending order
        Arrays.sort(flattenedArray);

        // Return the sorted flattened array
        return flattenedArray;
    }

    public static void main(String[] args) {
        // Example input array
        int[][] input = {{3, 2, 1}, {4, 6, 5}, {}, {9, 7, 8}};

        // Call the flattenAndSort method and print the result
        int[] result = flattenAndSort(input);
        System.out.println(Arrays.toString(result));
    }
}
