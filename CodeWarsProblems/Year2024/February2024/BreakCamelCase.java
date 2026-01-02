package February2024;

public class BreakCamelCase {
    public static void main(String[] args) {
        String input1 = "camelCasing";
        System.out.println(camelCase(input1));  // Output: camel Casing

        String input2 = "identifier";
        System.out.println(camelCase(input2));  // Output: identifier

        String input3 = "";
        System.out.println(camelCase(input3));  // Output:
    }
    public static String camelCase(String input) {
        StringBuilder result = new StringBuilder(); // Create a StringBuilder to store the result

        for (int i = 0; i < input.length(); i++) { // Iterate over each character in the input string
            char currentChar = input.charAt(i); // Get the current character

            if (Character.isUpperCase(currentChar)) { // Check if the character is uppercase
                result.append(" "); // If it is, append a space to the result string
            }

            result.append(currentChar); // Append the current character to the result string
        }

        return result.toString(); // Convert the StringBuilder to a String and return the result
    }
}
