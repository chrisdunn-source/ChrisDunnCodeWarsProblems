/*
Problem:
Given a string "abc" and assuming that each letter in the string has a value equal to its position in the alphabet, our string will have a value of 1 + 2 + 3 = 6. This means that: a = 1, b = 2, c = 3 ... z = 26.

You will be given a list of strings and your task will be to return the values of the strings as explained above multiplied by the position of that string in the list. For our purpose, position begins with 1.

["abc", "abc abc"] should return [6, 24] because of [ 6 * 1, 12 * 2 ]. Note how spaces are ignored.

"abc" has a value of 6, while "abc abc" has a value of 12. Now, the value at position 1 is multiplied by 1 while the value at position 2 is multiplied by 2.

Input will only contain lowercase characters and spaces.
*/

class StringValueMultiplier {
    public static int[] nameValue(String[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String str = arr[i].replace(" ", ""); // Remove spaces in the string
            int value = 0;
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c >= 'a' && c <= 'z') {
                    value += c - 'a' + 1; // Calculate the value of each character
                }
            }
            result[i] = value * (i + 1); // Multiply the value by the position in the list
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        String[] input1 = {"abc", "abc abc"};
        int[] output1 = nameValue(input1);
        System.out.println("Output for input1:");
        for (int val : output1) {
            System.out.println(val);
        }

        String[] input2 = {"hello", "world"};
        int[] output2 = nameValue(input2);
        System.out.println("Output for input2:");
        for (int val : output2) {
            System.out.println(val);
        }
    }
}
