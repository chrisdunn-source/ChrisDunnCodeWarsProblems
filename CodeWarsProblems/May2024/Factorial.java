package May2024;

public class Factorial {
/*
Your task is to write function factorial.
 */
    /**
     * Calculates the factorial of a non-negative integer.
     *
     * @param n the number to calculate the factorial of
     * @return the factorial of n
     */
    public static long factorial(int n) {
        if (n == 0) {
            return 1; // The factorial of 0 is 1
        } else {
            long result = 1; // Initialize the result variable

            for (int i = 1; i <= n; i++) {
                result *= i; // Multiply the current result by the current value of i
            }

            return result;
        }
    }

    /**
     * Main method for testing the factorial function.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        // Test cases
        int number1 = 5;
        int number2 = 0;

        long factorial1 = factorial(number1);
        long factorial2 = factorial(number2);

        System.out.println("The factorial of " + number1 + " is " + factorial1);
        System.out.println("The factorial of " + number2 + " is " + factorial2);
    }
}