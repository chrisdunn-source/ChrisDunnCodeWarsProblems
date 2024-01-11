public class BooleanToString {
/*
 Implement a function which convert the given
 boolean value into its string representation.
 */

    public static void main(String[] args) {
    boolean boolValue = true;
    BooleanToString obj1 = new BooleanToString();
    String stringValue = obj1.booleanToString(boolValue);
        System.out.println(stringValue);
    }
    public String booleanToString(boolean value){
        return Boolean.toString(value);
        /*
        The Boolean.toString() method is a built-in Java
        method that returns the string representation of
        a boolean value. It converts true to the string
        "true" and false to the string "false". The
        booleanToString function simply wraps this method
        and returns the result.
         */
    }
}
