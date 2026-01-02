package April2024;
    /*
    Clock shows h hours, m minutes and s seconds after midnight.

    Your task is to write a function which returns the time since midnight in milliseconds.

    Example:
    h = 0
    m = 1
    s = 1

    result = 61000
    Input constraints:

    0 <= h <= 23
    0 <= m <= 59
    0 <= s <= 59
     */
public class Clock {
    public static void main(String[] args)
    {
        int h = 0;
        int m = 1;
        int s = 1;

        int result = Clock.Past(h, m, s);

        System.out.println("Time since midnight in milliseconds: " + result);
    }

    public static int Past(int h, int m, int s)
    {
        int milliseconds = 0;

        // Convert hours to milliseconds
        milliseconds += h * 60 * 60 * 1000;

        // Convert minutes to milliseconds
        milliseconds += m * 60 * 1000;

        // Convert seconds to milliseconds
        milliseconds += s * 1000;

        return milliseconds;
    }
}
