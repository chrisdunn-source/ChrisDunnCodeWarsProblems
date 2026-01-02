class FirstNonConsecutive {
/*
Your task is to find the first element of an array that is not consecutive.

By not consecutive we mean not exactly 1 larger than the previous element of the array.

E.g. If we have an array [1,2,3,4,6,7,8] then 1 then 2 then 3 then 4 are all consecutive but 6 is not, so that's the first non-consecutive number.

If the whole array is consecutive then return null2.

The array will always have at least 2 elements1 and all elements will be numbers. The numbers will also all be unique and in ascending order. The numbers could be positive or negative and the first non-consecutive could be either too!
 */
    public static void main(String[] args) {
        // Sample array for testing
        int[] array = {1, 2, 3, 4, 6, 7, 8};

        // Call the find method and store the result
        Integer result = find(array);

        // Print the result
        System.out.println("The first non-consecutive number is: " + result);
    }

    static Integer find(final int[] array) {
        // Iterate over the array starting from index 1
        for (int i = 1; i < array.length; i++) {
            // Check if the current element is not consecutive
            if (array[i] != array[i - 1] + 1) {
                return array[i]; // Return the first non-consecutive number
            }
        }
        return null; // Return null if the array is consecutive
    }
}
 /*
 class FirstNonConsecutive { - This line starts the declaration of the FirstNonConsecutive class.

public static void main(String[] args) { - This line declares the main method, which serves as the entry point of the program.

int[] array = {1, 2, 3, 4, 6, 7, 8}; - This line declares an array named array and initializes it with the sample values for testing purposes. Feel free to modify this array according to your needs.

Integer result = find(array); - This line calls the find method with the array as an argument and stores the result in the result variable of type Integer.

System.out.println("The first non-consecutive number is: " + result); - This line prints the result to the console. It displays the first non-consecutive number if found, or null if the array is consecutive.

static Integer find(final int[] array) { - This line declares the find method, which takes an array of integers (int[]) as a parameter and returns an Integer representing the first non-consecutive number or null.

for (int i = 1; i < array.length; i++) { - This line starts a for loop that iterates over the array starting from index 1. The loop continues as long as i is less than the length of the array.

if (array[i] != array[i - 1] + 1) { - This line checks if the current element (array[i]) is not equal to the previous element (array[i - 1]) plus 1. If it's not, we have found the first non-consecutive number.

return array[i]; - This line returns the first non-consecutive number found.

return null; - This line returns null if the loop completes without finding any non-consecutive number, indicating that the array is consecutive.
  */