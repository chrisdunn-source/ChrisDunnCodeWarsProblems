package April2024;
    /*
    Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

    For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)

    Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)

    Note: The function accepts an integer and returns an integer.
     */
    public class SquareDigit {
    public static void main(String[] args) {
        // Create an instance of SquareDigit class
        SquareDigit squareDigit = new SquareDigit();

        // Test cases
        int number1 = 123; // Expected output: 149
        int number2 = 9876; // Expected output: 816749
        int number3 = 0; // Expected output: 0

        // Call the squareDigits method for each test case and print the result
        System.out.println(squareDigit.squareDigits(number1));
        System.out.println(squareDigit.squareDigits(number2));
        System.out.println(squareDigit.squareDigits(number3));
    }
    public int squareDigits(int n) {
        // Convert the given number to a string
        String numString = String.valueOf(n);

        // Create a StringBuilder to store the squared digits
        StringBuilder result = new StringBuilder();

        // Iterate over each character in the string
        for (char c : numString.toCharArray()) {
            // Parse each character to an integer
            int digit = Character.getNumericValue(c);

            // Square the digit
            int squared = digit * digit;

            // Convert the squared digit back to a string and append it to the result
            result.append(String.valueOf(squared));
        }

        // Convert the result string to an integer and return it
        return Integer.parseInt(result.toString());
    }


}
    /*
    Convert the given number n into a string.
    Initialize an empty string to store the squared digits.
    Iterate over each character in the string.
    Parse each character to an integer, square it, and convert it back to a string.
    Concatenate the squared digit to the result string.
    Finally, parse the result string back to an integer and return it.
     */