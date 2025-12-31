public class AddLength {
    /*
    What if we need the length of the words separated by a space to be added at the end of that same word and have it returned as an array?

Example(Input --> Output)

"apple ban" --> ["apple 5", "ban 3"]
"you will win" -->["you 3", "will 4", "win 3"]
Your task is to write a function that takes a String and returns an Array/list with the length of each word added to each element .

Note: String will have at least one element; words will always be separated by a space.
     */

    public static String[] addLength(String str) {
        // Split the input string into an array of words using space as a delimiter
        String[] words = str.split(" ");

        // Create a new array to hold the result with the same length as the words array
        String[] result = new String[words.length];

        // Loop through each word in the words array
        for (int i = 0; i < words.length; i++) {
            // Get the current word
            String word = words[i];
            // Calculate the length of the current word
            int length = word.length();
            // Create the new string that includes the word and its length
            result[i] = word + " " + length;
        }

        // Return the result array
        return result;
    }

    public static void main(String[] args) {
        // Testing the addLength method with various cases
        String[] output1 = addLength("apple ban");
        String[] output2 = addLength("you will win");

        // Print the results
        for (String str : output1) {
            System.out.println(str); // Expected output: "apple 5", "ban 3"
        }

        for (String str : output2) {
            System.out.println(str); // Expected output: "you 3", "will 4", "win 3"
        }
    }
}