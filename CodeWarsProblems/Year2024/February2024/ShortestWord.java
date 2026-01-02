public class ShortestWord {
    /*
    Simple, given a string of words, return the length of the shortest word(s).

    String will never be empty and you do not need to account for different data types.
     */
    public static void main(String[] args) {
        // Test Case 1: String with multiple words
        String input1 = "This is a sample string";
        int shortestLength1 = findShort(input1);
        System.out.println("Test Case 1: " + shortestLength1); // Output: 1

        // Test Case 2: String with multiple words
        String input2 = "The quick brown fox jumps";
        int shortestLength2 = findShort(input2);
        System.out.println("Test Case 2: " + shortestLength2); // Output: 3

        // Test Case 3: String with multiple words
        String input3 = "Java programming is fun";
        int shortestLength3 = findShort(input3);
        System.out.println("Test Case 3: " + shortestLength3); // Output: 2

        // Test Case 4: Single-word string
        String input4 = "Hello";
        int shortestLength4 = findShort(input4);
        System.out.println("Test Case 4: " + shortestLength4); // Output: 5

        // Test Case 5: String with multiple words
        String input5 = "One two three four five";
        int shortestLength5 = findShort(input5);
        System.out.println("Test Case 5: " + shortestLength5); // Output: 3
    }
    public static int findShort(String s) {
        String[] words = s.split("\\s+"); // Split the string into an array of words

        int shortestLength = Integer.MAX_VALUE; // Initialize shortestLength to a large value

        for (String word : words) {
            int length = word.length(); // Get the length of the current word
            if (length < shortestLength) {
                shortestLength = length; // Update shortestLength if the current word is shorter
            }
        }

        return shortestLength; // Return the length of the shortest word(s)
    }
}
/*
The split() method in Java is defined in the String class. It takes a regular expression as its argument and returns an array of substrings.

The regular expression \\s+ is used to split the string s at one or more whitespace characters. Let's break it down further:

\\: In Java, a single backslash (\) is an escape character in string literals. To include a literal backslash in the regular expression, we need to escape it with another backslash (\\).
\s: \s is a special character class in regular expressions that represents whitespace characters. It matches spaces, tabs, newlines, and other whitespace characters.
+: + is a quantifier in regular expressions that specifies "one or more occurrences" of the preceding pattern. In this case, it applies to the \s character class, so \\s+ matches one or more whitespace characters.
By using \\s+ as the delimiter in s.split("\\s+"), the string s is split into substrings wherever one or more whitespace characters occur. Multiple consecutive whitespace characters are treated as a single delimiter, ensuring that the resulting array does not contain empty strings.

After splitting the string, the resulting substrings are stored in an array. Each element in the array represents a word in the original string. For example, if the input string is "This is a sample string", the resulting array from s.split("\\s+") will be ["This", "is", "a", "sample", "string"].

The resulting array can be used for further processing, such as finding the length of each word or performing operations on individual words.
 */
