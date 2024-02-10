public class NeedleHaystack {
    public static void main(String[] args) {
        /*
        created three test case to test our function that we created at the bottom.
        Outputed the answer in a println statement
         */
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
        Object[] haystack3 = {1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,1,2,3,4,5,5,6,5,4,32,3,45,54};
        System.out.println(findNeedle(haystack1));
        System.out.println(findNeedle(haystack2));
        System.out.println(findNeedle(haystack3));
    }
    public static String findNeedle(Object[] haystack) {
        for(int i = 0; i < haystack.length; i++){
            if(haystack[i] == "needle"){
                return "found the needle at position " + i;
                /*
                Created a function that will go through a given list.  It will traverse the list
                and if the index spot in the list matches the word needle then it will return
                the position spot where it is equal
                 */
            }

        }
        /*
        If the word needle is not found in the given list then you will return the word needle is not
        found in this list
         */
        return "There was not needle found in this list" ;
    }
}
