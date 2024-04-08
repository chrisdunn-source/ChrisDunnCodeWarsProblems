package April2024;
    /*
    We need a function that can transform a string into a number. What ways of achieving this do you know?

    Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.
     */
public class StringToNumber {
    // Function to convert a string into a number
    public static int stringToNumber(String str) {
        // Convert str into a number using Integer.parseInt()
        int number = Integer.parseInt(str);
        return number;
    }
    // Main method for testing
    public static void main(String[] args) {
        // Test cases
        String str1 = "123";
        int number1 = stringToNumber(str1);
        System.out.println(number1); // Output: 123

        String str2 = "-456";
        int number2 = stringToNumber(str2);
        System.out.println(number2); // Output: -456

        String str3 = "0";
        int number3 = stringToNumber(str3);
        System.out.println(number3); // Output: 0

        String str4 = "987654321";
        int number4 = stringToNumber(str4);
        System.out.println(number4); // Output: 987654321
    }
}
    /*
    In the main method, I have provided four test cases to demonstrate the usage of the stringToNumber() method. Each test case consists of a string representation of a number, which is then passed to the stringToNumber() method. The resulting integer value is then printed to the console.
     */