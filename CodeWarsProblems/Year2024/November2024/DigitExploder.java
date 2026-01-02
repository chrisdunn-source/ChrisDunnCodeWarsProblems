// This class contains a method to explode a string where each digit is repeated a number of times equal to its value
public class DigitExploder {
    
    // This method takes a string of digits and returns a new string where each digit is repeated a number of times equal to its value
    public static String explodeDigits(String digits) {
        // Create a StringBuilder to store the result string
        StringBuilder result = new StringBuilder();
        
        // Loop through each character (digit) in the input string
        for (char digit : digits.toCharArray()) {
            // Convert the character to an integer value
            int num = Character.getNumericValue(digit);
            
            // Repeat the digit and append it to the result string the number of times equal to its value
            for (int i = 0; i < num; i++) {
                result.append(digit);
            }
        }
        
        // Return the final result as a string
        return result.toString();
    }

    // Main method to test the explodeDigits method with example inputs
    public static void main(String[] args) {
        System.out.println(explodeDigits("312")); // Output: "333122"
        System.out.println(explodeDigits("102269")); // Output: "12222666666999999999"
    }
}
