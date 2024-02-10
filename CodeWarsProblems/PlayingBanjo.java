public class PlayingBanjo {
    public static void main(String[] args) {
        //test case to see if function runs as expected
        System.out.println(areYouPlayingBanjo("rick"));
        System.out.println(areYouPlayingBanjo("Mick"));
        System.out.println(areYouPlayingBanjo("Ryan"));
    }
    public static String areYouPlayingBanjo(String name) {
        //created a string to hold result of conditional
        String result = "";
        //created a conditional that checks to see if the first character in the string is 'R' or 'r'. If true then will store name and string plays banjo in the variable result. If not true will store name and string does not play bango in the variable result
            if (name.charAt(0) == 'R' || name.charAt(0)== 'r'){
                result = name + " plays banjo";
            }else
                result = name + " does not play banjo";
        //once the condition has been checked then we will return the value stored in result to function call
        return result;
    }
}
