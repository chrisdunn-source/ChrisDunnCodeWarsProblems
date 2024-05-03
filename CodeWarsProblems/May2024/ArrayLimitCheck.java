package May2024;
    /*
    You will be given an array and a limit value. You must check that all values in the array are below or equal to the limit value. If they are, return true. Else, return false.

    You can assume all values in the array are numbers.
     */
public class ArrayLimitCheck {
    // Main method to run test cases
    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 3, 4, 5};      // All elements are below or equal to 5, so expected output is true
        int limit1 = 5;
        System.out.println(smallEnough(arr1, limit1));  // Output: true

        int[] arr2 = {10, 20, 30, 40, 50}; // All elements are above 8, so expected output is false
        int limit2 = 8;
        System.out.println(smallEnough(arr2, limit2));  // Output: false

        int[] arr3 = {5, 5, 5, 5, 5};       // All elements are equal to 5, so expected output is true
        int limit3 = 5;
        System.out.println(smallEnough(arr3, limit3));  // Output: true
    }

    // Method to check if all values in the array are below or equal to the limit value
    public static boolean smallEnough(int[] a, int limit) {
        for (int num : a) {    // Iterate through each element 'num' in the array 'a'
            if (num > limit) {   // Check if the current element 'num' is greater than the limit value
                return false;     // If 'num' exceeds the limit, return false immediately
            }
        }
        return true;           // If all elements are below or equal to the limit, return true
    }
}
