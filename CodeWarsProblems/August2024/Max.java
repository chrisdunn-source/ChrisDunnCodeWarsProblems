public class Max {
    /*
    The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:

    Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
    // should be 6: {4, -1, 2, 1}
    Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.

    Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
     */
    public static int sequence(int[] arr) {
        // If the input array is null or empty, return 0 as per the problem statement
        if (arr == null || arr.length == 0) {
            return 0;
        }

        // Initialize maxSum and currentSum to the first element of the array
        int maxSum = arr[0];
        int currentSum = arr[0];

        // Iterate through the rest of the array
        for (int i = 1; i < arr.length; i++) {
            // Update currentSum to be the maximum of the current element and the sum of the
            // current element and the previous currentSum
            // This ensures we either start a new subarray or continue the current subarray,
            // whichever gives us the maximum sum
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update maxSum to be the maximum of the current maxSum and the updated currentSum
            // This keeps track of the overall maximum sum
            maxSum = Math.max(maxSum, currentSum);
        }

        // If the maximum sum is less than or equal to 0 (i.e., the array contains only negative values),
        // return 0 as per the problem statement
        return maxSum > 0 ? maxSum : 0;
    }

    public static void main(String[] args) {
        // Test case 1: Positive array
        int[] positiveArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result1 = Max.sequence(positiveArray);
        System.out.println("Test case 1 (Positive array): " + result1); // Output: 6

        // Test case 2: Negative array
        int[] negativeArray = {-2, -1, -3, -4, -1, -2, -1, -5, -4};
        int result2 = Max.sequence(negativeArray);
        System.out.println("Test case 2 (Negative array): " + result2); // Output: 0

        // Test case 3: Empty array
        int[] emptyArray = {};
        int result3 = Max.sequence(emptyArray);
        System.out.println("Test case 3 (Empty array): " + result3); // Output: 0
    }
}
