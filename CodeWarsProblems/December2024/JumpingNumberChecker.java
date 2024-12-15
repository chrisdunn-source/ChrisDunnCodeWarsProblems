/**
 * Problem:
 * A Jumping number is a number where all adjacent digits in it differ by 1.
 * Given a number, determine if it is a Jumping number or not.
 */
public class JumpingNumberChecker
{
    // Method to check if a number is a Jumping number
    public static String jumpingNumber(int number)
    {
        String numStr = String.valueOf(number);
        
        for (int i = 0; i < numStr.length() - 1; i++) {
            int digit1 = Character.getNumericValue(numStr.charAt(i));
            int digit2 = Character.getNumericValue(numStr.charAt(i + 1));
            
            if (Math.abs(digit1 - digit2) != 1) {
                return "Not Jumping";
            }
        }
        
        return "Jumping";
    }
    
    // Main method to test the jumpingNumber function
    public static void main(String[] args)
    {
        // Test cases
        int number1 = 12345;
        int number2 = 4343456;
        int number3 = 98;
        
        // Check if the numbers are Jumping numbers and print the results
        System.out.println("Number " + number1 + " is " + jumpingNumber(number1));
        System.out.println("Number " + number2 + " is " + jumpingNumber(number2));
        System.out.println("Number " + number3 + " is " + jumpingNumber(number3));
    }
}
