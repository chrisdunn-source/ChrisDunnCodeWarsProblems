package August2024;
/*
Definition
A Tidy number is a number whose digits are in non-decreasing order.

Task
Given a number, Find if it is Tidy or not .
 */
public class TidyCheck {

    // Method to check if a number is Tidy
    public static boolean tidyNumber(int number) {
        // Convert the number to a string for easier digit comparison
        String numStr = String.valueOf(number);

        // Iterate over each digit in the number
        for (int i = 0; i < numStr.length() - 1; i++) {
            // Compare the current digit with the next digit
            if (numStr.charAt(i) > numStr.charAt(i + 1)) {
                // If the current digit is greater than the next digit, it's not Tidy
                return false;
            }
        }

        // If all digits are in non-decreasing order, the number is Tidy
        return true;
    }

    // Main method to test the tidyNumber method
    public static void main(String[] args) {
        int number = 1234;
        System.out.println("Is " + number + " a Tidy number? " + tidyNumber(number)); // Output should be true
    }
}