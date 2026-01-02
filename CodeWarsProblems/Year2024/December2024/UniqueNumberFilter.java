import java.util.LinkedHashSet; // Importing LinkedHashSet to use for storing unique numbers
import java.util.Arrays; // Importing Arrays to use for printing the result

public class UniqueNumberFilter {
    // This method takes an array of non-negative integers and removes duplicates.
    public static int[] distinct(int[] array) {
        // Create a LinkedHashSet to store unique numbers and maintain their order
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        // Loop through each number in the input array
        for (int num : array) {
            // Add each number to the set
            // If the number is already in the set, it won't be added again
            set.add(num);
        }
        
        // Create a new array to hold the unique numbers
        int[] result = new int[set.size()]; // The size of the new array is the same as the set
        int index = 0; // This variable will help us keep track of where to place numbers in the new array
        
        // Loop through each number in the set
        for (int num : set) {
            // Place each unique number in the result array
            result[index++] = num; // Increment index after placing the number
        }
        
        // Return the new array that contains only unique numbers
        return result;
    }

    // The main method is where the program starts running
    public static void main(String[] args) {
        // Test case 1: Input with duplicates
        int[] input1 = {1, 1, 2};
        int[] output1 = distinct(input1); // Call the distinct method
        System.out.println("Input: " + Arrays.toString(input1) + " -> Output: " + Arrays.toString(output1));
        // Expected Output: [1, 2]

        // Test case 2: Input with multiple duplicates
        int[] input2 = {1, 2, 1, 1, 3, 2};
        int[] output2 = distinct(input2); // Call the distinct method
        System.out.println("Input: " + Arrays.toString(input2) + " -> Output: " + Arrays.toString(output2));
        // Expected Output: [1, 2, 3]

        // Test case 3: Input with no duplicates
        int[] input3 = {4, 5, 6};
        int[] output3 = distinct(input3); // Call the distinct method
        System.out.println("Input: " + Arrays.toString(input3) + " -> Output: " + Arrays.toString(output3));
        // Expected Output: [4, 5, 6]

        // Test case 4: Input where all numbers are the same
        int[] input4 = {7, 7, 7, 7};
        int[] output4 = distinct(input4); // Call the distinct method
        System.out.println("Input: " + Arrays.toString(input4) + " -> Output: " + Arrays.toString(output4));
        // Expected Output: [7]

        // Test case 5: Empty input
        int[] input5 = {};
        int[] output5 = distinct(input5); // Call the distinct method
        System.out.println("Input: " + Arrays.toString(input5) + " -> Output: " + Arrays.toString(output5));
        // Expected Output: []
    }
}
