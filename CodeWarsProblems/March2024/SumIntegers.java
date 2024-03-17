package March2024;
/*
    Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including them and return it. If the two numbers are equal return a or b.

    Note: a and b are not ordered!
 */

public class SumIntegers {
    /**
     * Calculates the sum of all integers between and including two given integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of all integers between and including a and b
     */
    public int getSum(int a, int b) {
        // Check if a and b are equal, return either a or b
        if (a == b) {
            return a;
        }

        // If a is greater than b, swap their values
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int sum = 0;
        // Iterate through the range of numbers from a to b (inclusive)
        for (int i = a; i <= b; i++) {
            sum += i;
        }

        return sum;
    }

    /**
     * Main method to test the getSum method.
     */
    public static void main(String[] args) {
        SumIntegers s = new SumIntegers();

        // Test cases
        System.out.println(s.getSum(0, -1)); // Expected output: -1
        System.out.println(s.getSum(0, 1));  // Expected output: 1
        System.out.println(s.getSum(5, 5));  // Expected output: 5
        System.out.println(s.getSum(10, 5)); // Expected output: 45
    }
}
