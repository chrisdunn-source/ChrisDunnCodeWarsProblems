package July2024;
/*
You're writing code to control your town's traffic lights. You need a function to handle each change from green, to yellow, to red, and then to green again.

Complete the function that takes a string as an argument representing the current state of the light and returns a string representing the state the light should change to.

For example, when the input is green, output should be yellow.
 */
public class TrafficLights {

    public static String updateLight(String current) {
        if (current.equals("green")) {
            return "yellow"; // If the current state is green, change to yellow
        } else if (current.equals("yellow")) {
            return "red"; // If the current state is yellow, change to red
        } else if (current.equals("red")) {
            return "green"; // If the current state is red, change to green
        } else {
            return "invalid state"; // Handle invalid state inputs gracefully
        }
    }

    public static void main(String[] args) {
        // Testing the updateLight method with different inputs

        // Test case 1: current light is green, expected output is yellow
        String currentState = "green";
        String nextState = updateLight(currentState);
        System.out.println("Current state: " + currentState);
        System.out.println("Next state: " + nextState);
        System.out.println();

        // Test case 2: current light is yellow, expected output is red
        currentState = "yellow";
        nextState = updateLight(currentState);
        System.out.println("Current state: " + currentState);
        System.out.println("Next state: " + nextState);
        System.out.println();

        // Test case 3: current light is red, expected output is green
        currentState = "red";
        nextState = updateLight(currentState);
        System.out.println("Current state: " + currentState);
        System.out.println("Next state: " + nextState);
        System.out.println();

        // Test case 4: current light is an invalid state, expected output is "
