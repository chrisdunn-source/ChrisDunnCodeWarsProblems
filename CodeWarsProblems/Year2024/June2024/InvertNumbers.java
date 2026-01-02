package June2024;

import java.util.Arrays;
/*
Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.

[1, 2, 3, 4, 5] --> [-1, -2, -3, -4, -5]
[1, -2, 3, -4, 5] --> [-1, 2, -3, 4, -5]
[] --> []

 */
public class InvertNumbers {
    public static int[] invert(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = -array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] inverted1 = invert(nums1);
        System.out.println("Original: " + Arrays.toString(nums1));
        System.out.println("Inverted: " + Arrays.toString(inverted1));

        // Test case 2
        int[] nums2 = {1, -2, 3, -4, 5};
        int[] inverted2 = invert(nums2);
        System.out.println("Original: " + Arrays.toString(nums2));
        System.out.println("Inverted: " + Arrays.toString(inverted2));

        // Test case 3
        int[] nums3 = {};
        int[] inverted3 = invert(nums3);
        System.out.println("Original: " + Arrays.toString(nums3));
        System.out.println("Inverted: " + Arrays.toString(inverted3));
    }
}
