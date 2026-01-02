package March2024;
    /*
    Define String.prototype.toAlternatingCase (or a similar function/method such as to_alternating_case/toAlternatingCase/ToAlternatingCase in your selected language; see the initial solution for details) such that each lowercase letter becomes uppercase and each uppercase letter becomes lowercase. For example:

    StringUtils.toAlternativeString("hello world") == "HELLO WORLD"
    StringUtils.toAlternativeString("HELLO WORLD") == "hello world"
    StringUtils.toAlternativeString("hello WORLD") == "HELLO world"
    StringUtils.toAlternativeString("HeLLo WoRLD") == "hEllO wOrld"
    StringUtils.toAlternativeString("12345") == "12345" // Non-alphabetical characters are unaffected
    StringUtils.toAlternativeString("1a2b3c4d5e") == "1A2B3C4D5E"
    StringUtils.toAlternativeString("StringUtils.toAlternatingCase") == "sTRINGuTILS.TOaLTERNATINGcASE"
     */

public class StringUtils {
    public static void main(String[] args) {
        // Test cases
        String input1 = "hello world";
        String result1 = toAlternatingCase(input1);
        System.out.println(result1); // Output: "HELLO WORLD"

        String input2 = "HELLO WORLD";
        String result2 = toAlternatingCase(input2);
        System.out.println(result2); // Output: "hello world"

        String input3 = "hello WORLD";
        String result3 = toAlternatingCase(input3);
        System.out.println(result3); // Output: "HELLO world"

        String input4 = "HeLLo WoRLD";
        String result4 = toAlternatingCase(input4);
        System.out.println(result4); // Output: "hEllO wOrld"

        String input5 = "12345";
        String result5 = toAlternatingCase(input5);
        System.out.println(result5); // Output: "12345"

        String input6 = "1a2b3c4d5e";
        String result6 = toAlternatingCase(input6);
        System.out.println(result6); // Output: "1A2B3C4D5E"

        String input7 = "StringUtils.toAlternatingCase";
        String result7 = toAlternatingCase(input7);
        System.out.println(result7); // Output: "sTRINGuTILS.TOaLTERNATINGcASE"
    }

    public static String toAlternatingCase(String input) {
        // Convert the input string to a character array
        char[] charArray = input.toCharArray();

        // Iterate over each character in the array
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            // Check if the character is lowercase
            if (Character.isLowerCase(c)) {
                // Convert the lowercase character to uppercase
                charArray[i] = Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                // Convert the uppercase character to lowercase
                charArray[i] = Character.toLowerCase(c);
            }
        }

        // Create a new string from the modified character array
        return new String(charArray);
    }
}
