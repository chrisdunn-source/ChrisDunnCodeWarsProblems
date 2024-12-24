/**
 * Problem:
 * Given an array of integers, the goal is to find the integer with 
 * the most digits. If there are multiple integers with the same 
 * number of digits, return the one with the largest absolute value.
 */
public class MostDigits {
    
    /**
     * This method finds the integer with the most digits in the given array.
     * If multiple integers have the same number of digits, it returns the one
     * with the largest absolute value.
     *
     * @param numbers an array of integers
     * @return the integer with the most digits
     */
    public static int findLongest(int[] numbers) {
        // Initialize longestNumber to the first element of the array
        int longestNumber = numbers[0];
        // Initialize longestIndex to 0 (the index of the first element)
        int longestIndex = 0;
        
        // Loop through the array starting from the second element
        for (int i = 1; i < numbers.length; i++) {
            // Get the length of the current number (absolute value)
            int currentLength = String.valueOf(Math.abs(numbers[i])).length();
            // Get the length of the longest number found so far (absolute value)
            int longestLength = String.valueOf(Math.abs(longestNumber)).length();
            
            // If the current number has more digits than the longest found
            if (currentLength > longestLength) {
                // Update longestNumber and longestIndex
                longestNumber = numbers[i];
                longestIndex = i;
            } 
            // If the current number has the same number of digits
            else if (currentLength == longestLength) {
                // Check if the current number's absolute value is greater
                if (Math.abs(numbers[i]) > Math.abs(longestNumber)) {
                    // Update longestNumber and longestIndex
                    longestNumber = numbers[i];
                    longestIndex = i;
                }
            }
        }
        
        // Return the number with the most digits
        return longestNumber;
    }

    // Main method for testing the findLongest method
    public static void main(String[] args) {
        // Test cases
        int[] test1 = {123, 45, 6789, 0, -12345};
        System.out.println("Longest number: " + findLongest(test1)); // Expected output: -12345

        int[] test2 = {1, 22, 333, 4444, -55555};
        System.out.println("Longest number: " + findLongest(test2)); // Expected output: -55555

        int[] test3 = {100, 2000, 30000, 400000, 5000000};
        System.out.println("Longest number: " + findLongest(test3)); // Expected output: 5000000

        int[] test4 = {-10, -20, -30, -40, -50};
        System.out.println("Longest number: " + findLongest(test4)); // Expected output: -50

        int[] test5 = {1, 22, 333, -333, 444};
        System.out.println("Longest number: " + findLongest(test5)); // Expected output: 444
    }
}
