package July2024;
/*
Your friend invites you out to a cool floating pontoon around 1km off the beach. Among other things, the pontoon has a huge slide that drops you out right into the ocean, a small way from a set of stairs used to climb out.

As you plunge out of the slide into the water, you see a shark hovering in the darkness under the pontoon... Crap!

You need to work out if the shark will get to you before you can get to the pontoon. To make it easier... as you do the mental calculations in the water you either freeze when you realise you are dead, or swim when you realise you can make it!

You are given 5 variables;

sharkDistance = distance from the shark to the pontoon. The shark will eat you if it reaches you before you escape to the pontoon.

sharkSpeed = how fast it can move in metres/second.

pontoonDistance = how far you need to swim to safety in metres.

youSpeed = how fast you can swim in metres/second.

dolphin = a boolean, if true, you can half the swimming speed of the shark as the dolphin will attack it.

The pontoon, you, and the shark are all aligned in one dimension.

If you make it, return "Alive!", if not, return "Shark Bait!".
 */
public class SharkPontoon {
    public static String shark(int pontoonDistance, int sharkDistance,
                               int youSpeed, int sharkSpeed, boolean dolphin) {
        // Calculate the time it takes for you to reach the pontoon
        double yourTime = pontoonDistance / (double) youSpeed;

        // Calculate the shark's speed considering the dolphin factor
        double effectiveSharkSpeed = dolphin ? sharkSpeed / 2.0 : sharkSpeed;

        // Calculate the time it takes for the shark to reach you
        double sharkTime = sharkDistance / effectiveSharkSpeed;

        // Compare the times and determine the outcome
        if (yourTime < sharkTime) {
            return "Alive!"; // You made it to the pontoon before the shark
        } else {
            return "Shark Bait!"; // The shark caught up with you
        }
    }

    public static void main(String[] args) {
        // Test case 1: You can make it to the pontoon before the shark
        System.out.println(shark(1000, 500, 10, 20, false)); // Expected output: Alive!

        // Test case 2: The shark is faster than you, no dolphin to help
        System.out.println(shark(1000, 500, 10, 30, false)); // Expected output: Shark Bait!

        // Test case 3: The dolphin is present to help you
        System.out.println(shark(1000, 500, 10, 30, true)); // Expected output: Alive!
    }
}
