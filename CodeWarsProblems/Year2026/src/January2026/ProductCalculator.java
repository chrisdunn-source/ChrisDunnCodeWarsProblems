/*
Given a non-empty array of integers, return the result of multiplying the values together in order. Example:

[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
*/

public class ProductCalculator {

    public static int grow(int[] x) {
        // Initialize the product variable to 1 (multiplicative identity)
        int product = 1;

        // Loop through each integer in the array
        for (int num : x) {
            product *= num; // Multiply the current number to the product
        }

        // Return the final product
        return product;
    }

    public static void main(String[] args) {
        // Testing the grow method with various cases
        System.out.println(grow(new int[]{1, 2, 3, 4})); // Expected output: 24
        System.out.println(grow(new int[]{5, 1, 2}));    // Expected output: 10
        System.out.println(grow(new int[]{7}));           // Expected output: 7
        System.out.println(grow(new int[]{1, 0, 2}));     // Expected output: 0
    }
}
