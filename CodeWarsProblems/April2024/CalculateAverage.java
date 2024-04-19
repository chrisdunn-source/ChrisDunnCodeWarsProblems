package April2024;
    /*
    Write a function which calculates the average of the numbers in a given list.

    Note: Empty arrays should return 0.
     */
public class CalculateAverage {
    public static void main(String[] args) {
        // Test cases to verify the functionality of the find_average method
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Average of arr1: " + find_average(arr1));  // Expected output: 3.0

        int[] arr2 = {-1, 0, 1};
        System.out.println("Average of arr2: " + find_average(arr2));  // Expected output: 0.0

        int[] arr3 = {};
        System.out.println("Average of arr3: " + find_average(arr3));  // Expected output: 0.0
    }
    public static double find_average(int[] array) {
        if (array.length == 0) {
            return 0;  // Return 0 if the array is empty
        }

        int sum = 0;
        for (int num : array) {
            sum += num;  // Sum all the numbers in the array
        }

        double average = (double) sum / array.length;  // Calculate the average
        return average;
    }
}
