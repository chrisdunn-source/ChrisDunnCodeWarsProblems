package June2024;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class SortOddNumbers {
    /*
    Task
You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.

Examples
[7, 1]  =>  [1, 7]
[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
     */
    public static void main(String[] args) {
        // Test cases
        int[] array1 = {7, 1};
        int[] array2 = {5, 8, 6, 3, 4};
        int[] array3 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        int[] sortedArray1 = sortArray(array1);
        int[] sortedArray2 = sortArray(array2);
        int[] sortedArray3 = sortArray(array3);

        // Print the sorted arrays
        System.out.println("Sorted Array 1: " + Arrays.toString(sortedArray1));
        System.out.println("Sorted Array 2: " + Arrays.toString(sortedArray2));
        System.out.println("Sorted Array 3: " + Arrays.toString(sortedArray3));
    }
    public static int[] sortArray(int[] array) {
        // Step 1: Create a new array to store the sorted numbers
        int[] sortedArray = new int[array.length];

        // Step 2: Separate odd and even numbers
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();

        for (int num : array) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }

        // Step 3: Sort the odd numbers in ascending order
        Collections.sort(oddNumbers);

        // Step 4: Merge the sorted odd numbers with the even numbers
        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sortedArray[i] = evenNumbers.get(evenIndex++);
            } else {
                sortedArray[i] = oddNumbers.get(oddIndex++);
            }
        }

        // Step 5: Return the final sorted array
        return sortedArray;
    }
}
