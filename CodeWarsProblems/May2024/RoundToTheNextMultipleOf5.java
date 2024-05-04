package May2024;
    /*
    Given an integer as input, can you round it to the next (meaning, "greater than or equal") multiple of 5?

    Examples:

    input:    output:
    0    ->   0
    2    ->   5
    3    ->   5
    12   ->   15
    21   ->   25
    30   ->   30
    -2   ->   0
    -5   ->   -5
    etc.
    Input may be any positive or negative integer (including 0).

    You can assume that all inputs are valid integers.
     */

public class RoundToTheNextMultipleOf5 {
    public static void main(String[] args) {
        // Basic tests
        int input1 = -1;
        int output1 = roundToNext5(input1);
        System.out.println(output1); // 0

        int input2 = -61281;
        int output2 = roundToNext5(input2);
        System.out.println(output2); // -61280

        // Additional tests
        // Add any additional test cases you'd like to validate

    }

    public static int roundToNext5(int number) {
        // Check if the number is already a multiple of 5
        if (number % 5 == 0) {
            return number; // If so, return the number itself
        } else {
            // Calculate the difference between the number and the next multiple of 5
            // Adjust the calculation based on whether the number is positive or negative
            // For negative numbers, we use (-1 * number % 5) to get the correct difference
            // For positive numbers, we use (5 - (number % 5))
            return number + ((number < 0) ? (-1 * number % 5) : (5 - (number % 5)));
        }
    }


}