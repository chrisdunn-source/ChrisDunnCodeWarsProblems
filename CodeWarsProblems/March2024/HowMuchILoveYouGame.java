package March2024;
    /*
    Who remembers back to their time in the schoolyard, when girls would take a flower and tear its petals, saying each of the following phrases each time a petal was torn:

    "I love you"
    "a little"
    "a lot"
    "passionately"
    "madly"
    "not at all"
    If there are more than 6 petals, you start over with "I love you" for 7 petals, "a little" for 8 petals and so on.

    When the last petal was torn there were cries of excitement, dreams, surging thoughts and emotions.

    Your goal in this kata is to determine which phrase the girls would say at the last petal for a flower of a given number of petals. The number of petals is always greater than 0.
     */

public class HowMuchILoveYouGame {
    public static void main(String[] args) {
        // Test cases
        System.out.println(howMuchILoveYou(1));   // Expected: I love you
        System.out.println(howMuchILoveYou(5));   // Expected: madly
        System.out.println(howMuchILoveYou(10));  // Expected: passionately
        System.out.println(howMuchILoveYou(8));   // Expected: a little
        System.out.println(howMuchILoveYou(13));  // Expected: a lot
    }
    public static String howMuchILoveYou(int nb_petals) {
        // Array containing all the phrases
        String[] phrases = {
                "I love you",
                "a little",
                "a lot",
                "passionately",
                "madly",
                "not at all"
        };

        // Calculate the index of the phrase to be said based on the number of petals
        int phraseIndex = (nb_petals - 1) % phrases.length;

        // Return the phrase at the calculated index
        return phrases[phraseIndex];
    }
}
