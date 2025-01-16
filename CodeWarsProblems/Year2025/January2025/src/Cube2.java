public class Cube2 {
    private int side = 0; // Declare a private integer variable called side and initialize it to 0

    public int getSide() { // Define a getter method for retrieving the value of side
        return side; // Return the value of the side variable
    }

    public void setSide(int num) { // Define a setter method for setting the value of side
        side = num; // Set the value of the side variable to the input parameter num
    }

    public static void main(String[] args) { // Main method where the program execution starts
        Cube cube = new Cube(); // Create a new instance of the Cube class

        System.out.println("Initial side of the cube: " + cube.getSide()); // Print the initial side of the cube (0)

        cube.setSide(5); // Set the side of the cube to 5

        System.out.println("Updated side of the cube: " + cube.getSide()); // Print the updated side of the cube (5)
    }
}
