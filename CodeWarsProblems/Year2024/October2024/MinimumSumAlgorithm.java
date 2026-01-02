import java.util.Arrays;

public class MinimumSumAlgorithm {
    
    // Method to find the minimum sum from summing each pair of integers product
    public static int minSum(int[] passed) {
        // Sort the array in ascending order
        Arrays.sort(passed);
        
        // Initialize the variable to store the minimum sum
        int minSum = 0;
        
        // Iterate over the first half of the array to pair the smallest and largest numbers
        for (int i = 0; i < passed.length / 2; i++) {
            // Calculate the product of each pair of integers and add it to the minimum sum
            minSum += passed[i] * passed[passed.length - 1 - i];
        }
        
        // Return the minimum sum
        return minSum;
    }
    
    // Main method to test the minSum method
    public static void main(String[] args) {
        int[] testArray = {4, 2, 1, 3};
        System.out.println("Minimum Sum: " + minSum(testArray)); // Expected output: 11
    }
}
