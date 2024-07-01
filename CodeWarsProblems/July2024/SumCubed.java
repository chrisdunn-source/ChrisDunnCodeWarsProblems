package July2024;
/*
Write a function that takes a positive integer n, sums all the cubed values from 1 to n (inclusive), and returns that sum.

Assume that the input n will always be a positive integer.

Examples: (Input --> output)

2 --> 9 (sum of the cubes of 1 and 2 is 1 + 8)
3 --> 36 (sum of the cubes of 1, 2, and 3 is 1 + 8 + 27)
 */

public class SumCubed {
    public static long sumCubes(long n) {
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum += i * i * i; // Calculate the cube of the current number and add it to the sum
        }
        return sum; // Return the final sum
    }

    public static void main(String[] args) {
        long n = 3; // Test case: 3
        long result = sumCubes(n);
        System.out.println("Sum of cubes from 1 to " + n + " is: " + result);

        n = 5; // Test case: 5
        result = sumCubes(n);
        System.out.println("Sum of cubes from 1 to " + n + " is: " + result);

        // You can add more test cases here
    }
}
