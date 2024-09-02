package September2024;

import java.util.Arrays;
/*
Given an array/list [] of integers , Find the product of the k maximal numbers.


 */
public class MaxProduct
{
    public static long maxProduct(int[] numbers, int sub_size)
    {
        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Initialize product variable to store the final product
        long product = 1;

        // Loop through the last k maximal numbers and multiply them
        for (int i = numbers.length - 1; i >= numbers.length - sub_size; i--)
        {
            product *= numbers[i];
        }

        return product;
    }

    public static void main(String[] args)
    {
        int[] testArray = {3, 7, 2, 5, 8, 4};
        int k = 3;

        long result = maxProduct(testArray, k);

        System.out.println("The product of the " + k + " maximal numbers is: " + result);
    }
}