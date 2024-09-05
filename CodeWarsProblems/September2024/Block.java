/*
Write a class Block that creates a block (Duh..)

Requirements
The constructor should take an array as an argument, this will contain 3 integers of the form [width, length, height] from which the Block should be created.

Define these methods:

`getWidth()` return the width of the `Block`

`getLength()` return the length of the `Block`

`getHeight()` return the height of the `Block`

`getVolume()` return the volume of the `Block`

`getSurfaceArea()` return the surface area of the `Block`
Examples
    Block b = new Block(new int[]{2,4,6}) -> creates a `Block` object with a width of `2` a length of `4` and a height of `6`
    b.getWidth() // -> 2

    b.getLength() // -> 4

    b.getHeight() // -> 6

    b.getVolume() // -> 48

    b.getSurfaceArea() // -> 88
 */
// Define a class named Block
public class Block {
    // Declare instance variables to store the dimensions of the Block
    private int width;
    private int length;
    private int height;

    // Constructor for creating a Block object with given dimensions
    public Block(int[] dimensions) {
        // Initialize the width, length, and height of the Block based on the input array
        this.width = dimensions[0];
        this.length = dimensions[1];
        this.height = dimensions[2];
    }

    // Getter method to obtain the width of the Block
    public int getWidth() {
        return this.width;
    }

    // Getter method to obtain the length of the Block
    public int getLength() {
        return this.length;
    }

    // Getter method to obtain the height of the Block
    public int getHeight() {
        return this.height;
    }

    // Method to calculate and return the volume of the Block
    public int getVolume() {
        return this.width * this.length * this.height;
    }

    // Method to calculate and return the surface area of the Block
    public int getSurfaceArea() {
        return 2 * (this.width * this.length + this.width * this.height + this.length * this.height);
    }

    // Main method to demonstrate the usage of the Block class
    public static void main(String[] args) {
        // Create a new Block object with dimensions [2, 4, 6]
        Block b = new Block(new int[]{2, 4, 6});

        // Print out the width, length, height, volume, and surface area of the Block
        System.out.println("Width: " + b.getWidth());
        System.out.println("Length: " + b.getLength());
        System.out.println("Height: " + b.getHeight());
        System.out.println("Volume: " + b.getVolume());
        System.out.println("Surface Area: " + b.getSurfaceArea());
    }
}