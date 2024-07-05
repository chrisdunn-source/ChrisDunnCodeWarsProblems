package July2024;

import java.util.Arrays;
/*
Write a function called sortGiftCode/sort_gift_code/SortGiftCode that accepts a string containing up to 26 unique alphabetical characters, and returns a string containing the same characters in alphabetical order.

Examples (Input -- => Output):
"abcdef"                      -- => "abcdef"
"pqksuvy"                     -- => "kpqsuvy"
"zyxwvutsrqponmlkjihgfedcba"  -- => "abcdefghijklmnopqrstuvwxyz"
 */

public class GiftSorter {
    public String sortGiftCode(String code) {
        char[] chars = code.toCharArray(); // Convert the string to a character array
        Arrays.sort(chars); // Sort the character array in ascending order
        return new String(chars); // Convert the sorted character array back to a string
    }

    public static void main(String[] args) {
        GiftSorter sorter = new GiftSorter();

        // Test case 1
        String code1 = "abcdef";
        String sortedCode1 = sorter.sortGiftCode(code1);
        System.out.println("Sorted code for '" + code1 + "': " + sortedCode1); // Expected output: abcdef

        // Test case 2
        String code2 = "pqksuvy";
        String sortedCode2 = sorter.sortGiftCode(code2);
        System.out.println("Sorted code for '" + code2 + "': " + sortedCode2); // Expected output: kpqsuvy

        // Test case 3
        String code3 = "zyxwvutsrqponmlkjihgfedcba";
        String sortedCode3 = sorter.sortGiftCode(code3);
        System.out.println("Sorted code for '" + code3 + "': " + sortedCode3); // Expected output: abcdefghijklmnopqrstuvwxyz
    }
}
