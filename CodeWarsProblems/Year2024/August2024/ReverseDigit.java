package August2024;
/*
Convert number to reversed array of digits
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example(Input => Output):
35231 => [1,3,2,5,3]
0 => [0]

 */
public class ReverseDigit {
    public static void main(String[] args) {
        // Test cases
        System.out.println(java.util.Arrays.toString(digitize(35231))); // [1, 3, 2, 5, 3]
        System.out.println(java.util.Arrays.toString(digitize(0))); // [0]
        System.out.println(java.util.Arrays.toString(digitize(23579))); // [9, 7, 5, 3, 2]
    }

    public static int[] digitize(long n) {
        // Convert the input long to a string
        String numStr = String.valueOf(n);

        // Create an array to store the digits in reverse order
        int[] digits = new int[numStr.length()];

        // Iterate through the string from the end to the beginning
        for (int i = 0; i < numStr.length(); i++) {
            // Get the numeric value of the current digit and store it in the digits array
            // at the corresponding index (numStr.length() - 1 - i)
            digits[i] = Character.getNumericValue(numStr.charAt(numStr.length() - 1 - i));
        }

        // Return the digits array
        return digits;
    }
}