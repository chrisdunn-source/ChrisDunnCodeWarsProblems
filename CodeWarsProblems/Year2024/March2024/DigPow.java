package March2024;

public class DigPow {
    public static void main(String[] args) {
        // Test cases
        System.out.println(digPow(89, 1));     // Expected output: 1
        System.out.println(digPow(92, 1));     // Expected output: -1
        System.out.println(digPow(695, 2));    // Expected output: 2
        System.out.println(digPow(46288, 3));  // Expected output: 51
    }

    /**
     * Calculates the value of k, if it exists, such that the sum of the digits of n raised to consecutive powers
     * starting from p is equal to k * n.
     *
     * @param n The positive integer n.
     * @param p The starting power.
     * @return The value of k if it exists, -1 otherwise.
     */
    public static int digPow(int n, int p) {
        String digits = String.valueOf(n);  // Convert n to a string to access individual digits
        int sum = 0;                        // Variable to hold the sum of digits raised to consecutive powers

        for (int i = 0; i < digits.length(); i++) {
            int digit = Character.getNumericValue(digits.charAt(i));  // Get the current digit
            sum += Math.pow(digit, p);                                // Raise the digit to the power of p and add it to the sum
            p++;                                                     // Increment p for the next digit
        }

        if (sum % n == 0) {
            return sum / n;  // If the sum is divisible by n, return the value of k
        } else {
            return -1;       // Otherwise, return -1 indicating that k does not exist
        }
    }
}

    /*
    Convert the given number n to a string so that we can access its individual digits.
    Initialize a variable called sum to 0. This variable will hold the sum of the digits raised to consecutive powers.
    Iterate through each digit of the string representation of n.
    For each digit, raise it to the power of p and add it to the sum.
    Increment p by 1 for the next digit.
    Check if the sum is divisible by n.
    If the sum is divisible by n, it means there exists a value of k such that the sum of the digits raised to consecutive powers is equal to k * n. In this case, return the value of k, which is sum / n.
    If the sum is not divisible by n, it means there is no value of k that satisfies the condition. In this case, return -1 to indicate that k does not exist.
     */