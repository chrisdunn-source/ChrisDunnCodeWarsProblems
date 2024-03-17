package March2024;

public class SquareNSum {
    /*
    Complete the square sum function so that it squares each number passed into it and then sums the results together.
     */
    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 2, 2};
        int[] nums2 = {3, 4, 5};
        int[] nums3 = {0, 0, 0};

        System.out.println(squareSum(nums1)); // Output: 9
        System.out.println(squareSum(nums2)); // Output: 50
        System.out.println(squareSum(nums3)); // Output: 0
    }
    public static int squareSum(int[] n) {
        int sum = 0; // Initialize a variable to hold the sum

        for (int num : n) { // Iterate through each number in the array
            sum += num * num; // Square the number and add it to the sum
        }

        return sum; // Return the final sum
    }

}
