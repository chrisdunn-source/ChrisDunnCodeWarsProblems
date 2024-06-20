package June2024;
/*
Determine the total number of digits in the integer (n>=0) given as input to the function. For example, 9 is a single digit, 66 has 2 digits and 128685 has 6 digits. Be careful to avoid overflows/underflows.

All inputs will be valid.
 */

public class DecTools {
    // Method to count the number of digits in an integer
    public static int digits(int n) {
        // Convert the input integer to a string
        String numString = String.valueOf(n);
        // Return the length of the string, which represents the number of digits
        return numString.length();
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test cases
        int num1 = 9;
        int num2 = 66;
        int num3 = 128685;

        // Print the number of digits for each test case
        System.out.println("Number of digits in " + num1 + ": " + digits(num1));
        System.out.println("Number of digits in " + num2 + ": " + digits(num2));
        System.out.println("Number of digits in " + num3 + ": " + digits(num3));
    }
}