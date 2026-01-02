package March2024;
    /*
    Your task is to make two functions ( max and min, or maximum and minimum, etc., depending on the language ) that receive a list of integers as input, and return the largest and lowest number in that list, respectively.

    Examples (Input -> Output)
    * [4,6,2,1,9,63,-134,566]         -> max = 566, min = -134
    * [-52, 56, 30, 29, -54, 0, -110] -> min = -110, max = 56
    * [42, 54, 65, 87, 0]             -> min = 0, max = 87
    * [5]                             -> min = 5, max = 5
     */
public class MinAndMax {
    // Main method to test the min and max functions
    public static void main(String[] args) {
        // Test case 1
        int[] numbers1 = {4, 6, 2, 1, 9, 63, -134, 566};
        MinAndMax kata = new MinAndMax();

        int min1 = kata.min(numbers1);
        int max1 = kata.max(numbers1);

        System.out.println("Minimum value: " + min1); // Output: Minimum value: -134
        System.out.println("Maximum value: " + max1); // Output: Maximum value: 566

        // Test case 2
        int[] numbers2 = {-52, 56, 30, 29, -54, 0, -110};

        int min2 = kata.min(numbers2);
        int max2 = kata.max(numbers2);

        System.out.println("Minimum value: " + min2); // Output: Minimum value: -110
        System.out.println("Maximum value: " + max2); // Output: Maximum value: 56

        // Test case 3
        int[] numbers3 = {42, 54, 65, 87, 0};

        int min3 = kata.min(numbers3);
        int max3 = kata.max(numbers3);

        System.out.println("Minimum value: " + min3); // Output: Minimum value: 0
        System.out.println("Maximum value: " + max3); // Output: Maximum value: 87

        // Test case 4
        int[] numbers4 = {5};

        int min4 = kata.min(numbers4);
        int max4 = kata.max(numbers4);

        System.out.println("Minimum value: " + min4); // Output: Minimum value: 5
        System.out.println("Maximum value: " + max4); // Output: Maximum value: 5
    }
    // Function to find the minimum value in the array
    public int min(int[] list) {
        int minValue = list[0]; // Initialize with the first element of the array

        // Iterate through the array starting from the second element
        for (int i = 1; i < list.length; i++) {
            if (list[i] < minValue) {
                minValue = list[i]; // Update minValue if a smaller value is found
            }
        }

        return minValue; // Return the minimum value
    }

    // Function to find the maximum value in the array
    public int max(int[] list) {
        int maxValue = list[0]; // Initialize with the first element of the array

        // Iterate through the array starting from the second element
        for (int i = 1; i < list.length; i++) {
            if (list[i] > maxValue) {
                maxValue = list[i]; // Update maxValue if a larger value is found
            }
        }

        return maxValue; // Return the maximum value
    }
}
