package July2024;
/*
Filter the number
Oh, no! The number has been mixed up with the text. Your goal is to retrieve the number from the text, can you return the number back to its original state?

Task
Your task is to return a number from a string.

Details
You will be given a string of numbers and letters mixed up, you have to return all the numbers in that string in the order they occur.
 */

public class RetrieveNumber {
    public static void main(String[] args) {
        // Test cases
        System.out.println(filterString("a1b2c3")); // Expected: 123
        System.out.println(filterString("abc123def456")); // Expected: 123456
        System.out.println(filterString("hello123")); // Expected: 123
    }

    public static long filterString(final String value) {
        // Replace all non-numeric characters with an empty string
        String numbersOnly = value.replaceAll("\\D", "");

        // Convert the filtered string to a long
        long result = Long.parseLong(numbersOnly);

        // Return the resulting number
        return result;
    }
}
