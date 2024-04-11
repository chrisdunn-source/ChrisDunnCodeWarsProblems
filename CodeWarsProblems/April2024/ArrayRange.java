package April2024;
import java.util.Arrays;
public class ArrayRange {
    public static void main(String[] args) {
        // Test cases
        int[] test1 = between(1, 5);
        System.out.println(Arrays.toString(test1)); // [1, 2, 3, 4, 5]

        int[] test2 = between(10, 15);
        System.out.println(Arrays.toString(test2)); // [10, 11, 12, 13, 14, 15]

        int[] test3 = between(-3, 2);
        System.out.println(Arrays.toString(test3)); // [-3, -2, -1, 0, 1, 2]
    }

    public static int[] between(int a, int b) {
        // Calculate the size of the resulting array
        int size = b - a + 1;

        // Create a new array with the calculated size
        int[] result = new int[size];

        // Use a loop to assign values to the array
        for (int i = 0; i < size; i++) {
            result[i] = a + i;
        }

        // Return the populated array
        return result;
    }
}
