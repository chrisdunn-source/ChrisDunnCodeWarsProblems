package August2024;

import java.util.Random; // We import the Random class to generate random numbers
/*
Color Ghost
Create a class Ghost

Ghost objects are instantiated without any arguments.

Ghost objects are given a random color attribute of "white" or "yellow" or "purple" or "red" when instantiated

Ghost ghost = new Ghost();
ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
 */
public class Ghost {
    private String color; // Declare a private String variable to hold the color of the Ghost

    // Constructor for the Ghost class
    public Ghost() {
        String[] colors = {"white", "yellow", "purple", "red"}; // Array of possible colors
        Random random = new Random(); // Create a new Random object for generating random numbers
        this.color = colors[random.nextInt(colors.length)]; // Randomly select a color from the array and assign it to the color variable
    }

    // Method to get the color of the Ghost
    public String getColor() {
        return color; // Return the color of the Ghost
    }

    public static void main(String[] args) {
        Ghost ghost = new Ghost(); // Create a new Ghost object
        System.out.println(ghost.getColor()); // Print the color of the Ghost
    }
}
