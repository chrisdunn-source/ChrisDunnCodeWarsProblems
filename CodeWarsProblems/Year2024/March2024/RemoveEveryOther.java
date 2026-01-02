package March2024;

import java.util.Arrays;
        /*
        ake an array and remove every second element from the array. Always keep the first element and start removing with the next element.

        Example:
        ["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]
         */
public class RemoveEveryOther {
    public static void main(String[] args) {
        // Test Case 1: Array with odd length
        Object[] arr1 = {"Keep", "Remove", "Keep", "Remove", "Keep"};
        Object[] result1 = removeEveryOther(arr1);
        System.out.println("Original Array: " + Arrays.toString(arr1));
        System.out.println("Resulting Array: " + Arrays.toString(result1));
        // Output: Original Array: [Keep, Remove, Keep, Remove, Keep]
        //         Resulting Array: [Keep, Keep, Keep]

        // Test Case 2: Array with even length
        Object[] arr2 = {"Apple", "Banana", "Cherry", "Date"};
        Object[] result2 = removeEveryOther(arr2);
        System.out.println("Original Array: " + Arrays.toString(arr2));
        System.out.println("Resulting Array: " + Arrays.toString(result2));
        // Output: Original Array: [Apple, Banana, Cherry, Date]
        //         Resulting Array: [Apple, Cherry]
    }
    public static Object[] removeEveryOther(Object[] arr) {
        // Create a new array to store the result
        // The length of the result array is equal to half the length of the original array (rounded up to the nearest integer)
        Object[] result = new Object[(arr.length + 1) / 2];

        // Iterate over the original array, skipping every second element
        // The variable 'i' starts at 0 and increments by 2 in each iteration
        for (int i = 0; i < arr.length; i += 2) {
            // Copy the element at index 'i' from the original array to the result array
            // The index in the result array is 'i / 2' because we are skipping every second element
            result[i / 2] = arr[i];
        }

        // Return the resulting array
        return result;
    }
}
        /*
        We create a new array called result to store the resulting elements.
        The length of the result array is calculated as (arr.length + 1) / 2. Since we want to round up to the nearest integer, we add 1 to the length and then divide by 2.
        We iterate over the original array, starting from index 0 and incrementing i by 2 in each iteration. This allows us to skip every second element.
        Inside the loop, we copy the element at index i from the original array to the result array. The index in the result array is calculated as i / 2 because we are skipping every second element.
        After the loop, we return the resulting array.
         */