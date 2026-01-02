package March2024;
    /*
    You are going to be given an array of integers. Your job is to take that array and find an index N where the sum of the integers to the left of N is equal to the sum of the integers to the right of N. If there is no index that would make this happen, return -1.

    For example:
    Let's say you are given the array {1,2,3,4,3,2,1}:
    Your function will return the index 3, because at the 3rd position of the array, the sum of left side of the index ({1,2,3}) and the sum of the right side of the index ({3,2,1}) both equal 6.

    Let's look at another one.
    You are given the array {1,100,50,-51,1,1}:
    Your function will return the index 1, because at the 1st position of the array, the sum of left side of the index ({1}) and the sum of the right side of the index ({50,-51,1,1}) both equal 1.

    Last one:
    You are given the array {20,10,-80,10,10,15,35}
    At index 0 the left side is {}
    The right side is {10,-80,10,10,15,35}
    They both are equal to 0 when added. (Empty arrays are equal to 0 in this problem)
    Index 0 is the place where the left side and right side are equal.

    Note: Please remember that in most languages the index of an array starts at 0.

    Input
    An integer array of length 0 < arr < 1000. The numbers in the array can be any integer positive or negative.

    Output
    The lowest index N where the side to the left of N is equal to the side to the right of N. If you do not find an index that fits these rules, then you will return -1.
     */

public class EqualSidesOfAnArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
        int[] arr2 = {1, 100, 50, -51, 1, 1};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {5, 4, 3, 2, 1};

        int result1 = findEvenIndex(arr1);
        System.out.println("Result for arr1: " + result1); // Expected output: 3

        int result2 = findEvenIndex(arr2);
        System.out.println("Result for arr2: " + result2); // Expected output: 1

        int result3 = findEvenIndex(arr3);
        System.out.println("Result for arr3: " + result3); // Expected output: -1

        int result4 = findEvenIndex(arr4);
        System.out.println("Result for arr4: " + result4); // Expected output: 0
    }
    public static int findEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            // Calculate the sum of integers on the left side of index i
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            // Calculate the sum of integers on the right side of index i
            for (int k = i + 1; k < arr.length; k++) {
                rightSum += arr[k];
            }

            // Check if the sums are equal
            if (leftSum == rightSum) {
                return i;
            }
        }

        // No index found where the sums are equal
        return -1;
    }
}
