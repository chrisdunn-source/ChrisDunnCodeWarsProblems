package May2024;
    /*
    Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.

    Examples
    replace("Hi!") === "H!!"
    replace("!Hi! Hi!") === "!H!! H!!"
    replace("aeiou") === "!!!!!"
    replace("ABCDE") === "!BCD!"
     */
public class ReplaceVowels {
    public static String replace(final String s) {
        return s.replaceAll("[aeiouAEIOU]", "!"); // Replace vowels with exclamation mark
    }

    public static void main(String[] args) {
        // Test cases
        String sentence1 = "Hello, World!";
        String result1 = replace(sentence1);
        System.out.println(result1); // Output: H!ll!, W!rld!

        String sentence2 = "Java is awesome!";
        String result2 = replace(sentence2);
        System.out.println(result2); // Output: J!v! !s !w!s!m!

        String sentence3 = "Coding is fun!";
        String result3 = replace(sentence3);
        System.out.println(result3); // Output: C*d!ng !s f!n!
    }
}
