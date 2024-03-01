public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        if (!name.contains(" ")) {
            System.out.println("Invalid input: Name must contain two words separated by a space.");
            return "";
        }

        String[] words = name.split(" ");
        char firstInitial = Character.toUpperCase(words[0].charAt(0));
        char secondInitial = Character.toUpperCase(words[1].charAt(0));
        return firstInitial + "." + secondInitial;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(abbrevName("Sam Harris")); // Expected: S.H
        System.out.println(abbrevName("patrick feeney")); // Expected: P.F
        System.out.println(abbrevName("John")); // Expected: Invalid input: Name must contain two words separated by a space.
        System.out.println(abbrevName("Jane Doe Smith")); // Expected: J.D
    }
}