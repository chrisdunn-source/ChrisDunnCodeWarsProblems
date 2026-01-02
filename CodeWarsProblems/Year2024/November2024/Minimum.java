import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Minimum {

    public static int minValue(int[] values) {
        // Use a TreeSet to store unique digits and sort them automatically
        Set<Integer> uniqueDigits = new TreeSet<>();
        
        // Add each digit to the set
        for (int value : values) {
            uniqueDigits.add(value);
        }

        // Build the result number from the sorted unique digits
        StringBuilder result = new StringBuilder();
        for (int digit : uniqueDigits) {
            result.append(digit);
        }

        // Convert the result to an integer and return
        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        // Test the method with an example
        int[] input = {1, 3, 1};
        System.out.println(minValue(input)); // Output should be 13
    }
}
