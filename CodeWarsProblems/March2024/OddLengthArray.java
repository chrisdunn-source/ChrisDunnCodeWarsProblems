package March2024;
    /*
    You are given an odd-length array of integers, in which all of them are the same, except for one single number.

    Complete the method which accepts such an array, and returns that single different number.

    The input array will always be valid! (odd-length >= 3)

    Examples
    [1, 1, 2] ==> 2
    [17, 17, 3, 17, 17, 17, 17] ==> 3
     */
public class OddLengthArray {
    public static void main(String[] args) {
        // Test cases
        int[] numbers1 = {1, 1, 2};
        int[] numbers2 = {17, 17, 3, 17, 17, 17, 17};

        System.out.println(stray(numbers1)); // Expected output: 2
        System.out.println(stray(numbers2)); // Expected output: 3
    }
    static int stray(int[] numbers) {
        // Iterate through each element in the array
        for (int i = 0; i < numbers.length; i++) {
            boolean isUnique = true; // Assume the current element is unique initially

            // Compare the current element with all other elements in the array
            for (int j = 0; j < numbers.length; j++) {
                // If we find another element that is equal to the current element and not at the same index,
                // then the current element is not unique
                if (i != j && numbers[i] == numbers[j]) {
                    isUnique = false; // Set isUnique to false
                    break; // Exit the inner loop
                }
            }

            // If the current element is still marked as unique, it means we have found the unique number
            if (isUnique) {
                return numbers[i]; // Return the unique number
            }
        }

        return -1; // Default return value if no unique number is found
    }
}
    /*
    We use two nested loops to compare each element with all the other elements in the array.
    For each element, we set a boolean variable isUnique to true initially.
    If we find another element that is equal to the current element, we set isUnique to false and break out of the inner loop.
    After the inner loop, we check if isUnique is still true. If it is, it means we have found the unique number, and we return it immediately.
    If no unique number is found after the loop, we return -1 as the default return value.
     */