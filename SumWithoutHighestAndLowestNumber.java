public class SumWithoutHighestAndLowestNumber {
    /*
    Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
    The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value
    Mind the input validation.
    Example
    { 6, 2, 1, 8, 10 } => 16
    { 1, 1, 11, 2, 3 } => 6
    Input validation
    If an empty value ( null, None, Nothing etc. ) is given instead of an array, or the given array is an empty list or a list with only 1 element, return 0.
     */
    public static void main(String[] args) {
        // Test cases
        int[] numbers1 = {6, 2, 1, 8, 10};  // Highest: 10, Lowest: 1, Sum: 27, Excluding: 10 + 1 = 11
        System.out.println(sum(numbers1));  // Output: 16

        int[] numbers2 = {1, 1, 11, 2, 3};  // Highest: 11, Lowest: 1, Sum: 18, Excluding: 11 + 1 = 12
        System.out.println(sum(numbers2));  // Output: 6

        int[] numbers3 = {1, 2};  // Length <= 2, so output should be 0
        System.out.println(sum(numbers3));  // Output: 0

        int[] numbers4 = {};  // Empty array, so output should be 0
        System.out.println(sum(numbers4));  // Output: 0

        int[] numbers5 = {5};  // Length <= 2, so output should be 0
        System.out.println(sum(numbers5));  // Output: 0

        int[] numbers6 = null;  // Null array, so output should be 0
        System.out.println(sum(numbers6));  // Output: 0
    }
    public static int sum(int[] numbers) {
        // Check if the input array is null or has a length of less than or equal to 2
        if (numbers == null || numbers.length <= 2) {
            return 0;
        }

        // Initialize variables for minimum, maximum, and sum
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        // Iterate over each element in the array
        for (int num : numbers) {
            // Add the current element to the sum
            sum += num;

            // Update the minimum if the current element is smaller
            if (num < min) {
                min = num;
            }

            // Update the maximum if the current element is larger
            if (num > max) {
                max = num;
            }
        }

        // Exclude the minimum and maximum from the sum and return the result
        return sum - min - max;
    }
}
