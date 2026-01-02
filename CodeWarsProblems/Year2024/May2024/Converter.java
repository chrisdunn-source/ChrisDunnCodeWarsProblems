package May2024;

public class Converter {
    /*
    Complete the function which converts a binary number (given as a string) to a decimal number.
     */
    public static void main(String[] args) {
        // Test cases
        String binary1 = "101010";
        String binary2 = "1111";
        String binary3 = "1001";

        // Convert binary to decimal and print the results
        System.out.println(binToDecimal(binary1));  // Output: 42
        System.out.println(binToDecimal(binary2));  // Output: 15
        System.out.println(binToDecimal(binary3));  // Output: 9
    }
    public static int binToDecimal(String inp) {
        int decimal = 0; // Initialize the decimal number to 0
        int power = 0; // Initialize the power of 2 to 0

        // Iterate through the binary string from right to left
        for (int i = inp.length() - 1; i >= 0; i--) {
            char digit = inp.charAt(i); // Get the current digit

            // Check if the current digit is '1'
            if (digit == '1') {
                decimal += Math.pow(2, power); // Add the corresponding power of 2 to the decimal number
            }

            power++; // Increment the power of 2
        }

        return decimal; // Return the decimal number
    }


}
