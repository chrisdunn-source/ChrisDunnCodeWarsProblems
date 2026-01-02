package August2024;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Remove the duplicates from a list of integers, keeping the last ( rightmost ) occurrence of each element.

Example:
For input: [3, 4, 4, 3, 6, 3]

remove the 3 at index 0
remove the 4 at index 1
remove the 3 at index 3
Expected output: [4, 6, 3]
 */

public class RemoveDuplicates {
    public static int[] solve(int[] arr) {
        // Create a HashMap to store the last index of each element in the input array
        Map<Integer, Integer> lastIndexMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Populate the lastIndexMap with the last index of each element
        for (int i = 0; i < arr.length; i++) {
            lastIndexMap.put(arr[i], i);
        }

        // Iterate over the array and add elements to the result list if their index matches the last index
        for (int i = 0; i < arr.length; i++) {
            if (lastIndexMap.get(arr[i]) == i) {
                result.add(arr[i]);
            }
        }

        // Convert the List to an int array and return it
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] input = {3, 4, 4, 3, 6, 3};
        int[] output = solve(input);

        // Print the output array
        for (int num : output) {
            System.out.print(num + " ");
        }
    }
}