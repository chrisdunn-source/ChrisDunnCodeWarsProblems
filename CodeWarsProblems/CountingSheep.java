public class CountingSheep {
    public static void main(String[] args) {
        System.out.println(countingSheep(12));
    }
        public static String countingSheep(int num) {
        /*
        Given a non-negative integer, 3 for example, return a string
        with a murmur: "1 sheep...2 sheep...3 sheep...".
        Input will always be valid, i.e. no negative integers
         */
            //Add your code here
            String dreamStatement = "";
            if(num > 0 ){
               for (int i = 1; i <= num; i++){
                   dreamStatement = dreamStatement + i + " sheep...";
               }
                return dreamStatement;
            }
            return "Not a postive number";

        }

}
