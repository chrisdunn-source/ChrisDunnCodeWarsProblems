/*
 * Problem: 
 * This function should test if the 'factor' is a factor of 'base'.
 * Return true if it is a factor or false if it is not.
 *
 * About factors:
 * Factors are numbers you can multiply together to get another number.
 * For example, 2 and 3 are factors of 6 because 2 * 3 = 6.
 * You can find a factor by dividing numbers. If the remainder is 0,
 * then the number is a factor. You can use the mod operator (%) to check for a remainder.
 * For example, 2 is not a factor of 7 because 7 % 2 = 1.
 * Note: 'base' is a non-negative number, 'factor' is a positive number.
 */

public class FactorChecker {
    
    // This method checks if 'factor' is a factor of 'base'
    public static boolean checkForFactor(int base, int factor) {
        // The modulus operator (%) gives the remainder of the division of 'base' by 'factor'.
        // If the remainder is 0, it means 'factor' is a factor of 'base'.
        return base % factor == 0;
    }

    public static void main(String[] args) {
        // Test cases to check if the function works correctly
        
        // Test case 1: 6 is divisible by 2
        System.out.println(checkForFactor(6, 2)); // Expected output: true
        
        // Test case 2: 6 is divisible by 3
        System.out.println(checkForFactor(6, 3)); // Expected output: true
        
        // Test case 3: 7 is not divisible by 2
        System.out.println(checkForFactor(7, 2)); // Expected output: false
        
        // Test case 4: 10 is divisible by 5
        System.out.println(checkForFactor(10, 5)); // Expected output: true
        
        // Test case 5: 15 is not divisible by 4
        System.out.println(checkForFactor(15, 4)); // Expected output: false
    }
}
