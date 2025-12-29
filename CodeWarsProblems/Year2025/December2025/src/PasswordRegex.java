import java.util.regex.Pattern;  // Importing the Pattern class from the java.util.regex package
/*
You need to write regex that will validate a password to make sure it meets the following criteria:

At least six characters long
contains a lowercase letter
contains an uppercase letter
contains a digit
only contains alphanumeric characters (note that '_' is not alphanumeric)
 */
class PasswordRegex {  // Defining a class named PasswordRegex
    static final String REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";  // Declaring a constant variable REGEX with the password validation regex pattern

    public static void main(String[] args) {  // Defining the main method that serves as the entry point of the program
        String password = "MyPassw0rd";  // Declaring a variable password and assigning it the value "MyPassw0rd"

        if (Pattern.matches(REGEX, password)) {  // Checking if the password matches the regex pattern
            System.out.println("Password is valid");  // Printing "Password is valid" if the password matches the pattern
        } else {
            System.out.println("Password is invalid");  // Printing "Password is invalid" if the password does not match the pattern
        }
    }
}