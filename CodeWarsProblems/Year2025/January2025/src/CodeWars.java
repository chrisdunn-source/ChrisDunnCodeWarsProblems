/**
 * Problem:
 * You will be provided a string that lists many boat related items. 
 * If any of these items are "Fire", you must spring into action. 
 * Change any instance of "Fire" into "~~" and return the modified string.
 */

public class CodeWars {
    public static String fireFight(String s) {
        // Replace all occurrences of "Fire" with "~~"
        return s.replaceAll("Fire", "~~");
    }

    public static void main(String[] args) {
        // Test cases
        String test1 = "Boat, Water, Fire, Lifeboat";
        System.out.println(fireFight(test1)); // Expected Output: "Boat, Water, ~~, Lifeboat"

        String test2 = "Fire Extinguisher, Firefighter, Fireworks";
        System.out.println(fireFight(test2)); // Expected Output: "~~ Extinguisher, Firefighter, Fireworks"
    }
}
