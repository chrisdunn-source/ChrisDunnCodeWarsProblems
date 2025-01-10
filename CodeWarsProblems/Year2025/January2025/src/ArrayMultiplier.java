/*
 * Problem:
 * Create a function multiplyAll which takes an array of integers and returns another function.
 * The returned function should multiply each element of the original array by a single integer provided as an argument.
 * Example:
 * multiplyAll([1, 2, 3])(2) = [2, 4, 6];
 */

public class ArrayMultiplier {

    // Functional interface representing a function that takes an integer and returns an array of integers
    @FunctionalInterface
    public interface MyFunction {
        int[] apply(int x);
    }

    // Method to create and return a function that multiplies each element of the input array by a given integer
    public static MyFunction multiplyAll(int[] array) {
        return x -> {
            // Create a new array to store the multiplied values
            int[] multipliedArray = new int[array.length];
            
            // Multiply each element of the input array by the given integer and store the result in the new array
            for (int i = 0; i < array.length; i++) {
                multipliedArray[i] = array[i] * x;
            }
            
            // Return the new array with elements multiplied by the given integer
            return multipliedArray;
        };
    }

    public static void main(String[] args) {
        // Test the multiplyAll function
        MyFunction multiplier = multiplyAll(new int[]{1, 2, 3});
        int[] result = multiplier.apply(2);
        
        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Expected output: 2 4 6
    }
}
