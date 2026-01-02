public class DigitIncrementer {

    // Method to increment each digit in the input array by its position
    public static int[] incrementDigits(int[] numbers) {
        // Check if the input array is empty
        if(numbers.length == 0) {
            return new int[0]; // Return an empty array if input array is empty
        }

        // Iterate through the input array
        for (int i = 0; i < numbers.length; i++) {
            // Increment the digit by its position and keep it as a single digit
            numbers[i] = (numbers[i] + i + 1) % 10;
        }

        // Return the array with digits incremented by their positions
        return numbers;
    }

    public static void main(String[] args) {
        // Test cases
        int[] test1 = {1, 2, 3};
        int[] result1 = incrementDigits(test1);
        System.out.println("Test Case 1: " + Arrays.toString(result1)); // Expected: [2, 4, 6]

        int[] test2 = {4, 6, 9, 1, 3};
        int[] result2 = incrementDigits(test2);
        System.out.println("Test Case 2: " + Arrays.toString(result2)); // Expected: [5, 8, 2, 5, 8]
    }
}
