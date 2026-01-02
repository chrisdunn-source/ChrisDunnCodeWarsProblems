package August2024;
/*
Complete the function that takes a non-negative integer n as input, and returns a list of all the powers of 2 with the exponent ranging from 0 to n ( inclusive ).

Examples
n = 0  ==> [1]        # [2^0]
n = 1  ==> [1, 2]     # [2^0, 2^1]
n = 2  ==> [1, 2, 4]  # [2^0, 2^1, 2^2]
 */
public class CompleteFunction {
    // Method to calculate powers of 2 from 0 to n
    public static long[] powersOfTwo(int n) {
        // Create an array to hold the powers of 2, size n + 1
        long[] powers = new long[n + 1];

        // Loop through each exponent from 0 to n
        for (int i = 0; i <= n; i++) {
            // Calculate 2^i and store it in the array
            powers[i] = (long) Math.pow(2, i);
        }

        // Return the array containing all powers of 2
        return powers;
    }

    // Main method to test the powersOfTwo function
    public static void main(String[] args) {
        // Test cases to verify the functionality of the powersOfTwo method
        System.out.println("Powers of 2 for n=0: " + java.util.Arrays.toString(powersOfTwo(0))); // Expected: [1]
        System.out.println("Powers of 2 for n=1: " + java.util.Arrays.toString(powersOfTwo(1))); // Expected: [1, 2]
        System.out.println("Powers of 2 for n=2: " + java.util.Arrays.toString(powersOfTwo(2))); // Expected: [1, 2, 4]
        System.out.println("Powers of 2 for n=3: " + java.util.Arrays.toString(powersOfTwo(3))); // Expected: [1, 2, 4, 8]
        System.out.println("Powers of 2 for n=4: " + java.util.Arrays.toString(powersOfTwo(4))); // Expected: [1, 2, 4, 8, 16]
        System.out.println("Powers of 2 for n=5: " + java.util.Arrays.toString(powersOfTwo(5))); // Expected: [1, 2, 4, 8, 16, 32]
    }
}
