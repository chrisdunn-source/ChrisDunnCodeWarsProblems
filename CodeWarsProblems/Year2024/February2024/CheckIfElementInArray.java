package February2024;
/*
    You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.

    Array can contain numbers or strings. X can be either.

    Return true if the array contains the value, false if not.
 */
public class CheckIfElementInArray {
    public static void main(String[] args) {
        // Test Case 1: Array of numbers
        Integer[] numbers = {1, 2, 3, 4, 5};
        Integer value1 = 3;
        System.out.println(check(numbers, value1)); // Output: true

        // Test Case 2: Array of strings
        String[] strings = {"apple", "banana", "orange"};
        String value2 = "banana";
        System.out.println(check(strings, value2)); // Output: true

        // Test Case 3: Array of numbers
        Integer[] numbers2 = {10, 20, 30, 40, 50};
        Integer value3 = 35;
        System.out.println(check(numbers2, value3)); // Output: false

        // Test Case 4: Empty array
        Integer[] emptyArray = {};
        Integer value4 = 7;
        System.out.println(check(emptyArray, value4)); // Output: false
    }

    public static boolean check(Object[] a, Object x) {
        // Iterate over each element in the array
        for (Object element : a) {
            // Check if the current element is equal to the given value
            if (element.equals(x)) {
                // If a match is found, return true
                return true;
            }
        }
        // If no match is found after iterating through all elements, return false
        return false;
    }
}
