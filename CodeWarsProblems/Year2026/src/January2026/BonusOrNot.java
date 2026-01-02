package January2026;

public class BonusOrNot {
    public static void main(String[] args) {
        System.out.println(bonusTime(500,true));

    }
    public static String bonusTime(final int salary, final boolean bonus) {
        int checkAmount;
        if(bonus)
        {
            checkAmount = salary * 10;
        }
        else
        {
            checkAmount = salary;
        }
        return "My Check Amount will be: " + checkAmount;
        // show me the code!
    }
}
