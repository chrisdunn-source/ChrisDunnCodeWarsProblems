package March2024;
    /*
    Mr. Scrooge has a sum of money 'P' that he wants to invest. Before he does, he wants to know how many years 'Y' this sum 'P' has to be kept in the bank in order for it to amount to a desired sum of money 'D'.

    The sum is kept for 'Y' years in the bank where interest 'I' is paid yearly. After paying taxes 'T' for the year the new sum is re-invested.

    Note to Tax: not the invested principal is taxed, but only the year's accrued interest
     */
public class Money {
    // Main method with test cases
    public static void main(String[] args) {
        // Test case 1 - Principal: $1000, Interest: 0.05, Tax: 0.18, Desired: $2000
        double principal1 = 1000;
        double interest1 = 0.05;
        double tax1 = 0.18;
        double desired1 = 2000;
        int years1 = calculateYears(principal1, interest1, tax1, desired1);
        System.out.println("Years required for Test Case 1: " + years1);

        // Test case 2 - Principal: $5000, Interest: 0.03, Tax: 0.12, Desired: $10000
        double principal2 = 5000;
        double interest2 = 0.03;
        double tax2 = 0.12;
        double desired2 = 10000;
        int years2 = calculateYears(principal2, interest2, tax2, desired2);
        System.out.println("Years required for Test Case 2: " + years2);
    }
    public static int calculateYears(double principal, double interest, double tax, double desired) {
        int years = 0; // Variable to keep track of the number of years
        while (principal < desired) { // Continue looping until the principal amount reaches or exceeds the desired amount
            double interestEarned = principal * interest; // Calculate the interest earned by multiplying the principal by the interest rate
            double taxPaid = interestEarned * tax; // Calculate the tax paid on the interest earned
            principal += interestEarned - taxPaid; // Update the principal by adding the interest earned and subtracting the tax paid
            years++; // Increment the number of years
        }
        return years; // Return the total number of years
    }
}
