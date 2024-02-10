public class MiddleCharacterExtraction {
    /*
    You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.

    #Examples:
    MiddleCharacterExtraction.getMiddle("test") should return "es"
    MiddleCharacterExtraction.getMiddle("testing") should return "t"
    MiddleCharacterExtraction.getMiddle("middle") should return "dd"
    MiddleCharacterExtraction.getMiddle("A") should return "A"
    #Input
    A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000 in some test cases due to an error in the test cases). You do not need to test for this. This is only here to tell you that you do not need to worry about your solution timing out.

    #Output

    The middle character(s) of the word represented as a string.
     */
    public static void main(String[] args) {
        System.out.println(MiddleCharacterExtraction.getMiddle("test"));  // Output: "es"
        System.out.println(MiddleCharacterExtraction.getMiddle("testing"));  // Output: "t"
        System.out.println(MiddleCharacterExtraction.getMiddle("middle"));  // Output: "dd"
        System.out.println(MiddleCharacterExtraction.getMiddle("A"));  // Output: "A"

    }
    public static String getMiddle(String word) {
        int length = word.length(); // Get the length of the word
        if (length % 2 == 0) { // Check if the length is even
            // If the length is even, return the middle two characters
            // Use the substring method to extract the characters
            // The starting index is length / 2 - 1, and the ending index is length / 2 + 1 (exclusive)
            // For example, if the word is "test" and length is 4, the substring will be from index 1 to index 3 (exclusive), which is "es"
            return word.substring(length / 2 - 1, length / 2 + 1);
        } else {
            // If the length is odd, return the middle character
            // Use the substring method to extract a single character
            // The starting index is length / 2, and the ending index is length / 2 + 1 (exclusive)
            // For example, if the word is "testing" and length is 7, the substring will be from index 3 to index 4 (exclusive), which is "t"
            return word.substring(length / 2, length / 2 + 1);
        }
    }
}
