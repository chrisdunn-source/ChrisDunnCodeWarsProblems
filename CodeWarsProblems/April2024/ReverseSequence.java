package April2024;

import java.util.Arrays;
    /*
    Build a function that returns an array of integers from n to 1 where n>0.

    Example : n=5 --> [5,4,3,2,1]
     */

public class ReverseSequence {
    // Main method to run the program
    public static void main(String[] args) {
        int n = 5; // Set the value of n
        int[] result = reverse(n); // Call the reverse method with n
        System.out.println(Arrays.toString(result)); // Print the result
    }

    // Method to reverse the sequence from n to 1
    public static int[] reverse(int n) {
        int[] sequence = new int[n]; // Step 1: Initialize an array with length n

        for (int i = 0; i < n; i++) {
            sequence[i] = n - i; // Step 2: Populate the array with values from n to 1
        }

        return sequence; // Step 3: Return the array
    }
}
