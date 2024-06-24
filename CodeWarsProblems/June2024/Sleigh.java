package June2024;
/*
Christmas is coming and many people dreamed of having a ride with Santa's sleigh. But, of course, only Santa himself is allowed to use this wonderful transportation. And in order to make sure, that only he can board the sleigh, there's an authentication mechanism.

Your task is to implement the authenticate() method of the sleigh, which takes the name of the person, who wants to board the sleigh and a secret password. If, and only if, the name equals "Santa Claus" and the password is "Ho Ho Ho!" (yes, even Santa has a secret password with uppercase and lowercase letters and special characters :D), the return value must be true. Otherwise it should return false.

Examples:

sleigh.authenticate("Santa Claus", "Ho Ho Ho!") # must return True
sleigh.authenticate("Santa', 'Ho Ho Ho!") # must return False
sleigh.authenticate("Santa Claus", "Ho Ho!") # must return False
sleigh.authenticate("jhoffner", "CodeWars") # Nope, even Jak
 */

public class Sleigh {
    // Method to authenticate the person attempting to board the sleigh
    public static Boolean authenticate(String name, String password) {
        // Check if the name is "Santa Claus" and the password is "Ho Ho Ho!"
        if (name.equals("Santa Claus") && password.equals("Ho Ho Ho!")) {
            return true; // Return true if both conditions are met
        } else {
            return false; // Return false if any condition is not met
        }
    }

    // Main method to test the authenticate() method
    public static void main(String[] args) {
        // Create an instance of the Sleigh class
        Sleigh sleigh = new Sleigh();

        // Test cases
        System.out.println(sleigh.authenticate("Santa Claus", "Ho Ho Ho!")); // true
        System.out.println(sleigh.authenticate("Santa", "Ho Ho Ho!")); // false
        System.out.println(sleigh.authenticate("Santa Claus", "Ho Ho!")); // false
        System.out.println(sleigh.authenticate("jhoffner", "CodeWars")); // false
        System.out.println(sleigh.authenticate("Santa Claus", "Hoho Hoho!")); // false
    }
}
/*
public class Sleigh {: This line declares a public class named "Sleigh".
public static Boolean authenticate(String name, String password) {: This line declares a method named "authenticate" that takes two parameters: "name" and "password". It returns a Boolean value.
if (name.equals("Santa Claus") && password.equals("Ho Ho Ho!")) {: This line checks if the name is equal to "Santa Claus" and the password is equal to "Ho Ho Ho!" using the equals() method.
return true;: This line is executed if the conditions in the if statement are true. It returns true to indicate that the authentication is successful.
return false;: This line is executed if the conditions in the if statement are not true. It returns false to indicate that the authentication is unsuccessful.
public static void main(String[] args) {: This line declares the main method, which serves as the entry point of the program.
Sleigh sleigh = new Sleigh();: This line creates an instance of the Sleigh class.
System.out.println(sleigh.authenticate("Santa Claus", "Ho Ho Ho!"));: This line calls the authenticate method on the sleigh instance with the name "Santa Claus" and password "Ho Ho Ho!" and prints the result.
System.out.println(sleigh.authenticate("Santa", "Ho Ho Ho!"));: This line calls the authenticate method on the sleigh instance with the name "Santa" and password "Ho Ho Ho!" and prints the result.
System.out.println(sleigh.authenticate("Santa Claus", "Ho Ho!"));: This line calls the authenticate method on the sleigh instance with the name "Santa Claus" and password "Ho Ho!" and prints the result.
System.out.println(sleigh.authenticate("jhoffner", "CodeWars"));: This line calls the authenticate method on the sleigh instance with the name "jhoffner" and password "CodeWars" and prints the result.
System.out.println(sleigh.authenticate("Santa Claus", "Hoho Hoho!"));: This line calls the authenticate method on the sleigh instance with the name "Santa Claus" and password "Hoho Hoho!" and prints the result.
 */