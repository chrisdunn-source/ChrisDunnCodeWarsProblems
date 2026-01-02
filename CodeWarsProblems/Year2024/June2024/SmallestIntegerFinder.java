package June2024;
/*
Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.
 */

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int smallest = Integer.MAX_VALUE; // Initialize smallest with the largest possible value

        for (int i = 0; i < args.length; i++) { // Iterate through the array
            if (args[i] < smallest) { // Check if the current element is smaller than the current smallest value
                smallest = args[i]; // If yes, update smallest with the new smallest value
            }
        }

        return smallest; // Return the smallest value found
    }

    public static void main(String[] args) {
        // Test cases
        int[] array1 = {34, 15, 88, 2};
        int result1 = findSmallestInt(array1);
        System.out.println("Smallest integer in array1: " + result1);

        int[] array2 = {34, -345, -1, 100};
        int result2 = findSmallestInt(array2);
        System.out.println("Smallest integer in array2: " + result2);
    }
}