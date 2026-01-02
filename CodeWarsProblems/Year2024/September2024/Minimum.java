package September2024;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/*
Given a list of digits, return the smallest number that could be formed from these digits, using the digits only once (ignore duplicates).
 */
public class Minimum {

    public static int minValue(int[] values) {
        Set<Integer> uniqueDigits = new HashSet<>();

        for (int value : values) {
            uniqueDigits.add(value);
        }

        Integer[] uniqueDigitsArray = uniqueDigits.toArray(new Integer[0]);
        Arrays.sort(uniqueDigitsArray);

        StringBuilder smallestNumber = new StringBuilder();

        for (int digit : uniqueDigitsArray) {
            smallestNumber.append(digit);
        }

        return Integer.parseInt(smallestNumber.toString());
    }

    public static void main(String[] args) {
        int[] digits = {3, 1, 4, 1, 5, 9};
        System.out.println(minValue(digits)); // Output: 13459
    }
}