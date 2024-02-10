public class OddOrEven {
    /*
    Given a list of integers, determine whether the sum of its elements is odd or even.
    Give your answer as a string matching "odd" or "even".
    If the input array is empty consider it as: [0] (array with a zero).

    Examples:
    Input: [0]
    Output: "even"
    Input: [0, 1, 4]
    Output: "odd"
    Input: [0, -1, -5]
    Output: "even"
     */
    public static void main(String[] args) {
        // Test case 1: Empty array (considered as [0])
        int[] array1 = {};
        System.out.println(oddOrEven(array1)); // Output: even

        // Test case 2: Array with a single element (0)
        int[] array2 = {0};
        System.out.println(oddOrEven(array2)); // Output: even

        // Test case 3: Array with multiple elements [0, 1, 4]
        int[] array3 = {0, 1, 4};
        System.out.println(oddOrEven(array3)); // Output: odd

        // Test case 4: Array with negative elements [0, -1, -5]
        int[] array4 = {0, -1, -5};
        System.out.println(oddOrEven(array4)); // Output: even

        // Test case 5: Array with positive and negative elements [2, -3, 6, -8]
        int[] array5 = {2, -3, 6, -8};
        System.out.println(oddOrEven(array5)); // Output: odd

    }

    public static String oddOrEven(int[] array) {
        // Initialize a variable to store the sum of the array elements
        int sum = 0;

        // Iterate over each element in the array
        for (int num : array) {
            // Add the current element to the sum
            sum += num;
        }

        // Use the conditional operator to determine if the sum is odd or even
        String result = (sum % 2 == 0) ? "even" : "odd";

        // Return the result
        return result;
    }
}
/*
Here's a breakdown of this code:

The method oddOrEven takes an integer array called array as input and returns a string indicating whether the sum of the array elements is odd or even.

We initialize an integer variable sum to 0. This variable will store the sum of the array elements.

We use a for-each loop to iterate over each element num in the array.

Inside the loop, we add the current element num to the sum variable.

After iterating through all the elements in the array, we use the conditional operator (sum % 2 == 0) ? "even" : "odd" to determine if the sum is odd or even.

If the condition (sum % 2 == 0) is true, it means the sum is divisible by 2 and therefore even. In this case, the conditional operator returns the string "even" and assigns it to the result variable.

If the condition (sum % 2 == 0) is false, it means the sum is not divisible by 2 and therefore odd. In this case, the conditional operator returns the string "odd" and assigns it to the result variable.

Finally, we return the result variable, which contains the string "even" or "odd" based on the condition evaluated by the conditional operator.
 */
