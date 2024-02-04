public class RemoveExclamationMarks {
    public static void main(String[] args) {
        // Test case 1: String with exclamation marks
        String s1 = "Hello! World!";
        String result1 = removeExclamationMarks(s1);
        System.out.println(result1); // Output: "Hello World"

        // Test case 2: String without exclamation marks
        String s2 = "This is a sentence";
        String result2 = removeExclamationMarks(s2);
        System.out.println(result2); // Output: "This is a sentence"

        // Test case 3: String with multiple exclamation marks
        String s3 = "Wow!!! So many exclamation marks!!!";
        String result3 = removeExclamationMarks(s3);
        System.out.println(result3); // Output: "Wow So many exclamation marks"

        // Test case 4: Empty string
        String s4 = "";
        String result4 = removeExclamationMarks(s4);
        System.out.println(result4); // Output: ""

    }
    public static String removeExclamationMarks(String s) {
        // The replace method is used to replace all occurrences of a specified character or sequence of characters.
        // In this case, we're replacing all exclamation marks ("!") with an empty string, effectively removing them.
        return s.replace("!", "");
    }
}
