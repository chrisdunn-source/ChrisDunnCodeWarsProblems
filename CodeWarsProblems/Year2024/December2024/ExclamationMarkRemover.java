public class ExclamationMarkRemover {

    public static String removeExclamationMarks(String s) {
        // Remove all exclamation marks from the sentence
        String result = s.replaceAll("!", "");

        // Add an exclamation mark at the end if it's not already there
        if (!result.endsWith("!")) {
            result += "!";
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(removeExclamationMarks("Hi!"));     // Output: Hi!
        System.out.println(removeExclamationMarks("Hi!!!"));   // Output: Hi!
        System.out.println(removeExclamationMarks("!Hi"));     // Output: Hi!
        System.out.println(removeExclamationMarks("!Hi!"));    // Output: Hi!
        System.out.println(removeExclamationMarks("Hi! Hi!")); // Output: Hi Hi!
        System.out.println(removeExclamationMarks("Hi"));      // Output: Hi!
    }
}
