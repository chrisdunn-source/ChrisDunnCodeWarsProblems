public class TransportationOnVacation {
    /*
    After a hard quarter in the office you decide to get some rest on a vacation. So you will book a flight for you and your girlfriend and try to leave all the mess behind you.

    You will need a rental car in order for you to get around in your vacation. The manager of the car rental makes you some good offers.

    Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.

    Write a code that gives out the total amount for different days(d).
     */
    public static void main(String[] args) {
        System.out.println(rentalCarCost(7));
    }
    public static int rentalCarCost(int d) {
        // Your solution here
        int days = d;
        int dailyCost = 40;
        int totalCost = dailyCost * days;

        if(days >= 7){
            totalCost = (dailyCost * days) - 50;
        }else if(days >= 3){
            totalCost = (dailyCost * days) - 20;
        }
        return totalCost;
    }
}
