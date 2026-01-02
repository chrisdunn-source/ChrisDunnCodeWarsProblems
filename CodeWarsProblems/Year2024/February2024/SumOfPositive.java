public class SumOfPositive {
    /*
    You get an array of numbers, return the sum of all of the positives ones.
    Example [1,-4,7,12] => 1 + 7 + 12 = 20
    Note: if there is nothing to sum, the sum is default to 0.
     */
    public static void main(String[] args) {
        System.out.println(sum(new int[]{}));
    }
    public static int sum(int[] arr){
        //Create a variable to store values of positive #s
        int positiveSum = 0;
        //Created a for loop to traverse the length of array given
        for (int i = 0; i < arr.length;i++){
            //created a conditional to check to see if each element in the array was greater than 0
            if (arr[i] > 0){
                //if that is true then you add that to the current value listed in positiveSum
                positiveSum = positiveSum + arr[i];
            }
        }
        //once you have completed the for loop then you will return the value stored in positiveSum
        return positiveSum;
    }
}
