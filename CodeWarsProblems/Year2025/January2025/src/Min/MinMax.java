import java.util.List;
import java.util.Collections;
import java.util.Arrays;

class MinMax {
    // Method to get the minimal and maximal value of a list
    static int[] getMinMax(List<Integer> list) {
        // Find the minimum value in the list
        int min = Collections.min(list);
        // Find the maximum value in the list
        int max = Collections.max(list);
        // Return an array containing the minimum and maximum values
        return new int[] { min, max };
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a sample list for testing
        List<Integer> numbers = Arrays.asList(3, 7, 1, 10, 5);

        // Get the minimal and maximal values from the list
        int[] minMaxValues = getMinMax(numbers);

        // Print the results
        System.out.println("Minimum value: " + minMaxValues[0]);
        System.out.println("Maximum value: " + minMaxValues[1]);
    }
}
