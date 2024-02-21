package February2024;
/*
    Write a function to split a string and convert it into an array of words.

    Examples (Input ==> Output):
    "Robin Singh" ==> ["Robin", "Singh"]

    "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
 */
public class StringToArray {
    public static void main(String[] args) {
        // Example usage of the stringToArray function

        // The input string is "Robin Singh"
        String s = "Robin Singh";

        // Call the stringToArray function and pass the input string as an argument
        // The result is an array of words
        String[] result = stringToArray(s);

        // Print each word in the array
        // A loop is used to iterate over each word in the array
        // For each word, it is printed to the console
        for (String word : result) {
            System.out.println(word);
        }
    }
    // This function takes a string as input and splits it into an array of words
    public static String[] stringToArray(String s) {
        // Split the string by space
        // The split method divides the string into multiple parts based on the provided delimiter, which is a space (" ")
        // The result is an array of words
        String[] words = s.split(" ");

        // Return the array of words
        return words;
    }
}
/*
    We define a function called stringToArray with a parameter s of type String. This function will convert the given string into an array of words.

    Inside the stringToArray function, we use the split method to split the string into multiple parts based on the provided delimiter. In this case, the delimiter is a space (" "). The result of the split method is an array of words.

    We store the result of the split method in a variable called words.

    Finally, we return the words array, which contains the individual words from the input string.
 */