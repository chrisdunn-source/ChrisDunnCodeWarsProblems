/**
 * Problem Statement:
 * 
 * Write a method that returns the top n largest elements from an integer array.
 * The result should be returned in ascending order. The method should handle 
 * cases where n is less than or equal to zero by returning an empty array. 
 * If there are duplicates in the input array, the method should include 
 * duplicates in the output as well.
 * 
 * Example:
 * largest(2, new int[]{1, 2, 3, 4, 5, 6}) should return [5, 6].
 * largest(3, new int[]{1, 2, 1, 1}) should return [1, 1, 2].
 */

import java.util.Arrays;

public class LargestElementsFinder {

    public static int[] largest(int n, int[] arr) {
        // If n is 0 or negative, return an empty array
        if (n <= 0) {
            return new int[0];
        }
        
        // Sort the array in descending order
        Integer[] sortedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedArr, (a, b) -> b - a);
        
        // Create a result array to hold the top n elements
        int[] result = new int[Math.min(n, sortedArr.length)];
        
        // Copy the first n elements from the sorted array to the result
        for (int i = 0; i < result.length; i++) {
            result[i] = sortedArr[i];
        }
        
        // Sort the result array in ascending order before returning
        Arrays.sort(result);
        
        return result;
    }
    
    public static void main(String[] args) {
        // Test cases
        System.out.println(Arrays.toString(largest(2, new int[]{1, 2, 3, 4, 5, 6}))); // Output: [5, 6]
        System.out.println(Arrays.toString(largest(4, new int[]{3, 4, 5, 6, 7}))); // Output: [4, 5, 6, 7]
        System.out.println(Arrays.toString(largest(3, new int[]{1, 2, 1, 1}))); // Output: [1, 1, 2]
        System.out.println(Arrays.toString(largest(5, new int[]{1, 2, 3, 4, 5}))); // Output: [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(largest(0, new int[]{1, 2, 3, 4, 5}))); // Output: []
    }
}
