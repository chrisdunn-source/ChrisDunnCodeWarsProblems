package April2024;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

 /*
     In this simple exercise, you will build a program that takes a value, integer , and returns a list of its multiples up to another value, limit . If limit is a multiple of integer, it should be included as well. There will only ever be positive integers passed into the function, not consisting of 0. The limit will always be higher than the base.

    For example, if the parameters passed are (2, 6), the function should return [2, 4, 6] as 2, 4, and 6 are the multiples of 2 up to 6.
  */
public class Multiples {
    public static void main(String[] args) {
        // Test the find method with different inputs
        int base = 2;
        int limit = 6;
        int[] multiples = find(base, limit);
        System.out.println("Multiples of " + base + " up to " + limit + ": " + Arrays.toString(multiples));

        base = 3;
        limit = 10;
        multiples = find(base, limit);
        System.out.println("Multiples of " + base + " up to " + limit + ": " + Arrays.toString(multiples));
    }

    public static int[] find(int base, int limit) {
        // Create a list to store the multiples
        List<Integer> multiples = new ArrayList<>();

        // Iterate from the base value up to the limit
        for (int i = base; i <= limit; i += base) {
            // Check if the current number is a multiple of the base
            // If it is, add it to the list of multiples
            multiples.add(i);
        }

        // Convert the list of multiples to an array
        int[] result = new int[multiples.size()];
        for (int i = 0; i < multiples.size(); i++) {
            result[i] = multiples.get(i);
        }

        // Return the array of multiples
        return result;
    }
}