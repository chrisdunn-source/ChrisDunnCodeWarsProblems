import java.util.Arrays;
/*
Task
Given an array/list of integers, find the Nth smallest element in the array.

Notes
Array/list size is at least 3.
Array/list's numbers could be a mixture of positives , negatives and zeros.
Repetition in array/list's numbers could occur, so don't remove duplications.

*/

public class FindSmallest {
    // Method to find the Nth smallest element in the array
    public static int nthSmallest(final int[] arr, final int n) {
        // Sorting the array in ascending order
        Arrays.sort(arr);
        // Returning the Nth smallest element (index n-1 due to 0-based indexing)
        return arr[n - 1];
    }

    // Main method to test the nthSmallest method
    public static void main(String[] args) {
        // Test cases
        int[] testArray1 = {4, 2, 8, 1, 5};
        int n1 = 2;
        System.out.println("Nth smallest element in testArray1: " + nthSmallest(testArray1, n1));

        int[] testArray2 = {10, 5, 3, 9, 7};
        int n2 = 4;
        System.out.println("Nth smallest element in testArray2: " + nthSmallest(testArray2, n2));
    }
}
