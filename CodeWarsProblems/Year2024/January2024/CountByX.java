import java.util.Arrays;

public class CountByX {
    /*
    Create a function with two arguments that will return an array of the first n multiples of x.
    Assume both the given number and the number of times to count will be positive numbers greater than 0.
    Return the results as an array or list ( depending on language ).
    Examples
    countBy(1,10)  // should return  {1,2,3,4,5,6,7,8,9,10}
    countBy(2,5)  // should return {2,4,6,8,10}
     */
    public static void main(String[] args) {
        int[] result = getMultiples(1, 10);
        int[] result2 = getMultiples(2, 5);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));

    }
    public static int[] getMultiples(int x, int n) {
        // Create an array to store the multiples
        int[] multiples = new int[n];

        // Loop through the array and calculate the multiples
        for (int i = 0; i < n; i++) {
            // Calculate the multiple by multiplying x with (i + 1)
            multiples[i] = x * (i + 1);
        }

        // Return the array of multiples
        return multiples;
    }
    /*
    We declare a function called getMultiples that takes two arguments: x and n. The function is defined as returning an array of integers (int[]).

    Inside the function, we create an array called multiples with a length of n. This array will store the multiples of x.

    We enter a for loop that iterates from 0 to n-1. We use the loop variable i to keep track of the current index in the multiples array.

    Inside the loop, we calculate each multiple by multiplying x with (i + 1). (i + 1) is used because we want the first multiple to be x, the second multiple to be 2x, the third multiple to be 3x, and so on.

    We assign the calculated multiple to the corresponding index in the multiples array (multiples[i] = x * (i + 1)).

    After the loop completes, we have calculated all the multiples and stored them in the multiples array.

    Finally, we return the array of multiples.
     */
}
