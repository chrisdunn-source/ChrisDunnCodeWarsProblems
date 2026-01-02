import java.util.List;
public class SumMixedArray {
    /*
    the sum method takes a List<?> parameter called mixed,
    which can accept a list containing elements of any type.
    The rest of the logic is the same as before. We iterate
    over each element in the list, convert it to a string
    using toString(), parse it as an integer using
    Integer.parseInt(), and add it to the sum variable.
    Finally, we return the computed sum.
     */
    public int sum(List<?> mixed) {
        //Here, we create a new list to store all of the converted integers of the List called "mixed".
        int[] intList = new int[mixed.size()];
        //Here, we declare an integer we will be adding to. It is the sum of the converted numbers.
        int output = 0;
        //This iterates (steps) through the entirety of the mixed List.
        for(int i = 0; i < mixed.size(); i++) {
            //This converts all of the integers to strings and keeps the Strings as Strings, as adding an empty String to anything will convert it to a string,
            //and is inconsequential to an existing String. After that, parseInt turns the string into an Integer. Finally, this Integer is added to the list of
            //Integers. The reason why we must convert it to a string at all is that parseInt is not very friendly when given an Integer to convert to an Integer
            //and errors.
            intList[i] = Integer.parseInt(mixed.get(i) + "");
        }
        //This iterates through the List of all of the converted-to-Integer values
        for(int i = 0; i < intList.length; i++) {
            //This adds the number in the list corresponding to i (like we're asking it for the i'th number. The first number in an array is the 0'th place) in the
            //for loop to the sum we output later.
            output += intList[i];
        }
        //Here, we return the sum.
        return output;
    }
}
