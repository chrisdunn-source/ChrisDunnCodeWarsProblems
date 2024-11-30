/*
Create the array int[] sequence that holds the values of the first 15 terms of the Fibonacci sequence. 
Think carefully about what happens to the index when iterating through the loop to fill this array. 
Read the Fibonacci description above to help!
Then print out the sequence of numbers separated by a space.
Finally, create a method findNextElement that returns the element that comes after the parameter value.
If the element doesn’t exist, return -1.

Sample output:

The first 15 elements in the Fibonacci sequence are: 
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 
The element after 21 is 34
The element after 233 is 377
The element after 377 is -1
*/
public class Fibonacci 
{
    public static void main(String[] args) 
    {
      
        //number of elements to generate in the sequence
		int max = 15;
		
		// create the array to hold the sequence of Fibonacci numbers
		int [] sequence = new int[max];
		
		//create the first 2 Fibonacci sequence elements
		sequence[0] = 0;
		sequence[1] = 1;
		
		//create the Fibonacci sequence and store it in int[] sequence
	    for (int i = 2; i < sequence.length; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }
		
		//print the Fibonacci sequence numbers
		for(int i = 0; i < sequence.length; i++)
		{
		    System.out.print(sequence[i] + " ");
		}
      
    
        System.out.println();
        System.out.println("\nThe element after 21 is " + findNextElement(sequence,21 ));
        System.out.println("\nThe element after 233 is " + findNextElement(sequence, 233));
        System.out.println("\nThe element after 377 is " + findNextElement(sequence, 377));
    }
      
    // This method returns the element that comes after element 'toFind'
    public static int findNextElement (int[] arr, int toFind) 
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] == toFind)
            {
                return arr[i + 1];
            }
        }    
        return -1;
    }
}
