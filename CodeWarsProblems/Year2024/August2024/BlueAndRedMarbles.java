package August2024;
/*
You and a friend have decided to play a game to drill your statistical intuitions. The game works like this:

You have a bunch of red and blue marbles. To start the game you grab a handful of marbles of each color and put them into the bag, keeping track of how many of each color go in. You take turns reaching into the bag, guessing a color, and then pulling one marble out. You get a point if you guessed correctly. The trick is you only have three seconds to make your guess, so you have to think quickly.

You've decided to write a function, guessBlue() to help automatically calculate whether you should guess "blue" or "red". The function should take four arguments:

the number of blue marbles you put in the bag to start
the number of red marbles you put in the bag to start
the number of blue marbles pulled out so far (always lower than the starting number of blue marbles)
the number of red marbles pulled out so far (always lower than the starting number of red marbles)
guessBlue() should return the probability of drawing a blue marble, expressed as a float. For example, guessBlue(5, 5, 2, 3) should return 0.6.
 */
public class BlueAndRedMarbles {
    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        // Calculate the remaining blue and red marbles after some have been pulled out
        int remainingBlue = blueStart - bluePulled;
        int remainingRed = redStart - redPulled;

        // Calculate the probability of drawing a blue marble
        double probabilityBlue = (double) remainingBlue / (remainingBlue + remainingRed);

        return probabilityBlue;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Probability of drawing a blue marble: " + guessBlue(5, 5, 2, 3)); // Expected: 0.6
        System.out.println("Probability of drawing a blue marble: " + guessBlue(10, 10, 4, 2)); // Expected: 0.6666666666666666
    }
}