/*
You will be given a string featuring a cat 'C' and a mouse 'm'. The rest of the string will be made up of '.'. The string will start with the cat, and end with the mouse.

You need to find out if the cat can catch the mouse from its current position. The cat can jump over at most three characters. So:

"C.....m" returns "Escaped!" <-- more than three characters between

"C...m" returns "Caught!" <-- as there are three characters between the two, the cat can jump.
*/
public class Kata {
    public static String catMouse(String x) {
        // Find the position of the cat ('C') and the mouse ('m')
        int catPosition = x.indexOf('C'); // Gets the index of the cat
        int mousePosition = x.indexOf('m'); // Gets the index of the mouse
        
        // Calculate the distance between the cat and the mouse
        int distance = mousePosition - catPosition; // Distance is the difference in their positions
        
        // If the distance is less than or equal to 4 (3 characters in between + cat + mouse)
        // the cat can catch the mouse
        if (distance <= 4) {
            return "Caught!"; // Cat can catch the mouse
        } else {
            return "Escaped!"; // Cat cannot catch the mouse
        }
    }
  }
