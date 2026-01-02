package April2024;
    /*
    Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).

    For example,

    [true,  true,  true,  false,
      true,  true,  true,  true ,
      true,  false, true,  false,
      true,  false, false, true ,
      true,  true,  true,  true ,
      false, false, true,  true]
    The correct answer would be 17.
     */
public class Counter {
    public static void main(String[] args) {
        // Create an example array of sheep
        Boolean[] arrayOfSheeps = {true, false, true, false, true, true, null, true};

        // Create an instance of the Counter class
        Counter counter = new Counter();

        // Call the countSheeps method with the arrayOfSheeps and store the result
        int sheepCount = counter.countSheeps(arrayOfSheeps);

        // Print the number of sheep present
        System.out.println("Number of sheep present: " + sheepCount);
    }
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0; // Initialize a variable to keep track of the count of sheep

        for (Boolean sheep : arrayOfSheeps) { // Iterate over each element in the arrayOfSheeps array
            if (sheep != null && sheep) { // If the element is not null and is true (sheep present)
                count++; // Increment the count variable
            }
        }

        return count; // Return the final count of sheep present
    }


}