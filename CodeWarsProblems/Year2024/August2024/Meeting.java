package August2024;

import java.util.*;
import java.util.Arrays;
/*
Could you make a program that

makes this string uppercase
gives it sorted in alphabetical order by last name.
When the last names are the same, sort them by first name. Last name and first name of a guest come in the result between parentheses separated by a comma.

So the result of function meeting(s) will be:

"(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
It can happen that in two distinct families with the same family name two people have the same first name too.
 */
public class Meeting {

    public static String meeting(String s) {
        String[] names = s.toUpperCase().split(";");

        Arrays.sort(names, (name1, name2) -> {
            String[] nameParts1 = name1.split(":");
            String[] nameParts2 = name2.split(":");

            int lastNameCompare = nameParts1[1].compareTo(nameParts2[1]);
            if (lastNameCompare != 0) {
                return lastNameCompare;
            } else {
                return nameParts1[0].compareTo(nameParts2[0]);
            }
        });

        StringBuilder result = new StringBuilder();
        for (String name : names) {
            String[] nameParts = name.split(":");
            result.append("(")
                    .append(nameParts[1])
                    .append(", ")
                    .append(nameParts[0])
                    .append(")");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Raphael:Corwill;Alfred:Corwill;Bjon:Tornbull";
        System.out.println(meeting(s));
    }
}
