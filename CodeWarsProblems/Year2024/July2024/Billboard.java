package July2024;
/*
You can print your name on a billboard ad. Find out how much it will cost you. Each character has a default price of £30, but that can be different if you are given 2 parameters instead of 1 (allways 2 for Java).

You can not use multiplier "*" operator.

If your name would be Jeong-Ho Aristotelis, ad would cost £600. 20 leters * 30 = 600 (Space counts as a character).


 */
public class Billboard {

    // Method to calculate the cost of printing the name on a billboard
    public static int billboard(String name, int price) {
        // Initialize the cost to 0
        int cost = 0;

        // Loop through each character in the name
        for (int i = 0; i < name.length(); i++) {
            // Add the price per character to the total cost
            cost += price;
        }

        // Return the total cost
        return cost;
    }

    // Main method to test the billboard method
    public static void main(String[] args) {
        String name = "Jeong-Ho Aristotelis";
        int price = 30;

        // Calculate the cost of printing the name on a billboard
        int totalCost = billboard(name, price);

        // Output the total cost
        System.out.println("The total cost for printing the name on the billboard is: £" + totalCost);
    }
}
