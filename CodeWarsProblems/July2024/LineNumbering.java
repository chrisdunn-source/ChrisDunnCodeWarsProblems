package July2024;
import java.util.ArrayList;
import java.util.List;
/*
Write a function which takes a list of strings and returns each line prepended by the correct number.

The numbering starts at 1. The format is n: string. Notice the colon and space in between.

Examples: (Input --> Output)

[] --> []
["a", "b", "c"] --> ["1: a", "2: b", "3: c"]
 */

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        // Create a new list to store the numbered lines
        List<String> numberedLines = new ArrayList<>();

        // Iterate over the input list of lines
        for (int i = 0; i < lines.size(); i++) {
            // Add the line number and line content to the numberedLines list
            numberedLines.add((i + 1) + ": " + lines.get(i));
        }

        // Return the list of numbered lines
        return numberedLines;
    }

    public static void main(String[] args) {
        // Test cases
        List<String> test1 = new ArrayList<>();
        List<String> test2 = List.of("a", "b", "c", "d");

        System.out.println("Test Case 1:");
        System.out.println(number(test1)); // Empty list should return an empty list

        System.out.println("\nTest Case 2:");
        List<String> numberedTest2 = number(test2);
        for (String line : numberedTest2) {
            System.out.println(line);
        }
    }
}