package July2024;
/*
Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors. A tower block is represented with "*" character.

For example, a tower with 3 floors looks like this:

[
  "  *  ",
  " *** ",
  "*****"
]
And a tower with 6 floors looks like this:

[
  "     *     ",
  "    ***    ",
  "   *****   ",
  "  *******  ",
  " ********* ",
  "***********"
]
 */

public class BuildTower {
    public static String[] towerBuilder(int nFloors) {
        String[] tower = new String[nFloors];

        for (int i = 0; i < nFloors; i++) {
            StringBuilder floor = new StringBuilder();
            // Add spaces before the '*' characters
            for (int j = 0; j < nFloors - i - 1; j++) {
                floor.append(" ");
            }
            // Add the '*' characters
            for (int j = 0; j < 2 * i + 1; j++) {
                floor.append("*");
            }
            // Add spaces after the '*' characters
            for (int j = 0; j < nFloors - i - 1; j++) {
                floor.append(" ");
            }
            tower[i] = floor.toString();
        }

        return tower;
    }

    public static void main(String[] args) {
        // Test cases
        int testCases = 5;
        String[] result;

        for (int i = 1; i <= testCases; i++) {
            result = towerBuilder(i);
            System.out.println("Tower with " + i + " floors:");
            for (String line : result) {
                System.out.println(line);
            }
            System.out.println();
        }
    }
}
