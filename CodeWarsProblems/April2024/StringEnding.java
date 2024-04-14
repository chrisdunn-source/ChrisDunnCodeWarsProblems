package April2024;

    /*
    Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
     */
public class StringEnding {
    public static void main(String[] args) {
        System.out.println(StringEnding.solution("abc", "bc")); // returns true
        System.out.println(StringEnding.solution("abc", "d")); // returns false
    }

    public static boolean solution(String str, String ending) {
        // Use the endsWith() method to check if the string ends with the specified ending
        return str.endsWith(ending);
    }
}
