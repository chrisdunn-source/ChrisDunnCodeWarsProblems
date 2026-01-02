public class TenMinWalk {
    // This method checks if a given walk will lead you back to the starting point in exactly ten minutes
    public static boolean isValid(char[] walk) {
        // Check if the walk array has exactly 10 steps, as each step takes one minute
        if (walk.length != 10) {
            return false;
        }

        // Variables to keep track of the total steps in north-south and east-west directions
        int ns = 0; // North-South
        int ew = 0; // East-West
        
        // Loop through each direction in the walk array
        for (char direction : walk) {
            // Update the step counts based on the current direction
            switch (direction) {
                case 'n':
                    ns++; // Move one step north
                    break;
                case 's':
                    ns--; // Move one step south
                    break;
                case 'e':
                    ew++; // Move one step east
                    break;
                case 'w':
                    ew--; // Move one step west
                    break;
                default:
                    return false; // If an invalid direction is encountered, return false
            }
        }

        // Check if the total steps in each direction cancel out (return to starting point) and if the total steps are exactly 10
        return ns == 0 && ew == 0;
    }

    public static void main(String[] args) {
        // Test the isValid method with a sample walk array
        char[] walk = {'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'};
        System.out.println(isValid(walk)); // Should return true
    }
}
