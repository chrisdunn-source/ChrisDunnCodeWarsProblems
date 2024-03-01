public class AbbreviateTwoWords {
/*
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
The output should be two capital letters with a dot separating them.
It should look like this:
Sam Harris => S.H
patrick feeney => P.F
*/
    
  public static String abbrevName(String name) {
    String[] words = name.split(" "); // Split the name into words using space as the delimiter
    char firstInitial = Character.toUpperCase(words[0].charAt(0)); // Extract the first character of the first word and convert it to uppercase
    char secondInitial = Character.toUpperCase(words[1].charAt(0)); // Extract the first character of the second word and convert it to uppercase
    return firstInitial + "." + secondInitial; // Join the initials together with a dot in between
  }

    public static void main(String[] args) {
        // Test cases
        System.out.println(abbrevName("Sam Harris")); // Expected: S.H
        System.out.println(abbrevName("patrick feeney")); // Expected: P.F
        System.out.println(abbrevName("John")); // Expected: Invalid input: Name must contain two words separated by a space.
        System.out.println(abbrevName("Jane Doe Smith")); // Expected: J.D
    }
}
