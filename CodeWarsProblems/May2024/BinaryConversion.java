package May2024;

    /*
    Given a non-negative integer n, write a function to_binary/ToBinary which returns that number in a binary format.

    //to_binary(1)   should return 1
    //to_binary(5)   should return 101
    //to_binary(11)  should return 1011
    
     */

public class BinaryConversion {
    public static void main(String[] args) {
        // Test cases
        int number1 = 5;
        int binary1 = toBinary(number1);
        System.out.println("Binary representation of " + number1 + " is: " + binary1); // Expected: 101

        int number2 = 10;
        int binary2 = toBinary(number2);
        System.out.println("Binary representation of " + number2 + " is: " + binary2); // Expected: 1010

        int number3 = 0;
        int binary3 = toBinary(number3);
        System.out.println("Binary representation of " + number3 + " is: " + binary3); // Expected: 0
    }
    public static int toBinary(int n) {
        if (n == 0) {
            return 0; // Special case for 0, the binary representation is also 0
        }

        int binary = 0; // Variable to store the binary representation
        int placeValue = 1; // Represents the current place value in binary system

        while (n > 0) {
            int remainder = n % 2; // Calculate the remainder when n is divided by 2 (binary digit)
            binary += remainder * placeValue; // Update the binary representation by adding the binary digit at the correct place value
            placeValue *= 10; // Increase the place value by multiplying it with 10
            n /= 2; // Divide n by 2 to move on to the next digit
        }

        return binary; // Return the binary representation of the given non-negative integer
    }


}
