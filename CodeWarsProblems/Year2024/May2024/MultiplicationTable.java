package May2024;
    /*
    Your goal is to return multiplication table for number that is always an integer from 1 to 10.

    For example, a multiplication table (string) for number == 5 looks like below:

    1 * 5 = 5
    2 * 5 = 10
    3 * 5 = 15
    4 * 5 = 20
    5 * 5 = 25
    6 * 5 = 30
    7 * 5 = 35
    8 * 5 = 40
    9 * 5 = 45
    10 * 5 = 50
     */

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 5; // Change this to any number you desire
        System.out.println(multiTable(number));
    }

    public static String multiTable(int num) {
        StringBuilder table = new StringBuilder(); // We'll use a StringBuilder to construct our table

        for (int i = 1; i <= 10; i++) {
            int result = num * i; // Calculate the product
            table.append(i).append(" * ").append(num).append(" = ").append(result);

            if (i != 10) {
                table.append("\n"); // Add a new line after each row except the last one
            }
        }

        return table.toString();
    }
}
