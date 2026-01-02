package August2024;
/*
Given an integer, return a string with dash '-' marks before and after each odd digit, but do not begin or end the string with a dash mark.

Ex:

274 -> '2-7-4'
6815 -> '68-1-5'

 */
public class StringTransformation {

    // Method to dashatize the given integer
    public static String dashatize(int num) {
        // Convert the input integer to a long before taking the absolute value
        long numAbs = Math.abs((long) num);

        // Convert the absolute value to a string
        String numStr = Long.toString(numAbs);

        // StringBuilder to store the result with dashes
        StringBuilder result = new StringBuilder();

        // Iterate over each digit of the string representation of the number
        for (int i = 0; i < numStr.length(); i++) {
            // Get the digit at the current position
            int digit = Character.getNumericValue(numStr.charAt(i));

            // Check if the digit is odd
            if (digit % 2 != 0) {
                // Add a dash before odd digits, except for the first one
                if (result.length() > 0 && result.charAt(result.length() - 1) != '-') {
                    result.append("-");
                }
                result.append(digit).append("-");
            } else {
                // Append the even digit without dashes
                result.append(digit);
            }
        }

        // Remove trailing dash, if present
        if (result.length() > 0 && result.charAt(result.length() - 1) == '-') {
            result.deleteCharAt(result.length() - 1);
        }

        // Return the final result as a string
        return result.toString();
    }

    // Main method to test the dashatize function
    public static void main(String[] args) {
        System.out.println(dashatize(274)); // Output: 2-7-4
        System.out.println(dashatize(6815)); // Output: 68-1-5
        System.out.println(dashatize(-1)); // Output: 1
        System.out.println(dashatize(Integer.MIN_VALUE)); // Output: 2-1-4-7-48-3-648
    }

}
