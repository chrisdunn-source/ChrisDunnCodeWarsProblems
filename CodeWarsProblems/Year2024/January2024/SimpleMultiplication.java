public class SimpleMultiplication {
    public static void main(String[] args) {
        //we test out the function simpleMultiplication by providing it with a value
        System.out.println(simpleMultiplication(2));
    }
    public static int simpleMultiplication(int n) {
        //created a varible to store value of new number
        int newNumber;
        //checked to see if number was even or odd. If you mod a number by 2 and the answer is 0 then the number is even. If it returns any number other than 0 then it is odd. Once we determine if the number is even or odd. we multiply even number by 8 and all other numbers by 9 and store it in newNumber. When done we return newNumber.
        if(n % 2 == 0){
            newNumber = n * 8;
        }else
            newNumber = n * 9;

            return newNumber;
    }
}
