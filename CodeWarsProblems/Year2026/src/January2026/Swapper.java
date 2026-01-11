/*
I would like to be able to pass an array with two elements to my swapValues function to swap the values. However it appears that the values aren't changing.

Can you figure out what's wrong here?
*/


class Swapper {
    // Declare a class variable to store an array of objects
    public Object[] arguments;

    // Constructor to initialize the Swapper object with an array of objects
    public Swapper(final Object[] args) {
        // Assign the input array to the 'arguments' class variable
        arguments = args;
    }

    // Method to swap the values in the array
    public void swapValues() {
        // Create a new array 'args' with the values from the original array 'arguments'
        Object[] args = new Object[]{arguments[0], arguments[1]};
        
        // Store the first element in a temporary variable 'temp'
        Object temp = args[0];
        
        // Swap the values by assigning the second element to the first position
        args[0] = args[1];
        
        // Assign the temporary value to the second position to complete the swap
        args[1] = temp;
    }
}
