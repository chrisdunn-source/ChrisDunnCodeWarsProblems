package April2024;
    /*
    A hero is on his way to the castle to complete his mission. However, he's been told that the castle is surrounded with a couple of powerful dragons! each dragon takes 2 bullets to be defeated, our hero has no idea how many bullets he should carry.. Assuming he's gonna grab a specific given number of bullets and move forward to fight another specific given number of dragons, will he survive?

    Return true if yes, false otherwise :)
     */

public class HeroSurvival {
    // Main method for testing
    public static void main(String[] args) {
        // Test case 1: The hero has enough bullets to defeat the dragons
        boolean result1 = hero(10, 5);
        System.out.println("Test case 1: " + result1); // Expected: true

        // Test case 2: The hero does not have enough bullets to defeat the dragons
        boolean result2 = hero(5, 10);
        System.out.println("Test case 2: " + result2); // Expected: false

        // Test case 3: The hero has exactly enough bullets to defeat the dragons
        boolean result3 = hero(8, 4);
        System.out.println("Test case 3: " + result3); // Expected: true
    }

    /**
     * Determines if the hero has enough bullets to defeat the dragons.
     *
     * @param bullets  the number of bullets the hero has
     * @param dragons  the number of dragons the hero will face
     * @return true if the hero has enough bullets, false otherwise
     */
    public static boolean hero(long bullets, long dragons) {
        long bulletsNeeded = dragons * 2; // Calculate the total number of bullets needed

        if (bullets >= bulletsNeeded) {
            return true; // The hero has enough bullets to defeat the dragons
        } else {
            return false; // The hero does not have enough bullets to defeat the dragons
        }
    }
}
