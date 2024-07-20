import java.util.ArrayList;
import java.util.List;
/*
Selection Grid Layout in text:

| Ryu  | E.Honda | Blanka  | Guile   | Balrog | Vega    |
| Ken  | Chun Li | Zangief | Dhalsim | Sagat  | M.Bison |
Input

the list of game characters in a 2x6 grid;
the initial position of the selection cursor (top-left is (0,0));
a list of moves of the selection cursor (which are up, down, left, right);
Output

the list of characters who have been hovered by the selection cursor after all the moves (ordered and with repetition, all the ones after a move, whether successful or not, see tests);
Rules

Selection cursor is circular horizontally but not vertically!

As you might remember from the game, the selection cursor rotates horizontally but not vertically; that means that if I'm in the leftmost and I try to go left again I'll get to the rightmost (examples: from Ryu to Vega, from Ken to M.Bison) and vice versa from rightmost to leftmost.

Instead, if I try to go further up from the upmost or further down from the downmost, I'll just stay where I am located (examples: you can't go lower than lowest row: Ken, Chun Li, Zangief, Dhalsim, Sagat and M.Bison in the above image; you can't go upper than highest row: Ryu, E.Honda, Blanka, Guile, Balrog and Vega in the above image).

Test

For this easy version the fighters grid layout and the initial position will always be the same in all tests, only the list of moves change.

Notice: changing some of the input data might not help you.

Examples

fighters = [
  ["Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"],
  ["Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"]
]
initial_position = (0,0)
moves = ['up', 'left', 'right', 'left', 'left']
then I should get:

['Ryu', 'Vega', 'Ryu', 'Vega', 'Balrog']
as the characters I've been hovering with the selection cursor during my moves. Notice: Ryu is the first just because it "fails" the first up See test cases for more examples.

fighters = [
  ["Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"],
  ["Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"]
]
initial_position = (0,0)
moves = ['right', 'down', 'left', 'left', 'left', 'left', 'right']
Result:

['E.Honda', 'Chun Li', 'Ken', 'M.Bison', 'Sagat', 'Dhalsim', 'Sagat']
 */

public class SelectionGridMoves {

    // Method to simulate the selection cursor movement in Street Fighter grid
    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {
        List<String> hoveredFighters = new ArrayList<>();

        for (String move : moves) {
            int row = position[0];  // Current row of the selection cursor
            int col = position[1];  // Current column of the selection cursor

            // Determine the new position based on the move
            switch (move) {
                case "up":
                    // Move up if possible, otherwise stay in the same row
                    row = Math.max(0, row - 1);
                    break;
                case "down":
                    // Move down if possible, otherwise stay in the same row
                    row = Math.min(fighters.length - 1, row + 1);
                    break;
                case "left":
                    // Move left in a circular manner within the row
                    col = (col - 1 + fighters[row].length) % fighters[row].length;
                    break;
                case "right":
                    // Move right in a circular manner within the row
                    col = (col + 1) % fighters[row].length;
                    break;
            }

            // Update the position of the selection cursor
            position[0] = row;
            position[1] = col;

            // Add the name of the fighter at the new position to the list
            hoveredFighters.add(fighters[row][col]);
        }

        // Convert the list of hovered fighters to an array and return it
        return hoveredFighters.toArray(new String[0]);
    }

    // Entry point of the program
    public static void main(String[] args) {
        // Define the grid of fighters
        String[][] fighters = {
                {"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
                {"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"}
        };

        // Define the initial position of the selection cursor
        int[] position = {0, 0};

        // Define the moves of the selection cursor
        String[] moves = {"up", "left", "right", "left", "left"};

        // Simulate the selection cursor movement and get the hovered fighters
        String[] hoveredFighters = streetFighterSelection(fighters, position, moves);

        // Print the hovered fighters
        System.out.println("Hovered Fighters: " + String.join(", ", hoveredFighters));
    }
}