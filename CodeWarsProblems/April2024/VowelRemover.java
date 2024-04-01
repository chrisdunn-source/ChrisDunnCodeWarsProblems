package April2024;
    /*
    Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.

    Examples
    "hello"     -->  "hll"
    "codewars"  -->  "cdwrs"
    "goodbye"   -->  "gdby"
    "HELLO"     -->  "HELLO"
    don't worry about uppercase vowels
    y is not considered a vowel for this kata
     */
public class VowelRemover {
    public static void main(String[] args) {
        // Test case 1: Remove lowercase vowels from "hello"
        String result1 = VowelRemover.shortcut("hello");
        System.out.println(result1);  // Output: hll

        // Test case 2: Remove lowercase vowels from "codewars"
        String result2 = VowelRemover.shortcut("codewars");
        System.out.println(result2);  // Output: cdwrs

        // Test case 3: Remove lowercase vowels from "goodbye"
        String result3 = VowelRemover.shortcut("goodbye");
        System.out.println(result3);  // Output: gdby

        // Test case 4: Remove lowercase vowels from "HELLO"
        String result4 = VowelRemover.shortcut("HELLO");
        System.out.println(result4);  // Output: HELLO
    }

    public static String shortcut(String input) {
        // The replaceAll method is used to replace all occurrences of a given regular expression
        // with the specified replacement.
        // In this case, the regular expression [aeiou] matches any lowercase vowel (a, e, i, o, u).
        // The replacement is an empty string, effectively removing the matched vowels.
        return input.replaceAll("[aeiou]", "");
    }
}
