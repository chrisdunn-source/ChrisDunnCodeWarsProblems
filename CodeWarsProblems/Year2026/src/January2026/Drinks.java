public class Drinks {
    /*
    Kids drink toddy.
Teens drink coke.
Young adults drink beer.
Adults drink whisky.
Make a function that receive age, and return what they drink.

Rules:

Children under 14 old.
Teens under 18 old.
Young under 21 old.
Adults have 21 or more.
Examples: (Input --> Output)

13 --> "drink toddy"
17 --> "drink coke"
18 --> "drink beer"
20 --> "drink beer"
30 --> "drink whisky"
     */

    // Method to determine what drink people of different ages should have
    public static String peopleWithAgeDrink(int age) {
        if (age < 14) {
            return "drink toddy"; // Children drink toddy
        } else if (age < 18) {
            return "drink coke"; // Teens drink coke
        } else if (age < 21) {
            return "drink beer"; // Young adults drink beer
        } else {
            return "drink whisky"; // Adults drink whisky
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Test cases
        System.out.println(peopleWithAgeDrink(13)); // Expected output: "drink toddy"
        System.out.println(peopleWithAgeDrink(17)); // Expected output: "drink coke"
        System.out.println(peopleWithAgeDrink(18)); // Expected output: "drink beer"
        System.out.println(peopleWithAgeDrink(20)); // Expected output: "drink beer"
        System.out.println(peopleWithAgeDrink(30)); // Expected output: "drink whisky"
    }
}