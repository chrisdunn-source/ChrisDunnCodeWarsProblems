package February2024;
/*
    We need a function that can transform a number (integer) into a string.
    What ways of achieving this do you know?
    Examples (input --> output):
    123  --> "123"
    999  --> "999"
    -100 --> "-100"
 */
public class NumberToString {
    /*
    several ways to transform an integer into a string in Java. Here are a few approaches
     */
    public static void main(String[] args) {
        System.out.println(numberToString1(123));
        System.out.println(numberToString2(456));
        System.out.println(numberToString3(789));
        System.out.println(numberToString4(817));
    }
    //Using the Integer.toString() method:
    public static String numberToString1(int num) {
        return Integer.toString(num);
    }
    //Using the String.valueOf() method:
    public static String numberToString2(int num) {
        return String.valueOf(num);
    }
    //Using concatenation with an empty string:
    public static String numberToString3(int num) {
        return "" + num;
    }
    //Using the StringBuilder class:
    public static String numberToString4(int num) {
        return new StringBuilder().append(num).toString();
    }
}
