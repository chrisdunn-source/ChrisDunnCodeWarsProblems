package May2024;
/*
Given a sequence of numbers, find the largest pair sum in the sequence.

For example

[10, 14, 2, 23, 19] -->  42 (= 23 + 19)
[99, 2, 2, 23, 19]  --> 122 (= 99 + 23)
Input sequence contains minimum two elements and every element is an integer.


 */
public class Solution {
    public static void main(String[] args) {
        // Test case 1: [10, 14, 2, 23, 19]
        int[] sequence1 = {10, 14, 2, 23, 19};
        int largestPairSum1 = largestPairSum(sequence1);
        System.out.println("Largest pair sum for [10, 14, 2, 23, 19]: " + largestPairSum1);

        // Test case 2: [-100, -29, -24, -19, 19]
        int[] sequence2 = {-100, -29, -24, -19, 19};
        int largestPairSum2 = largestPairSum(sequence2);
        System.out.println("Largest pair sum for [-100, -29, -24, -19, 19]: " + largestPairSum2);

        // Test case 3: [1, 2, 3, 4, 6, -1, 2]
        int[] sequence3 = {1, 2, 3, 4, 6, -1, 2};
        int largestPairSum3 = largestPairSum(sequence3);
        System.out.println("Largest pair sum for [1, 2, 3, 4, 6, -1, 2]: " + largestPairSum3);

        // Test case 4: [-10, -8, -16, -18, -19]
        int[] sequence4 = {-10, -8, -16, -18, -19};
        int largestPairSum4 = largestPairSum(sequence4);
        System.out.println("Largest pair sum for [-10, -8, -16, -18, -19]: " + largestPairSum4);
    }

    /**
     * Finds the largest pair sum in a given sequence of numbers.
     *
     * @param sequence the input sequence of numbers
     * @return the largest pair sum
     */
    public static int largestPairSum(int[] sequence) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : sequence) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }

        return largest + secondLargest;
    }
}
