public class QuarterOfYear {
    /*
    Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.
    For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter; and month 11 (November), is part of the fourth quarter.
    Constraint:
    1 <= month <= 12
     */
    public static void main(String[] args) {
        System.out.println(quarterOf(3));
        System.out.println(quarterOf(8));
        System.out.println(quarterOf(11));
        System.out.println(quarterOf(13));


    }
    public static int quarterOf(int month) {
        //Created a variable to store quarter value
        // Your code here
        int quarter = -1;
        //used compound conditionals to attach month to quarter based on a range
        if (month < 1 || month > 12){
            quarter = -1;
        }
        else if (month >= 1 && month <= 3)
        {
            quarter = 1;
        } else if (month >=4 && month <= 6) {
            quarter = 2;
        }else if (month >=7 && month <= 9) {
            quarter = 3;
        }else if (month >=10 && month <= 12) {
            quarter = 4;
        }
        //once i determined the quarter value. I return that value
        return quarter;
    }
}
