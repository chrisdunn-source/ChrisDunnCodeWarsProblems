/*
Problem:
To find the volume (centimeters cubed) of a cuboid you use the formula:
volume = Length * Width * Height

But someone forgot to use proper record keeping, so we only have the volume, and the length of a single side!

It's up to you to find out whether the cuboid has equal sides (= is a cube).

Return true if the cuboid could have equal sides, return false otherwise.

Return false for invalid numbers too (e.g volume or side is less than or equal to 0).

Note: side will be an integer
*/

class Cube {
  // Method to check if the given cuboid could have equal sides and be a cube
  public static boolean isCube(int volume, int side) {
    // Check if either volume or side is less than or equal to 0
    if (volume <= 0 || side <= 0) {
        return false; // Return false for invalid numbers
    }
    
    // Calculate the length of each side of the cube by taking the cube root of the volume
    int cubeSide = (int) Math.round(Math.cbrt(volume));
    
    // Check if the volume is a perfect cube and if the given side is equal to the calculated side of the cube
    return cubeSide * cubeSide * cubeSide == volume && side == cubeSide;
  }
  
  // Main method to run test cases
  public static void main(String[] args) {
    // Test cases
    System.out.println(isCube(27, 3)); // Expected: true (3*3*3 = 27)
    System.out.println(isCube(20, 2)); // Expected: false (not a perfect cube)
    System.out.println(isCube(0, 5)); // Expected: false (volume is 0)
    System.out.println(isCube(64, 4)); // Expected: true (4*4*4 = 64)
  }
}
