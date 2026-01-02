package March2024;
    /*
    You have to write a function printer_error which given a string will return the error rate of the printer as a string representing a rational whose numerator is the number of errors and the denominator the length of the control string. Don't reduce this fraction to a simpler expression.

    The string has a length greater or equal to one and contains only letters from ato z.

    Examples:
    s="aaabbbbhaijjjm"
    printer_error(s) => "0/14"

    s="aaaxbbbbyyhwawiwjjjwwm"
    printer_error(s) => "8/22"
     */
public class PrinterError {
    public static void main(String[] args) {
        String s = "aaabbbbhaijjjm";
        System.out.println(printerError(s));  // Output: 0/14

        s = "aaaxbbbbyyhwawiwjjjwwm";
        System.out.println(printerError(s));  // Output: 8/22
    }
    public static String printerError(String s) {
        int errorCount = 0; // Variable to store the number of errors
        int totalCount = s.length(); // Variable to store the total count of characters

        // Iterate over each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // Get the character at index i

            // Check if the character is outside the range of 'a' to 'm'
            if (c < 'a' || c > 'm') {
                errorCount++; // Increment the error count if the character is an error
            }
        }

        return errorCount + "/" + totalCount; // Return the error count and total count as a string
    }
}
