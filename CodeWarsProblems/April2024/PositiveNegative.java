package April2024;

public class PositiveNegative {
    public static void main(String[] args) {
        // Test cases
        int[] input1 = {1, -2, 3, -4, 5};
        int[] result1 = countPositivesSumNegatives(input1);
        System.out.println("Count of positives: " + result1[0]); // Expected output: 3
        System.out.println("Sum of negatives: " + result1[1]); // Expected output: -6

        int[] input2 = {-1, -2, -3, -4, -5};
        int[] result2 = countPositivesSumNegatives(input2);
        System.out.println("Count of positives: " + result2[0]); // Expected output: 0
        System.out.println("Sum of negatives: " + result2[1]); // Expected output: -15

        int[] input3 = {0, 0, 0, 0, 0};
        int[] result3 = countPositivesSumNegatives(input3);
        System.out.println("Count of positives: " + result3[0]); // Expected output: 0
        System.out.println("Sum of negatives: " + result3[1]); // Expected output: 0

        int[] input4 = {};
        int[] result4 = countPositivesSumNegatives(input4);
        System.out.println("Count of positives: " + result4[0]); // Expected output: 0
        System.out.println("Sum of negatives: " + result4[1]); // Expected output: 0
    }
    public static int[] countPositivesSumNegatives(int[] input) {
        // Check if the input is null or empty
        if (input == null || input.length == 0) {
            return new int[0]; // Return an empty array for null or empty input
        }

        int countPositives = 0; // Initialize variable to count positive numbers
        int sumNegatives = 0; // Initialize variable to store sum of negative numbers

        // Iterate over each number in the input array
        for (int num : input) {
            if (num > 0) { // If number is positive
                countPositives++; // Increment the count of positives
            } else if (num < 0) { // If number is negative
                sumNegatives += num; // Add the number to the sum of negatives
            }
        }

        return new int[] {countPositives, sumNegatives}; // Return an array with count and sum
    }
}
    /*
    Added a check at the beginning of the method to handle null or empty input. If the input is null or has a length of 0, we return an empty array using new int[0].

    Initialized two variables, countPositives and sumNegatives, to keep track of the count and sum respectively.

    Used an enhanced for loop to iterate over the input array. For each number, we check if it's positive (greater than 0) and increment countPositives if true. If it's negative (less than 0), we add it to sumNegatives.

    Finally, we return a new array with the values of countPositives and sumNegatives using new int[] {countPositives, sumNegatives}.
     */