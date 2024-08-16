package August2024;
/*
Complete the method which accepts an array of integers, and returns one of the following:

"yes, ascending" - if the numbers in the array are sorted in an ascending order
"yes, descending" - if the numbers in the array are sorted in a descending order
"no" - otherwise
You can assume the array will always be valid, and there will always be one correct answer.


 */
public class SortingMethod {

    public static String isSortedAndHow(int[] array) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                descending = false;
            } else if (array[i] < array[i - 1]) {
                ascending = false;
            }
        }

        if (ascending) {
            return "yes, ascending";
        } else if (descending) {
            return "yes, descending";
        } else {
            return "no";
        }
    }

    public static void main(String[] args) {
        // Test cases
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};
        int[] array3 = {1, 3, 2, 4, 5};

        System.out.println(isSortedAndHow(array1)); // Output: "yes, ascending"
        System.out.println(isSortedAndHow(array2)); // Output: "yes, descending"
        System.out.println(isSortedAndHow(array3)); // Output: "no"
    }

}
