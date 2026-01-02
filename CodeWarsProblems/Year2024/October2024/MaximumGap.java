import java.util.Arrays;

public class MaximumGap.java {
    public static int maxGap(int[] numbers) {
        // Step 1: Sort the array
        Arrays.sort(numbers);
        
        // Step 2: Initialize the maximum gap
        int maxGap = 0;

        // Step 3: Calculate the gaps between successive elements
        for (int i = 1; i < numbers.length; i++) {
            int gap = Math.abs(numbers[i] - numbers[i - 1]);
            maxGap = Math.max(maxGap, gap);
        }

        // Step 4: Return the maximum gap found
        return maxGap;
    }

    public static void main(String[] args) {
        int[] nums = {13, 10, 5, 2, 9};
        System.out.println(maxGap(nums)); // Output: 4
    }
}
