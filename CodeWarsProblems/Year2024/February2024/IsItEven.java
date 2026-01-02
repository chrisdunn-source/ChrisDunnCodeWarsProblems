package February2024;
/*
    In this Kata we are passing a number (n) into a function.

    Your code will determine if the number passed is even (or not).

    The function needs to return either a true or false.

    Numbers may be positive or negative, integers or floats.

    Floats with decimal part non equal to zero are considered UNeven for this kata.
 */

public class IsItEven {
    public static void main(String[] args) {
        System.out.println(isEven(5));
    }
    public static boolean isEven(double n) {
        // Your awesome code here!
        //Create a variable that will store answer
        boolean answer = false;
        //To check to see if a number is even. We will use mod. If mod a number by 2 and the remainder equals 0 then it is even. if not the number is odd
        if(n % 2 == 0){
            answer = true;
        }
        //return answer when you have completed if statement
        return answer;
    }
}
