package July2024;

public class PangramChecker {
    public static void main(String[] args) {
        // Create an instance of the PangramChecker class
        PangramChecker pangramChecker = new PangramChecker();

        // Test the check method with different sentences
        String sentence1 = "The quick brown fox jumps over the lazy dog";
        System.out.println(sentence1 + " is a pangram: " + pangramChecker.check(sentence1));

        String sentence2 = "Pack my box with five dozen liquor jugs";
        System.out.println(sentence2 + " is a pangram: " + pangramChecker.check(sentence2));

        String sentence3 = "Hello, world!";
        System.out.println(sentence3 + " is a pangram: " + pangramChecker.check(sentence3));
    }

    /**
     * Checks whether the given sentence is a pangram.
     *
     * @param sentence the sentence to be checked
     * @return true if the sentence is a pangram, false otherwise
     */
    public boolean check(String sentence) {
        // Convert the sentence to lowercase and remove non-alphabetic characters
        String modifiedSentence = sentence.toLowerCase().replaceAll("[^a-z]", "");

        // Create a boolean array to track the presence of each letter in the modified sentence
        boolean[] lettersPresent = new boolean[26];

        // Iterate over the modified sentence and mark the presence of each letter
        for (int i = 0; i < modifiedSentence.length(); i++) {
            char c = modifiedSentence.charAt(i);
            lettersPresent[c - 'a'] = true;
        }

        // Check if all letters are present in the sentence
        for (boolean letterPresent : lettersPresent) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }
}
