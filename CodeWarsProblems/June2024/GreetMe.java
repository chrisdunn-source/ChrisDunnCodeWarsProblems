package June2024;
/*
Write a method that takes one argument as name and then greets that name, capitalized and ends with an exclamation point.

Example:

"riley" --> "Hello Riley!"
"JACK"  --> "Hello Jack!"
 */
public class GreetMe {
    public static String greet(String name) {
        // Capitalize the first letter of the name
        String capitalized = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

        // Create the greeting with the capitalized name
        String greeting = "Hello " + capitalized + "!";

        return greeting;
    }

    public static void main(String[] args) {
        // Test cases
        String name1 = "riley";
        String name2 = "JACK";

        // Call the greet method with the test cases and print the result
        System.out.println(greet(name1)); // Expected output: "Hello Riley!"
        System.out.println(greet(name2)); // Expected output: "Hello Jack!"
    }
}
