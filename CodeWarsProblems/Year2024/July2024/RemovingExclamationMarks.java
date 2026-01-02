package July2024;

public class RemovingExclamationMarks {
    public static String remove(String s, int n) {
        StringBuilder result = new StringBuilder(); // A StringBuilder to build the modified string

        for (char c : s.toCharArray()) { // Loop through each character in the string
            if (c == '!' && n > 0) { // If the character is an exclamation mark and we still have more to remove
                n--; // Decrement the count of remaining exclamation marks to remove
            } else {
                result.append(c); // Append the character to the result string
            }
        }

        return result.toString(); // Convert the StringBuilder to a String and return it
    }

    public static void main(String[] args) {
        // Test cases
        String test1 = remove("Hi!", 1);
        System.out.println(test1); // Expected: "Hi"

        String test2 = remove("Hi!", 100);
        System.out.println(test2); // Expected: "Hi"

        String test3 = remove("Hi!!!", 1);
        System.out.println(test3); // Expected: "Hi!!"

        String test4 = remove("Hi!!!", 100);
        System.out.println(test4); // Expected: "Hi"

        String test5 = remove("!Hi", 1);
        System.out.println(test5); // Expected: "Hi"

        String test6 = remove("!Hi!", 1);
        System.out.println(test6); // Expected: "Hi!"

        String test7 = remove("!Hi!", 100);
        System.out.println(test7); // Expected: "Hi"

        String test8 = remove("!!!Hi !!hi!!! !hi", 1);
        System.out.println(test8); // Expected: "!!Hi !!hi!!! !hi"

        String test9 = remove("!!!Hi !!hi!!! !hi", 3);
        System.out.println(test9); // Expected: "Hi !!hi!!! !hi"

        String test10 = remove("!!!Hi !!hi!!! !hi", 5);
        System.out.println(test10); // Expected: "Hi hi!!! !hi"

        String test11 = remove("!!!Hi !!hi!!! !hi", 100);
        System.out.println(test11); // Expected: "Hi hi hi"
    }
}
