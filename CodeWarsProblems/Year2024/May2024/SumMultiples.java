package May2024;
/*
Find the sum of all multiples of n below m

Keep in Mind
n and m are natural numbers (positive integers)
m is excluded from the multiples
Examples
Kata.sumMul(2, 9)   ==> 2 + 4 + 6 + 8 = 20
Kata.sumMul(3, 13)  ==> 3 + 6 + 9 + 12 = 30
Kata.sumMul(4, 123) ==> 4 + 8 + 12 + ... = 1860
Kata.sumMul(4, -7)  // throws IllegalArgumentException
 */
public class SumMultiples {
    public static void main(String[] args) {
        // Test cases
        System.out.println(sumMul(3, 10));  // Expected output: 18 (3 + 6 + 9)
        System.out.println(sumMul(5, 20));  // Expected output: 30 (5 + 10 + 15)
        System.out.println(sumMul(7, 7));   // Expected output: 0 (no multiples below 7)

        // Edge case: n or m is zero
        try {
            System.out.println(sumMul(0, 15));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // Expected output: n and m must be greater than zero.
        }
    }

    public static long sumMul(int n, int m) {
        // Check if n or m is less than or equal to 0
        if (n <= 0 || m <= 0) {
            // Throw an IllegalArgumentException with an error message
            throw new IllegalArgumentException("n and m must be greater than zero.");
        }

        // Initialize a variable to keep track of the sum
        long sum = 0;

        // Iterate over the numbers starting from n and incrementing by n at each step
        for (int i = n; i < m; i += n) {
            // Add the current number to the sum
            sum += i;
        }

        // Return the sum as the result
        return sum;
    }
}
