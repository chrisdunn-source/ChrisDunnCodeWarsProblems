package February2024;
import java.util.HashMap;
/*
    java.util.HashMap is a class that implements the Map interface. It provides a way to store key-value pairs and efficiently retrieve values based on their keys. In this code, we use HashMap to store the numbers as keys and their indices as values.
 */
import java.util.Map;
/*
    java.util.Map is an interface that represents a mapping between keys and values. It defines methods for adding, removing, and retrieving elements based on their keys. In this code, we use the Map interface as the type of the map variable to store our number-index mappings.
 */

public class TwoSumFunction {
    public static void main(String[] args) {
        // Test cases
        int[] numbers1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(numbers1, target1);
        System.out.println("Test Case 1: " + resultToString(result1)); // Expected: [0, 1]

        int[] numbers2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(numbers2, target2);
        System.out.println("Test Case 2: " + resultToString(result2)); // Expected: [1, 2]

        int[] numbers3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(numbers3, target3);
        System.out.println("Test Case 3: " + resultToString(result3)); // Expected: [0, 1]
    }

    // Helper method to convert the result array to a string
    private static String resultToString(int[] result) {
        if (result == null) {
            return "No solution found";
        }
        return "[" + result[0] + ", " + result[1] + "]";
    }
    /*
    The resultToString method is a helper method that converts the result array into a string representation. If the result is null, it returns the string "No solution found." Otherwise, it formats the array as "[index1, index2]" and returns it.
     */

    public static int[] twoSum(int[] numbers, int target) {
        // Create a HashMap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < numbers.length; i++) {
            // Calculate the complement (target minus the current number)
            int complement = target - numbers[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If the complement exists, return the indices of the two numbers
                return new int[]{map.get(complement), i};
            }

            // Add the current number and its index to the map
            map.put(numbers[i], i);
        }

        // No solution found, return null
        return null;
    }

}
/*
    The twoSum function takes an array of numbers and a target number as input.
    It looks for two different numbers in the array that add up to the target value.
    It uses a technique called the "complement approach" to find the solution efficiently.
    The function iterates through the array and for each number, it calculates the complement (target minus the current number).
    It checks if the complement exists in a map.
    If the complement is found in the map, it means we have found the two numbers that add up to the target. It returns their indices.
    If the complement is not found in the map, it adds the current number and its index to the map for future reference.
    If no solution is found after iterating through the entire array, it returns null to indicate that no solution exists.
 */