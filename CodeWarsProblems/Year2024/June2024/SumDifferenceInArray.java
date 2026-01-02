package June2024;
import java.util.Arrays;
    /*
    Your task is to sum the differences between consecutive pairs in the array in descending order.

    Example
    [2, 1, 10]  -->  9
    In descending order: [10, 2, 1]

    Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9

    If the array is empty or the array has only one element the result should be 0 (Nothing in Haskell, None in Rust).
     */
public class SumDifferenceInArray {
    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {2, 1, 10};
        System.out.println(sumOfDifferences(arr1)); // Expected output: 9

        int[] arr2 = {5, 5, 5, 5};
        System.out.println(sumOfDifferences(arr2)); // Expected output: 0

        int[] arr3 = {1};
        System.out.println(sumOfDifferences(arr3)); // Expected output: 0

        int[] arr4 = {};
        System.out.println(sumOfDifferences(arr4)); // Expected output: 0
    }
    public static int sumOfDifferences(int[] arr) {
        // Check if the array is empty or has only one element
        if (arr == null || arr.length <= 1) {
            return 0; // Return 0 as specified in the problem description
        }

        Arrays.sort(arr); // Sort the array in ascending order

        int sum = 0; // Initialize a variable to store the sum of differences

        // Iterate through the sorted array in descending order
        for (int i = arr.length - 1; i > 0; i--) {
            sum += arr[i] - arr[i - 1]; // Calculate the difference and add it to the sum
        }

        return sum; // Return the final sum of differences
    }


}
