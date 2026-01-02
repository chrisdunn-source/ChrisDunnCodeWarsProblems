package August2024;
/*
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

Examples
[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 */
public class FindOdd {

    // Method to find the integer that appears an odd number of times in the array
    public static int findIt(int[] a) {
        int result = 0;
        for (int num : a) {
            result ^= num; // Using XOR operation to find the odd occurrence
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        int[] test1 = {7};
        System.out.println("Test case 1: " + findIt(test1)); // Output should be 7

        int[] test2 = {0};
        System.out.println("Test case 2: " + findIt(test2)); // Output should be 0

        int[] test3 = {1, 1, 2};
        System.out.println("Test case 3: " + findIt(test3)); // Output should be 2

        int[] test4 = {0, 1, 0, 1, 0};
        System.out.println("Test case 4: " + findIt(test4)); // Output should be 0

        int[] test5 = {1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1};
        System.out.println("Test case 5: " + findIt(test5)); // Output should be 4
    }
}
