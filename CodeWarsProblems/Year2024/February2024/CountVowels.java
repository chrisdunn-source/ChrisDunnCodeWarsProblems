package February2024;
/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.
 */
public class CountVowels {
    public static void main(String[] args) {
        // Test cases
        String str1 = "hello";
        int count1 = getCount(str1);
        System.out.println("Number of vowels in '" + str1 + "': " + count1);

        String str2 = "world";
        int count2 = getCount(str2);
        System.out.println("Number of vowels in '" + str2 + "': " + count2);

        String str3 = "programming";
        int count3 = getCount(str3);
        System.out.println("Number of vowels in '" + str3 + "': " + count3);

        String str4 = "aeiou";
        int count4 = getCount(str4);
        System.out.println("Number of vowels in '" + str4 + "': " + count4);

        String str5 = " ";
        int count5 = getCount(str5);
        System.out.println("Number of vowels in '" + str5 + "': " + count5);
    }
    public static int getCount(String str) {
        int count = 0; // Initialize a counter to keep track of the vowel count

        // Iterate over each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // Get the character at the current index

            // Check if the character is a vowel
            if (isVowel(c)) {
                count++; // Increment the counter if it's a vowel
            }
        }

        return count; // Return the total count of vowels
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // Convert the character to lowercase

        // Check if the character is equal to any of the vowels 'a', 'e', 'i', 'o', or 'u'
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
