package May2024;
    /*
    Task
    Write a function that returns both the minimum and maximum number of the given list/array.

    Examples (Input --> Output)
    [1,2,3,4,5] --> [1,5]
    [2334454,5] --> [5,2334454]
    [1]         --> [1,1]
    Remarks
    All arrays or lists will always have at least one element, so you don't need to check the length. Also, your function will always get an array or a list, you don't have to check for null, undefined or similar.
     */
class MinMax {
    public static int[] minMax(int[] arr) {
        // Check if the input array is null or empty
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty.");
        }

        // Initialize min and max with the first element of the array
        int min = arr[0];
        int max = arr[0];

        // Iterate through the array, starting from the second element (i = 1)
        for (int i = 1; i < arr.length; i++) {
            // Update min if a smaller value is found
            if (arr[i] < min) {
                min = arr[i];
            }

            // Update max if a larger value is found
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Return an array containing min and max
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] result1 = minMax(arr1);
        System.out.println("Min: " + result1[0] + ", Max: " + result1[1]);

        int[] arr2 = {2334454, 5};
        int[] result2 = minMax(arr2);
        System.out.println("Min: " + result2[0] + ", Max: " + result2[1]);

        int[] arr3 = {1};
        int[] result3 = minMax(arr3);
        System.out.println("Min: " + result3[0] + ", Max: " + result3[1]);
    }
}