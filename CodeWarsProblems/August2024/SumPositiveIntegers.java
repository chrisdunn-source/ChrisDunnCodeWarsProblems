package August2024;

import java.util.Arrays;
/*
Create a function that returns the sum of the two lowest positive numbers given an array of minimum 4 positive integers. No floats or non-positive integers will be passed.

For Java, those integers will come as double precision (long).

For example, when an array is passed like [19, 5, 42, 2, 77], the output should be 7.

[10, 343445353, 3453445, 3453545353453] should return 3453455.
 */
class SumPositiveIntegers {
    public static long sumTwoSmallestNumbers(final long[] numbers) {
        // Sort the input array in ascending order
        Arrays.sort(numbers);

        // Return the sum of the two smallest numbers in the sorted array
        return numbers[0] + numbers[1];
    }

    public static void main(String[] args) {
        // Test cases
        long[] test1 = {19, 5, 42, 2, 77};
        System.out.println("Sum of two smallest numbers in test1: " + sumTwoSmallestNumbers(test1)); // Expected output: 7

        long[] test2 = {10, 343445353, 3453445, 3453545353453L};
        System.out.println("Sum of two smallest numbers in test2: " + sumTwoSmallestNumbers(test2)); // Expected output: 3453455
    }
}
