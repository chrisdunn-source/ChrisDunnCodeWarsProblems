public class Movie {
    
    public static int movie(int card, int ticket, double perc) {
        int n = 0; // Initialize the number of trips
        double totalA = 0; // Initialize the total cost for System A
        double totalB = card; // Initialize the total cost for System B
        
        // Keep calculating the total cost for each trip until System B is cheaper than System A
        while (Math.ceil(totalB) >= Math.ceil(totalA)) {
            n++; // Increment the number of trips
            totalA += ticket; // Calculate the total cost for System A for this trip
            totalB += ticket * Math.pow(perc, n); // Calculate the total cost for System B for this trip
        }
        
        return n; // Return the minimum number of trips required
    }
    
    public static void main(String[] args) {
        // Test cases
        System.out.println(movie(500, 15, 0.9)); // Expected output: 43
        System.out.println(movie(100, 10, 0.95)); // Expected output: 24
    }
}
