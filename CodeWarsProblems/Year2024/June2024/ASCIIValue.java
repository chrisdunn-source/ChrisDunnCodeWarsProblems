package June2024;
    /*
    Write a function which takes a number and returns the corresponding ASCII char for that value.

    Example:

    65 --> 'A'
    97 --> 'a'
    48 --> '0
     */
public class ASCIIValue {
    // Method to convert an integer to its corresponding ASCII character
    public static char getChar(int c) {
        return (char) c; // Casting the integer to char to get the ASCII character
    }

    // Main method for testing
    public static void main(String[] args) {
        int number1 = 65;
        char character1 = ASCIIValue.getChar(number1);
        System.out.println(character1); // Output: 'A'

        int number2 = 97;
        char character2 = ASCIIValue.getChar(number2);
        System.out.println(character2); // Output: 'a'

        int number3 = 48;
        char character3 = ASCIIValue.getChar(number3);
        System.out.println(character3); // Output: '0'
    }
}
/*
The getChar method takes an integer c as input.
Inside the method, we cast the integer c to a char type using (char) c.
The method then returns the resulting char value, which represents the corresponding ASCII character.
 */