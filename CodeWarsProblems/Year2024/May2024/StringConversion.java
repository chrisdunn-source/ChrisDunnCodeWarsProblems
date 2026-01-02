package May2024;
    /*
    In this Kata, you will be given a string that may have mixed uppercase and lowercase letters and your task is to convert that string to either lowercase only or uppercase only based on:

    make as few changes as possible.
    if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase.
    For example:

    solve("coDe") = "code". Lowercase characters > uppercase. Change only the "D" to lowercase.
    solve("CODe") = "CODE". Uppercase characters > lowecase. Change only the "e" to uppercase.
    solve("coDE") = "code". Upper == lowercase. Change all to lowercase.
     */
public class StringConversion {
    public static void main(String[] args) {
        // Test cases
        System.out.println(solve("coDe")); // Expected output: "code"
        System.out.println(solve("CODe")); // Expected output: "CODE"
        System.out.println(solve("coDE")); // Expected output: "code"
    }

    public static String solve(final String str) {
        int uppercaseCount = 0;
        int lowercaseCount = 0;

        // Step 1: Count the number of uppercase and lowercase letters
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) { // Check if the character is uppercase
                uppercaseCount++; // Increment the uppercase count
            } else if (Character.isLowerCase(c)) { // Check if the character is lowercase
                lowercaseCount++; // Increment the lowercase count
            }
        }

        // Step 2: Compare counts and perform conversion
        if (uppercaseCount > lowercaseCount) { // Check if there are more uppercase letters
            // Uppercase characters > lowercase. Change all to uppercase.
            return str.toUpperCase(); // Convert the string to uppercase
        } else {
            // Lowercase characters >= uppercase. Change all to lowercase.
            return str.toLowerCase(); // Convert the string to lowercase
        }
    }
}
