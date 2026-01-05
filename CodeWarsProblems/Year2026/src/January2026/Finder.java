/*
Provided is a function which accepts two parameters in the following order: array, element and returns the index of the element if found and "Not found" otherwise. Your task is to shorten the code as much as possible in order to meet the character count requirements of the Kata.

You may assume that all array elements are unique.
*/
public class Finder {
    
    public static String findIndex(String[] a, String s) {
        int i = java.util.Arrays.asList(a).indexOf(s);
        return i < 0 ? "Not found" : String.valueOf(i);
    }

    public static void main(String[] args) {
        String[] a = {"apple", "banana", "cherry", "date"};
        System.out.println(findIndex(a, "cherry")); // Expected: "2"
        System.out.println(findIndex(a, "kiwi"));   // Expected: "Not found"
    }
}
