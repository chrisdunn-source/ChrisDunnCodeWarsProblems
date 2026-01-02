public class StringAccumulation {
    /*
    This time no story, no theory. The examples below show you how to write function accum:
    Examples:
    accum("abcd") -> "A-Bb-Ccc-Dddd"
    accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
    accum("cwAt") -> "C-Ww-Aaa-Tttt"
    The parameter of accum is a string which includes only letters from a..z and A..Z.
     */
    public static void main(String[] args) {
        System.out.println(accum("abcd"));      // Output: A-Bb-Ccc-Dddd
        System.out.println(accum("RqaEzty"));   // Output: R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy
        System.out.println(accum("cwAt"));      // Output: C-Ww-Aaa-Tttt
    }
    public static String accum(String s) {
        // Initialize a StringBuilder to store the resulting string
        StringBuilder result = new StringBuilder();

        // Convert the input string to lowercase
        s = s.toLowerCase();

        // Iterate over each character in the input string
        for (int i = 0; i < s.length(); i++) {
            // Retrieve the character at the current index
            char c = s.charAt(i);

            // Append the uppercase version of the character to the result
            result.append(Character.toUpperCase(c));

            // Append the lowercase version of the character i times, where i represents the current index
            for (int j = 0; j < i; j++) {
                result.append(c);
            }

            // If the current character is not the last character in the input string, append a hyphen ("-")
            // to separate the characters
            if (i != s.length() - 1) {
                result.append("-");
            }
        }

        // Return the final string by converting the StringBuilder to a String using the toString method
        return result.toString();
    }
}
