package May2024;

public class Correct {
    /*
    Character recognition software is widely used to digitise printed texts. Thus the texts can be edited, searched and stored on a computer.

    When documents (especially pretty old ones written with a typewriter), are digitised character recognition softwares often make mistakes.

    Your task is correct the errors in the digitised text. You only have to handle the following mistakes:

    S is misinterpreted as 5
    O is misinterpreted as 0
    I is misinterpreted as 1
    The test cases contain numbers only by mistake.
     */

    // Main method to run the program
    public static void main(String[] args) {
        // Example digitized text
        String digitizedText = "H3ll0 w0rld!";
        // Correct the digitized text
        String correctedText = correct(digitizedText);
        // Print the corrected text to the console
        System.out.println("Corrected text: " + correctedText);
    }
    // Method to correct the errors in the digitized text
    public static String correct(String string) {
        // Replace all occurrences of "5" with "S"
        string = string.replace("5", "S");
        // Replace all occurrences of "0" with "O"
        string = string.replace("0", "O");
        // Replace all occurrences of "1" with "I"
        string = string.replace("1", "I");
        // Return the corrected string
        return string;
    }


}
