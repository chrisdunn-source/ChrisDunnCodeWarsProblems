public class DescendingOrder {
    /*
    Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
    Examples:
    Input: 42145 Output: 54421
    Input: 145263 Output: 654321
    Input: 123456789 Output: 987654321
     */
    public static void main(String[] args) {

    }
    public static int sortDesc(final int num) {
        String numStr = Integer.toString(num); // convert the number to a string
        char[] digits = numStr.toCharArray(); // convert the string to an array of characters

        // Implement a simple sorting algorithm (e.g., bubble sort) to sort the array in descending order
        /*
        Convert the input number to a string (numStr) and then to an array of characters (digits).
        Initialize a loop to iterate over the array of digits. The outer loop (i) runs from 0 to n - 1, where n is the length of the array.
        Inside the outer loop, initialize an inner loop (j) that runs from 0 to n - i - 1. This inner loop is used to compare adjacent elements and swap them if necessary.
        Compare digits[j] with digits[j + 1]. If digits[j] is less than digits[j + 1], swap the two elements.
        Repeat steps 4 for each pair of adjacent elements in the array until the end of the inner loop.
        After completing the inner loop, the largest digit in the unsorted portion of the array will "bubble" up to the correct position at the end of the array.
        Repeat steps 2 to 6 until the outer loop completes, ensuring that the entire array is sorted in descending order.
        Convert the sorted array of digits (digits) back to a string (sortedStr).
        Parse the string back to an integer using Integer.parseInt(sortedStr) and return the result.
         */
        int n = digits.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (digits[j] < digits[j + 1]) {
                    char temp = digits[j];
                    digits[j] = digits[j + 1];
                    digits[j + 1] = temp;
                }
            }
        }

        String sortedStr = new String(digits); // convert the sorted array back to a string
        return Integer.parseInt(sortedStr); // parse the string back to an integer and return the result
    }
}
