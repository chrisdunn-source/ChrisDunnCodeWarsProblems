package February2024;

public class RemoveSpaces {

    public static void main(String[] args) {
        // Example usage
        String string1 = "8 j 8   mBliB8g  imjB8B8  jl  B";
        String result1 = removeSpaces(string1);
        System.out.println(result1);  // Output: "8j8mBliB8gimjB8B8jlB"

        String string2 = "8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd";
        String result2 = removeSpaces(string2);
        System.out.println(result2);  // Output: "88Bifk8hB8BB8BBBB888chl8BhBfd"

        String string3 = "8aaaaa dddd r     ";
        String result3 = removeSpaces(string3);
        System.out.println(result3);  // Output: "8aaaaaddddr"
    }
    public static String removeSpaces(String str) {
        // Use the replaceAll() method with a regular expression to remove spaces
        String result = str.replaceAll("\\s", "");

        // Return the resulting string with spaces removed
        return result;
    }
}
/*
Explanation
The removeSpaces() method takes a string (str) as input and returns the modified string with spaces removed.
Inside the removeSpaces() method, we use the replaceAll() method with a regular expression (\\s) to replace all occurrences of whitespace characters with an empty string.
The regular expression \\s matches any whitespace character, including spaces, tabs, and line breaks.
The replaceAll() method replaces all occurrences of the matched pattern in the string.
The resulting string with spaces removed is stored in the result variable.
Finally, the result string is returned as the output of the removeSpaces() method.
In the main() method, we demonstrate the usage of the removeSpaces() method with the provided examples.
We pass each example string to the removeSpaces() method and store the returned result in a variable (result1, result2, result3).
We then print the results to the console using System.out.println().
 */