import java.util.Arrays; // Importing the Arrays class to use array-related utilities

public class MinimumStepsFinder {

    // Method to find the minimum steps required to reach a sum greater than or equal to K
    public static int minimumSteps(int[] numbers, int K) {
        Arrays.sort(numbers); // Sorting the array in ascending order to access smallest numbers first
        int sum = 0; // Initializing a variable to keep track of the sum of numbers
        int count = 0; // Initializing a counter to keep track of how many numbers are added

        // Looping through the sorted array to add numbers until the sum is greater than or equal to K
        for (int num : numbers) {
            sum += num; // Adding the current number to the sum
            count++; // Incrementing the count of numbers added

            if (sum >= K) { // Checking if the sum is greater than or equal to K
                break; // Exiting the loop if the condition is met
            }
        }

        return count - 1; // Returning the count of numbers added after adjusting by 1 to fix off-by-one error
    }

    public static void main(String[] args) {
        int[] array = {1, 10, 12, 9, 2, 3}; // Sample array of numbers
        int K = 6; // Threshold sum to reach
        int result = minimumSteps(array, K); // Calling the method to find minimum steps
        System.out.println("Minimum steps required: " + result); // Displaying the result
    }
}
