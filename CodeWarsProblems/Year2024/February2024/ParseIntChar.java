package February2024;

public class ParseIntChar {
    /*
    You ask a small girl,"How old are you?" She always says, "x years old", where x is a random number between 0 and 9.

    Write a program that returns the girl's age (0-9) as an integer.

    Assume the test input string is always a valid string. For example, the test input may be "1 year old" or "5 years old". The first character in the string is always a number.
     */
    public static void main(String[] args) {
        // Test cases
        String input1 = "1 year old";
        int age1 = howOld(input1);
        System.out.println("The girl's age is: " + age1);

        String input2 = "5 years old";
        int age2 = howOld(input2);
        System.out.println("The girl's age is: " + age2);

        String input3 = "9 years old";
        int age3 = howOld(input3);
        System.out.println("The girl's age is: " + age3);
    }
    public static int howOld(final String herOld) {
        // Extract the first character from the input string
        char ageChar = herOld.charAt(0);

        // Convert the character to an integer and return it
        int age = Character.getNumericValue(ageChar);
        return age;
    }
}
