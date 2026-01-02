class Persist {
    public static void main(String[] args) {
        System.out.println(Persist.persistence(39));  // Output: 3
        System.out.println(Persist.persistence(999)); // Output: 4
        System.out.println(Persist.persistence(4));   // Output: 0
    }
    public static int persistence(long n) {
        int count = 0; // Initialize a counter to keep track of the number of multiplicative steps

        // Continue the loop until n becomes a single-digit number (i.e., less than 10)
        while (n >= 10) {
            long product = 1; // Initialize a variable to store the product of the digits

            // Loop through each digit of n and multiply them together
            while (n > 0) {
                product *= n % 10; // Multiply the product by the rightmost digit of n
                n /= 10; // Remove the rightmost digit from n
            }

            n = product; // Update n with the product of the digits
            count++; // Increment the counter to keep track of the number of steps
        }

        return count; // Return the number of multiplicative steps (persistence)
    }
}
/*
Initialize a counter count to keep track of the number of multiplicative steps.

Enter a loop that continues until n becomes a single-digit number (i.e., less than 10).

Inside the loop, initialize a variable product to store the product of the digits. This variable will be reset to 1 for each iteration.

Enter another loop that calculates the product of the digits of n. This loop continues until n becomes 0.

Inside the inner loop, multiply product by the rightmost digit of n (obtained using the modulo operator %). This effectively multiplies all the digits together.

Remove the rightmost digit from n by dividing it by 10. This moves the next digit to the rightmost position for the next iteration.

Update n with the product of the digits stored in product.

Increment the counter count to keep track of the number of steps taken.

Once n becomes a single-digit number (i.e., less than 10), exit the outer loop.

Return the value of count, which represents the number of multiplicative steps taken.
 */