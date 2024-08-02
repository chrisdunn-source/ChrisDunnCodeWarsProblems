package August2024;

import java.util.Arrays;
/*
Task
Given an array of integers , Find the minimum sum which is obtained from summing each Two integers product .

Notes
Array/list will contain positives only .
Array/list will always have even size
Input >> Output Examples
minSum({5,4,2,3}) ==> return (22)
Explanation:
The minimum sum obtained from summing each two integers product ,  5*2 + 3*4 = 22
minSum({12,6,10,26,3,24}) ==> return (342)
Explanation:
The minimum sum obtained from summing each two integers product ,  26*3 + 24*6 + 12*10 = 342
 */
public class MinimumSum {

    public static int minSum(int[] passed) {
        // Sort the array in ascending order
        Arrays.sort(passed);

        int sum = 0;

        // Iterate over the array and multiply pairs of integers starting from the beginning and end
        for (int i = 0, j = passed.length - 1; i < j; i++, j--) {
            sum += passed[i] * passed[j];
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {5, 4, 2, 3};
        System.out.println("Minimum sum for arr1: " + minSum(arr1)); // Expected output: 22

        int[] arr2 = {1, 2, 3, 4, 5, 6};
        System.out.println("Minimum sum for arr2: " + minSum(arr2)); // Expected output: 33
    }
}
