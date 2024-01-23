public class StringRepeater {

    public static void main(String[] args) {
        /*
        In the main method, we demonstrate the usage of the repeatCharacters method by providing different input strings and printing the corresponding output strings.
         */
        String input1 = "String";
        String input2 = "Hello World";
        String input3 = "1234!_ ";

        String output1 = repeatCharacters(input1);
        String output2 = repeatCharacters(input2);
        String output3 = repeatCharacters(input3);

        System.out.println(output1); // SSttrriinngg
        System.out.println(output2); // HHeelllloo  WWoorrlldd
        System.out.println(output3); // 11223344!!__
    }
    public static String repeatCharacters(String input) {
        /*
        The repeatCharacters method takes an input string and iterates through each character. It appends each character twice to the output StringBuilder. Finally, it returns the output string.
        */
        /*
        the StringBuilder object named output is used to efficiently build the repeated character string. The append() method is used to add each character twice to the output string. Finally, the toString() method is called to convert the StringBuilder object to a regular String object before returning the result.
         */
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            output.append(c).append(c);
        }

        return output.toString();
    }

}
