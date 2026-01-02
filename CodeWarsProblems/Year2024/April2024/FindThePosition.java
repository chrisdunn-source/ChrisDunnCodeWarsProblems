package April2024;

public class FindThePosition {
    /*
        When provided with a letter, return its position in the alphabet.

    Input :: "a"

    Ouput :: "Position of alphabet: 1"
     */
    public static void main(String[] args) {
        // Test the position() method by passing the letter 'a'
        char letter = 'a';
        String result = position(letter);

        // Print the result to the console
        System.out.println(result);
    }
    public static String position(char alphabet) {
        // Convert the letter to lowercase to handle both uppercase and lowercase letters
        alphabet = Character.toLowerCase(alphabet);

        // Calculate the position by subtracting the Unicode value of 'a' from the Unicode value of the letter
        int position = alphabet - 'a' + 1;

        // Return the position as a formatted String
        return "Position of alphabet: " + position;
    }

}
