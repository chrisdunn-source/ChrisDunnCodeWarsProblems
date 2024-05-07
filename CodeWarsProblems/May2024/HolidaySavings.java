package May2024;

    /*
    The purpose of this kata is to work out just how many bottles of duty free whiskey you would have to buy such that the savings over the normal high street price would effectively cover the cost of your holiday.

    You will be given the high street price (normPrice, in £ (Pounds)), the duty free discount (discount, in percent) and the cost of the holiday (in £).

    For example, if a bottle costs £10 normally and the duty free discount is 10%, you would save £1 per bottle. If your holiday will cost £500, you would have to purchase 500 bottles to save £500, so the answer you return should be 500.

    Another example: if a bottle costs £12 normally and the duty free discount is 50%, you would save £6 per bottle. If your holiday will cost £1000, you would have to purchase 166.66 bottles to save £1000, so your answer should be 166 bottles.

    All inputs will be integers. Please return an integer. Round down.
     */
public class HolidaySavings {
    public static void main(String[] args) {
        // Test case 1: normPrice = 10, discount = 10, hol = 500
        // Expected output: 500
        int result1 = dutyFree(10, 10, 500);
        System.out.println("Test case 1: " + result1);

        // Test case 2: normPrice = 12, discount = 50, hol = 1000
        // Expected output: 166
        int result2 = dutyFree(12, 50, 1000);
        System.out.println("Test case 2: " + result2);
    }

    public static int dutyFree(int normPrice, int discount, int hol) {
        double savingsPerBottle = normPrice * (discount / 100.0);
        int numBottles = (int) (hol / savingsPerBottle);
        return numBottles;
    }



}