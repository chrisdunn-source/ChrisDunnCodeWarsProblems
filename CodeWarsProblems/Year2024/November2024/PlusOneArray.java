public class PlusOneArray {
    public static int[] upArray(final int[] arr) {
        // Step 1: Validate the input
        if (arr == null || arr.length == 0) {
            return null; // Invalid if empty
        }
        for (int num : arr) {
            if (num < 0 || num > 9) {
                return null; // Invalid if negative or more than 1 digit
            }
        }

        // Step 2: Prepare to add one
        int n = arr.length;
        int[] result = new int[n + 1]; // Result can be one digit longer

        // Start adding from the last digit
        int carry = 1; // We want to add one
        for (int i = n - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            if (sum == 10) {
                result[i + 1] = 0; // Set next position to 0
                carry = 1; // Keep carry for next iteration
            } else {
                result[i + 1] = sum; // Set result to the sum
                carry = 0; // No carry needed anymore
            }
        }

        // Step 3: Handle the case where there's still a carry
        if (carry == 1) {
            result[0] = 1; // Set the first digit to 1
            return result; // Return the result array
        }

        // If there's no carry, return the part of the array that has values
        int[] finalResult = new int[n];
        System.arraycopy(result, 1, finalResult, 0, n);
        return finalResult;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(java.util.Arrays.toString(upArray(new int[]{4, 3, 2, 5}))); // [4, 3, 2, 6]
        System.out.println(java.util.Arrays.toString(upArray(new int[]{1, 2, 3, 9}))); // [1, 2, 4, 0]
        System.out.println(java.util.Arrays.toString(upArray(new int[]{9, 9, 9, 9}))); // [1, 0, 0, 0, 0]
        System.out.println(java.util.Arrays.toString(upArray(new int[]{0, 1, 3, 7}))); // [0, 1, 3, 8]
        System.out.println(java.util.Arrays.toString(upArray(new int[]{}))); // null
        System.out.println(java.util.Arrays.toString(upArray(new int[]{1, -9}))); // null
        System.out.println(java.util.Arrays.toString(upArray(new int[]{1, 2, 33}))); // null
    }
}
