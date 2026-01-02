package June2024;
/*
The wide-mouth frog is particularly interested in the eating habits of other creatures.

He just can't stop asking the creatures he encounters what they like to eat. But, then he meets the alligator who just LOVES to eat wide-mouthed frogs!

When he meets the alligator, it then makes a tiny mouth.

Your goal in this kata is to create complete the mouth_size method this method takes one argument animal which corresponds to the animal encountered by the frog. If this one is an alligator (case-insensitive) return small otherwise return wide.
 */
public class WideMouthedFrog {
    public static String mouthSize(String animal) {
        // Check if the animal is an alligator
        if (animal.toLowerCase().equals("alligator")) {
            // Return "small" if it is an alligator
            return "small";
        } else {
            // Return "wide" for any other animal
            return "wide";
        }
    }

    public static void main(String[] args) {
        // Test cases
        String animal1 = "alligator";
        String animal2 = "crocodile";

        // Call the mouthSize method with animal1 and print the result
        System.out.println(mouthSize(animal1)); // Output: small

        // Call the mouthSize method with animal2 and print the result
        System.out.println(mouthSize(animal2)); // Output: wide
    }
}