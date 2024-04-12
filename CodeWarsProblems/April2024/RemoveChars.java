/*
It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string. 
You're given one parameter, the original string. 
You don't have to worry about strings with less than two characters.

*/

 public static void main(String[] args) {
        // Test cases
        String str1 = "Hello";
        String result1 = remove(str1);
        System.out.println("Original: " + str1);
        System.out.println("After removal: " + result1);

        String str2 = "Java";
        String result2 = remove(str2);
        System.out.println("Original: " + str2);
        System.out.println("After removal: " + result2);
    }

public class RemoveChars {
    public static String remove(String str) {
        // Use the substring method to remove the first and last characters from the string
        // The first parameter is the starting index (inclusive), which is 1 to skip the first character
        // The second parameter is the ending index (exclusive), which is str.length() - 1 to exclude the last character
        return str.substring(1, str.length() - 1);
    }
}
