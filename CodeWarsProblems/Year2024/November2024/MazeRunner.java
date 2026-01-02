public class MazeRunner {
  
    public static String walk(int[][] maze, String[] directions) {
        // Initialize the starting position coordinates
        int startX = 0;
        int startY = 0;
        
        // Find the starting position in the maze
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 2) {
                    startX = i;
                    startY = j;
                    break;
                }
            }
        }
        
        // Follow the directions and navigate through the maze
        for (String direction : directions) {
            switch (direction) {
                case "N":
                    startX--;
                    break;
                case "S":
                    startX++;
                    break;
                case "W":
                    startY--;
                    break;
                case "E":
                    startY++;
                    break;
            }
            
            // Check if the new position is within the maze boundaries
            if (startX < 0 || startX >= maze.length || startY < 0 || startY >= maze[startX].length) {
                return "Dead"; // Hit a wall or went outside the maze border
            }
            
            // Check the content of the new position in the maze
            int newPosition = maze[startX][startY];
            if (newPosition == 1) {
                return "Dead"; // Hit a wall
            } else if (newPosition == 3) {
                return "Finish"; // Reached the finish point
            }
        }
        
        return "Lost"; // Still in the maze after using all moves
    }
    
    public static void main(String[] args) {
        // Test case 1
        int[][] maze1 = {
            {1, 1, 1, 1},
            {1, 0, 2, 1},
            {1, 0, 3, 1},
            {1, 1, 1, 1}
        };
        String[] directions1 = {"N", "E", "E", "E"};
        System.out.println(walk(maze1, directions1)); // Expected output: Finish
        
        // Test case 2
        int[][] maze2 = {
            {1, 2, 1},
            {1, 0, 1},
            {1, 3, 1}
        };
        String[] directions2 = {"E", "E", "S", "S"};
        System.out.println(walk(maze2, directions2)); // Expected output: Dead
    }
}
