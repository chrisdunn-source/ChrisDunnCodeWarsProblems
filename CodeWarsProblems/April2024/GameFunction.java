package April2024;

public class GameFunction {
    /*
    In this game, the hero moves from left to right. The player rolls the dice and moves the number of spaces indicated by the dice two times.

    Create a function for the terminal game that takes the current position of the hero and the roll (1-6) and return the new position.

    Example:
    move(3, 6) should equal 15
     */
    public static void main(String[] args) {
        // Test cases
        int currentPosition = 5;
        int diceRoll = 3;

        // Call the move method and store the result in a variable
        int newPosition = move(currentPosition, diceRoll);

        // Print the new position
        System.out.println("New position: " + newPosition);
    }
    public static int move(int position, int roll) {
        int newPosition = position + (roll * 2);
        return newPosition;
    }
}
