/*
Problem:
Complete the function power_of_two/powerOfTwo (or equivalent, depending on your language) that determines if a given non-negative integer is a power of two.
From the corresponding Wikipedia entry:
a power of two is a number of the form 2^n where n is an integer, i.e. the result of exponentiation with number two as the base and integer n as the exponent.
You may assume the input is always valid.

Examples:
PowerOfTwo.isPowerOfTwo(1024) // -> true
PowerOfTwo.isPowerOfTwo(4096) // -> true
PowerOfTwo.isPowerOfTwo(333)  // -> false
Beware of certain edge cases - for example, 1 is a power of 2 since 2^0 = 1 and 0 is not a power of 2.
*/

public class PowerOfTwo {
    public static boolean isPowerOfTwo(long n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPowerOfTwo(1024)); // Expected output: true
        System.out.println(isPowerOfTwo(4096)); // Expected output: true
        System.out.println(isPowerOfTwo(333));  // Expected output: false
    }
}
