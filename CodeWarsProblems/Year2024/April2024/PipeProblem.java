package April2024;

import java.util.Arrays;

public class PipeProblem {
    public static void main(String[] args) {
        // Test cases
        int[] test1 = { 1, 2, 3, 5, 6, 8, 9 }; // Original array
        int[] result1 = pipeFix(test1);
        System.out.println(Arrays.toString(result1)); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]

        int[] test2 = { 4, 7, 10, 12 }; // Original array
        int[] result2 = pipeFix(test2);
        System.out.println(Arrays.toString(result2)); // Output: [4, 5, 6, 7, 8, 9, 10, 11, 12]
    }
    public static int[] pipeFix(int[] numbers) {
        int min = numbers[0]; // Get the minimum value
        int max = numbers[numbers.length - 1]; // Get the maximum value

        int[] fixedPipes = new int[max - min + 1]; // Create a new array with the appropriate size

        for (int i = 0; i < fixedPipes.length; i++) {
            fixedPipes[i] = min + i; // Fill the array with values incrementing by 1
        }

        return fixedPipes; // Return the fixedPipes array
    }
}
