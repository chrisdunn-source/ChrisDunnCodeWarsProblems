package March2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {
    public static void main(String[] args) {
        // Test case 1: [0, 0, 0, 1] should be converted to decimal 1
        List<Integer> binaryArray1 = new ArrayList<>(Arrays.asList(0, 0, 0, 1));
        int decimalValue1 = convertBinaryArrayToInt(binaryArray1);
        System.out.println("Testing: [0, 0, 0, 1] ==> " + decimalValue1);

        // Test case 2: [0, 0, 1, 0] should be converted to decimal 2
        List<Integer> binaryArray2 = new ArrayList<>(Arrays.asList(0, 0, 1, 0));
        int decimalValue2 = convertBinaryArrayToInt(binaryArray2);
        System.out.println("Testing: [0, 0, 1, 0] ==> " + decimalValue2);

        // Test case 3: [0, 1, 0, 1] should be converted to decimal 5
        List<Integer> binaryArray3 = new ArrayList<>(Arrays.asList(0, 1, 0, 1));
        int decimalValue3 = convertBinaryArrayToInt(binaryArray3);
        System.out.println("Testing: [0, 1, 0, 1] ==> " + decimalValue3);

        // Test case 4: [1, 0, 0, 1] should be converted to decimal 9
        List<Integer> binaryArray4 = new ArrayList<>(Arrays.asList(1, 0, 0, 1));
        int decimalValue4 = convertBinaryArrayToInt(binaryArray4);
        System.out.println("Testing: [1, 0, 0, 1] ==> " + decimalValue4);

        // Additional test cases can be added here

    }
    // Method to convert binary array to integer
    public static int convertBinaryArrayToInt(List<Integer> binary) {
        int decimal = 0; // Initialize the decimal value
        int power = binary.size() - 1; // Initialize the power to the highest bit position

        // Iterate over the binary array
        for (int i = 0; i < binary.size(); i++) {
            // Multiply the digit at position i by the corresponding power of 2 and add it to the decimal value
            decimal += binary.get(i) * Math.pow(2, power);
            power--; // Decrement the power for the next bit position
        }

        return decimal; // Return the calculated decimal value
    }


}