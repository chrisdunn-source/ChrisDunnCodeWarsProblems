package August2024;
/*
Write a function that can return the smallest value of an array or the index of that value. The function's 2nd parameter will tell whether it should return the value or the index.

Assume the first parameter will always be an array filled with at least 1 number and no duplicates. Assume the second parameter will be a string holding one of two values: 'value' and 'index'.

Arrays.findSmallest(new int[]{1,2,3,4,5}, 'value') // => 1
Arrays.findSmallest(new int[]{1,2,3,4,5}, 'index') // => 0
 */
public class Arrays {

    // Function to find the smallest value or index in an array
    public static int findSmallest(final int[] numbers, final String toReturn) {
        // Check if the user wants to return the smallest value
        if ("value".equals(toReturn)) {
            int minValue = numbers[0]; // Initialize the minimum value with the first element of the array
            // Loop through the array to find the smallest value
            for (int i = 1; i < numbers.length; i++) {
                // Update the minimum value if a smaller value is found
                if (numbers[i] < minValue) {
                    minValue = numbers[i];
                }
            }
            return minValue; // Return the smallest value
        }
        // Check if the user wants to return the index of the smallest value
        else if ("index".equals(toReturn)) {
            int minIndex = 0; // Initialize the index of the minimum value as the first index
            // Loop through the array to find the index of the smallest value
            for (int i = 1; i < numbers.length; i++) {
                // Update the index if a smaller value is found
                if (numbers[i] < numbers[minIndex]) {
                    minIndex = i;
                }
            }
            return minIndex; // Return the index of the smallest value
        }
        // Handle invalid input for the second parameter
        else {
            throw new IllegalArgumentException("Invalid parameter value. Use 'value' or 'index'.");
        }
    }

    // Main method to test the findSmallest function
    public static void main(String[] args) {
        // Test case: return the smallest value
        System.out.println(findSmallest(new int[]{1, 2, 3, 4, 5}, "value")); // => 1
        // Test case: return the index of the smallest value
        System.out.println(findSmallest(new int[]{1, 2, 3, 4, 5}, "index")); // => 0
    }
}
