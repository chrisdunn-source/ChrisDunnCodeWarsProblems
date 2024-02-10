public class AreaOrPerimeter {
    /*
    You are given the length and width of a 4-sided polygon. The polygon can either be a rectangle or a square.
    If it is a square, return its area. If it is a rectangle, return its perimeter.

    Example(Input1, Input2 --> Output):
    6, 10 --> 32
    3, 3 --> 9
     */
    public static void main(String[] args) {
        //tested the created function by providing some values
        System.out.println(areaOrPerimeter(3,3));
        System.out.println(areaOrPerimeter(6,10));
    }
    public static int areaOrPerimeter (int l, int w) {
        // code away...
        //created an integer to hold the value of area or perimeter
        int result;
        //checked to see if arguments given were equal, if so then would multiple them together to get the area of the square. If not equal then I would calculate the perimeter by mulitipling the length by 2 and the width by 2
        if (l == w){
            result = l * w;
        }else
            result = l * 2 + w * 2;
        //return the result after the calculation
        return result;
    }
}
