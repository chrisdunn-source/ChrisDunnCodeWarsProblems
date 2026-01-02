import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Let's use a more meaningful class name for better understanding
public class MaxTripletSumFinder {

    // Method to find the maximum triplet sum in an array without duplicates
    public static int maxTriSum(int[] numbers) {
        // Sort the array in descending order to make it easier to find the maximum triplet sum
        Arrays.sort(numbers);
        int sum = 0; // Initialize the sum variable to store the final result
        
        // Use a Set to keep track of unique numbers in the array
        Set<Integer> uniqueNumbers = new HashSet<>();
        
        // Iterate over the sorted array from the end to find the three largest unique numbers
        for (int i = numbers.length - 1; i >= 0 && uniqueNumbers.size() < 3; i--) {
            // Add the current number to the Set if it's unique and add it to the sum
            if (uniqueNumbers.add(numbers[i])) {
                sum += numbers[i];
            }
        }
        
        return sum; // Return the maximum triplet sum without duplicates
    }

    // Main method for testing the maxTriSum method
    public static void main(String[] args) {
        int[] arr = {3, 2, 6, 8, 2, 3};
        System.out.println(maxTriSum(arr)); // Output should be 17
    }
}
