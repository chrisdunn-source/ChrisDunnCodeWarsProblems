public class BinaryAddition {
    /*
    Implement a function that adds two numbers together and returns their sum in binary. The conversion can be done before, or after the addition.
    The binary number returned should be a string.
    Examples:(Input1, Input2 --> Output (explanation)))
    1, 1 --> "10" (1 + 1 = 2 in decimal or 10 in binary)
    5, 9 --> "1110" (5 + 9 = 14 in decimal or 1110 in binary)
     */
    public static void main(String[] args) {
        System.out.println(binaryAddition(1,5));
    }
    public static String binaryAddition(int a, int b){
        String output = a + ", " + b + " --->" + " \""+ Integer.toBinaryString(a + b) + "\"" + " (" + a + " + " + b + " = " + (a+b) + "  in decimal or " + Integer.toBinaryString(a + b) + " in binary)";
        return output;
    //Integer (int arg) : Constructs integer object representing an int value
    //toBinaryString() : java.lang.Integer.toBinaryString() method converts the integer value of argument its Binary representation as a string.     

    }
}
