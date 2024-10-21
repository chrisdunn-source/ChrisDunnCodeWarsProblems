import java.util.*;

public class ArrayLeaders {
    // Method to find leaders in an array
    public static List<Integer> arrayLeaders(int[] numbers) {
        List<Integer> leaders = new ArrayList<>(); // Initialize a list to store leader elements
        
        // Iterate through each element in the array
        for (int i = 0; i < numbers.length; i++) {
            int rightSum = 0; // Initialize the sum of elements to the right of the current element
            
            // Calculate the sum of elements to the right of the current element
            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }
            
            // Check if the current element is greater than the sum of elements to its right
            if (numbers[i] > rightSum) {
                leaders.add(numbers[i]); // Add the current element as a leader
            }
        }
        
        return leaders; // Return the list of leaders
    }
    
    // Main method to run test cases
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 0};
        System.out.println("Array 1 Leaders: " + arrayLeaders(arr1)); // Expected: [4]
        
        int[] arr2 = {-1, -2, -3, -4};
        System.out.println("Array 2 Leaders: " + arrayLeaders(arr2)); // Expected: [-1]
        
        int[] arr3 = {0, -1, 3, 2};
        System.out.println("Array 3 Leaders: " + arrayLeaders(arr3)); // Expected: [0, -1, 3, 2]
    }
}
