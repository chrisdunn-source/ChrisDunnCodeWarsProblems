package March2024;
    /*
    Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

    Examples
    "This is an example!" ==> "sihT si na !elpmaxe"
    "double  spaces"      ==> "elbuod  secaps"

     */

public class ReverseWords {

    public static void main(String[] args) {
        // Test cases
        String reversed1 = reverseWords("This is an example!");
        System.out.println(reversed1);  // Output: "sihT si na !elpmaxe"

        String reversed2 = reverseWords("double  spaces");
        System.out.println(reversed2);  // Output: "elbuod  secaps"

        String reversed3 = reverseWords("Hello World");
        System.out.println(reversed3);  // Output: "olleH dlroW"

        String reversed4 = reverseWords("Solution    Test");
        System.out.println(reversed4);  // Output: "noituloS    tseT"

        String reversed5 = reverseWords("multipleSentences   ");
        System.out.println(reversed5);  // Output: "selitnetneSelpotelpmoc   "

        String reversed6 = reverseWords("   allSpaces   ");
        System.out.println(reversed6);  // Output: "   secapSlla   "
    }
    public static String reverseWords(final String original) {
        // Split the original string into an array of words.
        String[] words = original.split(" ", -1);

        // Create a StringBuilder to store the reversed words.
        StringBuilder reversed = new StringBuilder();

        // Iterate through each word in the array.
        for (int i = 0; i < words.length; i++) {
            // Create a StringBuilder for the current word.
            StringBuilder word = new StringBuilder(words[i]);

            // Reverse the characters in the word.
            word.reverse();

            // Append the reversed word to the final string.
            reversed.append(word);

            // If the current word is not the last word, append a space.
            if (i != words.length - 1) {
                reversed.append(" ");
            }
        }

        // Convert the StringBuilder to a string and return it.
        return reversed.toString();
    }
}
