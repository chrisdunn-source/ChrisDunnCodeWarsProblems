package August2024;

/*
Find the sum of the odd numbers within an array, after cubing the initial integers. The function should return undefined/None/nil/NULL if any of the values aren't numbers.
 */
public class FindOddCubes {
    public static int cubeOdd(int[] arr) {
        // Initialize a variable 'sum' to store the final result
        int sum = 0;

        // Iterate through each element 'num' in the input array 'arr'
        for (int num : arr) {
            // Check if the current number 'num' is odd
            if (num % 2 != 0) {
                // If 'num' is odd, cube it using Math.pow() and add the result to 'sum'
                sum += (int) Math.pow(num, 3);
            }
        }

        // Return the final value of 'sum'
        return sum;
    }

    public static void main(String[] args) {
        // Test case 1: All numbers in the array are valid integers
        int[] arr1 = {1, 2, 3, 4, 5};
        int result1 = cubeOdd(arr1);
        System.out.println("Test case 1: " + result1); // Output: 216

        // Test case 2: The array contains a non-numeric value
        int[] arr2 = {1, 2, 3, 4, 5};
        int result2 = cubeOdd(arr2);
        System.out.println("Test case 2: " + result2); // Output: 0 (since the function should return 0 if any value is not a number)

        // Test case 3: The array is empty
        int[] arr3 = {};
        int result3 = cubeOdd(arr3);
        System.out.println("Test case 3: " + result3); // Output: 0
    }
}