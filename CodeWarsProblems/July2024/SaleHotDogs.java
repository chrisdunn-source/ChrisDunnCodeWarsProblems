package July2024;

public class SaleHotDogs {
    /*
    Complete function saleHotdogs/SaleHotDogs/sale_hotdogs, function accepts 1 parameter:n, n is the number of hotdogs a customer will buy, different numbers have different prices (refer to the following table), return how much money will the customer spend to buy that number of hotdogs.

    number of hotdogs	price per unit (cents)
    n < 5	100
    n >= 5 and n < 10	95
    n >= 10	90
    You can use if..else or ternary operator to complete it.

    When you have finished the work, click "Run Tests" to see if your code is working properly.

    In the end, click "Submit" to submit your code and pass this kata.
     */
    public static int saleHotdogs(final int n) {
        // If n is less than 5, price per hotdog is 100 cents
        // Equivalent if-else statement: if (n < 5) { return n * 100; }
        return (n < 5) ? n * 100 :
                // If n is between 5 and 10 (inclusive), price per hotdog is 95 cents
                // Equivalent if-else statement: else if (n >= 5 && n < 10) { return n * 95; }
                (n >= 5 && n < 10) ? n * 95 :
                        // If n is 10 or more, price per hotdog is 90 cents
                        // Equivalent if-else statement: else { return n * 90; }
                        n * 90;
    }

    public static void main(String[] args) {
        // Testing the saleHotdogs method with different inputs
        // and printing the results
        System.out.println(saleHotdogs(3));   // Expected output: 300
        System.out.println(saleHotdogs(7));   // Expected output: 665
        System.out.println(saleHotdogs(12));  // Expected output: 1080
    }
}