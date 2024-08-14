package August2024;
/*
Your task is to write a function which returns the sum of a sequence of integers.

The sequence is defined by 3 non-negative values: begin, end, step.

If begin value is greater than the end, your function should return 0. If end is not the result of an integer number of steps, then don't add it to the sum. See the 4th example below.

Examples

2,2,2 --> 2
2,6,2 --> 12 (2 + 4 + 6)
1,5,1 --> 15 (1 + 2 + 3 + 4 + 5)
1,5,3  --> 5 (1 + 4)
 */
public class FunctionSum {

    // Function to calculate the sum of a sequence of integers
    public static int sequenceSum(int start, int end, int step) {
        // If the starting value is greater than the ending value, return 0
        if (start > end) {
            return 0;
        }

        // Initialize sum to 0
        int sum = 0;

        // Iterate through the sequence and add the values to sum
        for (int i = start; i <= end; i += step) {
            sum += i;
        }

        // Return the final sum of the sequence
        return sum;
    }

    // Main method to test the sequenceSum function
    public static void main(String[] args) {
        // Test cases
        System.out.println(sequenceSum(2, 2, 2)); // Expected output: 2
        System.out.println(sequenceSum(2, 6, 2)); // Expected output: 12
        System.out.println(sequenceSum(1, 5, 1)); // Expected output: 15
        System.out.println(sequenceSum(1, 5, 3)); // Expected output: 5
    }
}
