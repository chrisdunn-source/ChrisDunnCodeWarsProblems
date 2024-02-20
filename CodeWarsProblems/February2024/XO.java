package February2024;
/*
    Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

    Examples input/output:

    XO("ooxx") => true
    XO("xooxx") => false
    XO("ooxXm") => true
    XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
    XO("zzoo") => false
 */

public class XO {
    public static void main(String[] args) {
        // Testing the method
        System.out.println(getXO("ooxx"));    // true
        System.out.println(getXO("xooxx"));   // false
        System.out.println(getXO("ooxXm"));   // true
        System.out.println(getXO("zpzpzpp")); // true
        System.out.println(getXO("zzoo"));    // false
    }
    public static boolean getXO(String str) {
        str = str.toLowerCase(); // Convert the string to lowercase for case insensitivity
        int countX = 0; // Counter for 'x'
        int countO = 0; // Counter for 'o'

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'x') {
                countX++; // Increment the 'x' counter
            } else if (c == 'o') {
                countO++; // Increment the 'o' counter
            }
        }

        return countX == countO; // Check if the counts are equal and return the result
    }
}

/*
        This code is for a program that checks if a given string contains the same number of 'x's and 'o's. Here's how it works:

        We have a method called getXO that takes a string (str) as input and returns a boolean (either true or false).
        Inside the getXO method, we convert the input string to lowercase using str.toLowerCase(). This is done so that we can ignore the case of the letters when counting 'x's and 'o's. For example, 'X' and 'x' will be treated as the same.
        We declare two variables: countX and countO. These variables will keep track of the number of 'x's and 'o's in the string, respectively. We start with both counters set to 0.
        Next, we use a loop to go through each character in the string. The loop starts with i set to 0 and continues until i reaches the length of the string (str.length()). For each character, we do the following:
        We store the character in a variable called c using char c = str.charAt(i).
        We check if c is equal to 'x' using c == 'x'. If it is, we increase the value of countX by 1 using countX++.
        If c is not 'x', we check if it is equal to 'o' using c == 'o'. If it is, we increase the value of countO by 1 using countO++.
        If c is neither 'x' nor 'o', we move on to the next character.
        After going through all the characters in the string, we check if countX is equal to countO. If they are equal, it means that the string has the same number of 'x's and 'o's. In this case, we return true. Otherwise, we return false.
        The main method is used to test the getXO method. We call getXO with different input strings and print the results using System.out.println.
 */
