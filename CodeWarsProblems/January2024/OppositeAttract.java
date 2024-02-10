public class OppositeAttract {
    /*
    Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.

    Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
     */
    public static void main(String[] args) {
        int flower1 = 3;
        int flower2 = 4;
        boolean love = isLove(flower1, flower2);
        System.out.println(love); // Output: true
    }
    public static boolean isLove(final int flower1, final int flower2) {
        // Check if one flower has an even number of petals and the other has an odd number of petals
        if ((flower1 % 2 == 0 && flower2 % 2 != 0) || (flower1 % 2 != 0 && flower2 % 2 == 0)) {
            return true; // They are in love
        } else {
            return false; // They are not in love
        }
    }
}
