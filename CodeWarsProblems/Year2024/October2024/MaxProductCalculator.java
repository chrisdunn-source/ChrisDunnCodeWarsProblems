import java.util.Arrays;
/*
Task
Given an array/list [] of integers , Find the product of the k maximal numbers.

Notes
Array/list size is at least 3 .

Array/list's numbers Will be mixture of positives , negatives and zeros

Repetition of numbers in the array/list could occur.

Input >> Output Examples
maxProduct ({4, 3, 5}, 2) ==>  return (20)
Explanation:
Since the size (k) equal 2 , then the subsequence of size 2 whose gives product of maxima is 5 * 4 = 20 .
*/

public class MaxProductCalculator {
    // Method to calculate the product of the k maximal numbers in the array
    public static long maxProduct(int[] numbers, int k) {
        // Sort the array in ascending order
        Arrays.sort(numbers);
        
        // Initialize the product variable to store the result
        long product = 1;
        
        // Iterate over the last k elements of the sorted array
        for (int i = numbers.length - k; i < numbers.length; i++) {
            // Multiply each element to the product
            product *= numbers[i];
        }
        
        // Return the final product
        return product;
    }

    // Main method to test the maxProduct method
    public static void main(String[] args) {
        // Sample array and value of k
        int[] arr = {4, 3, 5};
        int k = 2;
        
        // Calculate and print the result
        System.out.println(maxProduct(arr, k)); // Output: 20
    }
}
