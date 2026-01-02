public class ReduceButGrow {
    /*
    Given a non-empty array of integers, return the result of multiplying the values together in order.
    Example:
    [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
     */
    public static void main(String[] args) {
        System.out.println(grow(new int[]{1,2,3,4}));
    }
    public static int grow(int[] x){
        //Set total to 1 to start multiplication
        int total = 1;
        //check to see if x was null(no value) if it was then return -1
        if(x == null) {
            return -1;
        }
        else {
            //traverse the given list and multiple total by each index spot in array
            for(int i = 0; i < x.length;i++){
                total = total * x[i];
            }
        }
        //return total
        return total;
    }
}
