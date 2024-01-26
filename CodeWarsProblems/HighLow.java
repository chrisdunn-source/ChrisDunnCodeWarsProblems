public class HighLow {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));    // Output: "5 1"
        System.out.println(highAndLow("1 2 -3 4 5"));   // Output: "5 -3"
        System.out.println(highAndLow("1 9 3 4 -5"));   // Output: "9 -5"
    }
    public static String highAndLow(String numbers) {
        /*
        The highAndLow method splits the input string into an array of individual numbers using the split method. Then, it initializes max and min variables with the minimum and maximum integer values, respectively. It iterates through each number, converting it to an integer using Integer.parseInt, and updates max and min accordingly using Math.max and Math.min functions. Finally, it returns the highest and lowest numbers as a string, separated by a space.
         */
        String[] numArray = numbers.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String num : numArray) {
            int current = Integer.parseInt(num);
            max = Math.max(max, current);
            min = Math.min(min, current);
        }

        return max + " " + min;
    }
}
