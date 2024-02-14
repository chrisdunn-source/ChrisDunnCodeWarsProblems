package February2024;

public class DoubleArray {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3};
        int[] doubledArray = DoubleArray.map(inputArray);
/*
DoubleArray.map(inputArray):

DoubleArray refers to the class name where the map method is defined.
map is the name of the method we want to call.
inputArray is the argument that we pass to the map method, which is the array we want to double.
The map method is executed with inputArray as the argument.

Inside the map method, it creates a new array doubledArray and doubles each element of the input array.
Finally, it returns the new array with the doubled values.
The returned array from the map method is assigned to the variable doubledArray.

The int[] before doubledArray specifies that doubledArray is an array of integers.
The assignment operator = assigns the value returned by the map method to doubledArray.
 */


// Print the doubled array
        for (int num : doubledArray) {
            System.out.print(num + " ");
        }
    }
    public static int[] map(int[] arr) {
        // Create a new array of the same length as the input array
        int[] doubledArray = new int[arr.length];

        // Iterate over each element of the input array
        for (int i = 0; i < arr.length; i++) {
            // Multiply the current element by 2 and assign the result to the corresponding index in the new array
            doubledArray[i] = arr[i] * 2;
        }

        // Return the new array with doubled values
        return doubledArray;
    }
}
