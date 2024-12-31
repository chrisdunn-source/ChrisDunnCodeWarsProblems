/**
 * Problem:
 * Given a number between 0-9, return the number in words.
 */

public class NumberToWordsConverter {
    
    /**
     * Converts a given number to its word representation.
     * 
     * @param number The number to convert (must be between 0-9)
     * @return The word representation of the number
     */
    public static String convertNumberToWords(int number) {
        switch (number) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "Invalid number";
        }
    }

    public static void main(String[] args) {
        // Test cases
        int number1 = 1;
        int number2 = 7;
        int number3 = 9;
        
        // Output the word representation of the numbers
        System.out.println(convertNumberToWords(number1)); // Output: One
        System.out.println(convertNumberToWords(number2)); // Output: Seven
        System.out.println(convertNumberToWords(number3)); // Output: Nine
    }
}
