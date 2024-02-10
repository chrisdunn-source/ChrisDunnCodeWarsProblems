// Define a class named FakeBinary
public class FakeBinary {
    /*
    Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.

     Note: input will never be an empty string
     */

    // Define a method named fakeBin that takes a string of digits as input
    public static String fakeBin(String numberString) {
        // Create a StringBuilder to store the resulting binary string
        StringBuilder result = new StringBuilder();

        // Iterate over each character in the input string
        for (char digit : numberString.toCharArray()) {
            // Convert the character to its numeric value
            int num = Character.getNumericValue(digit);

            // Check if the numeric value is less than 5
            if (num < 5) {
                // If the value is less than 5, append '0' to the result
                result.append('0');
            } else {
                // If the value is 5 or greater, append '1' to the result
                result.append('1');
            }
        }

        // Convert the StringBuilder to a String and return the resulting binary string
        return result.toString();
    }

    // Main method for testing the fakeBin method
    public static void main(String[] args) {
        // Example usage:
        // Define an input string of digits
        String input = "354987";

        // Call the fakeBin method with the input string and store the result
        String output = fakeBin(input);

        // Print the resulting binary string
        System.out.println(output);  // Output: 001110
    }
}
/*
Explanation:

Class Definition (public class FakeBinary):

Defines a Java class named FakeBinary.
Method Definition (public static String fakeBin(String numberString) {):

Defines a method named fakeBin that takes a string of digits (numberString) as input and returns a string.
StringBuilder (StringBuilder result = new StringBuilder();):

Creates a StringBuilder named result to efficiently build the resulting binary string.
For Loop (for (char digit : numberString.toCharArray()) {):

Iterates over each character in the input string.
Character to Numeric Value Conversion (int num = Character.getNumericValue(digit);):

Converts the current character to its numeric value.
Conditional Check (if (num < 5) { and } else {):

Checks if the numeric value is less than 5.
If true, appends '0' to the result; otherwise, appends '1'.
StringBuilder Append (result.append('0'); and result.append('1');):

Appends '0' or '1' to the result StringBuilder based on the conditional check.
StringBuilder to String Conversion (return result.toString();):

Converts the StringBuilder to a String and returns the resulting binary string.
Main Method (public static void main(String[] args) {):

Defines the main method for testing the fakeBin method.
Example Usage (String input = "354987";, String output = fakeBin(input);, System.out.println(output);):

Defines an example input string (354987), calls the fakeBin method with the input, and prints the resulting binary string (001110).
 */
