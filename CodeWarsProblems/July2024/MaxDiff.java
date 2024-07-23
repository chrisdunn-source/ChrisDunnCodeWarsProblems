package July2024;
/*
You must implement a function that returns the difference between the largest and the smallest value in a given list / array (lst) received as the parameter.

lst contains integers, that means it may contain some negative numbers
if lst is empty or contains a single element, return 0
lst is not sorted
[1, 2, 3, 4]   //  returns 3 because 4 -   1  == 3
[1, 2, 3, -4]  //  returns 7 because 3 - (-4) == 7
 */

public class MaxDiff {

    public static int maxDiff(int[] lst) {
        if (lst.length == 0 || lst.length == 1) {
            return 0; // If the array is empty or contains a single element, return 0
        }

        int min = lst[0]; // Initialize the minimum value with the first element
        int max = lst[0]; // Initialize the maximum value with the first element

        // Iterate over the remaining elements of the array
        for (int i = 1; i < lst.length; i++) {
            if (lst[i] < min) {
                min = lst[i]; // Update min if the current element is smaller
            }
            if (lst[i] > max) {
                max = lst[i]; // Update max if the current element is larger
            }
        }

        return max - min; // Calculate and return the difference between max and min
    }

    public static void main(String[] args) {
        int[] lst1 = {1, 2, 3, 4};
        int diff1 = maxDiff(lst1);
        System.out.println("Difference 1: " + diff1);

        int[] lst2 = {1, 2, 3, -4};
        int diff2 = maxDiff(lst2);
        System.out.println("Difference 2: " + diff2);
    }
}
