package June2024;
/*
Suzuki is a monk who climbs a large staircase to the monastery as part of a ritual. Some days he climbs more stairs than others depending on the number of students he must train in the morning. He is curious how many stairs might be climbed over the next 20 years and has spent a year marking down his daily progress.

The sum of all the stairs logged in a year will be used for estimating the number he might climb in 20.

20_year_estimate = one_year_total * 20

You will receive the following data structure representing the stairs Suzuki logged in a year. You will have all data for the entire year so regardless of how it is logged the problem should be simple to solve.

stairs = [sunday,monday,tuesday,wednesday,thursday,friday,saturday]
Make sure your solution takes into account all of the nesting within the stairs array.

Each weekday in the stairs array is an array.

sunday = [6737, 7244, 5776, 9826, 7057, 9247, 5842, 5484, 6543, 5153, 6832, 8274, 7148, 6152, 5940, 8040, 9174, 7555, 7682, 5252, 8793, 8837, 7320, 8478, 6063, 5751, 9716, 5085, 7315, 7859, 6628, 5425, 6331, 7097, 6249, 8381, 5936, 8496, 6934, 8347, 7036, 6421, 6510, 5821, 8602, 5312, 7836, 8032, 9871, 5990, 6309, 7825]
Your function should return the 20 year estimate of the stairs climbed using the formula above.
 */

public class StairClimbing {
    public static long stairsIn20(int[][] stairs) {
        long oneYearTotal = 0; // Variable to store the sum of stairs climbed in one year

        // Iterate over each weekday array in the stairs array
        for (int[] weekday : stairs) {
            // Iterate over each element (stairs climbed) in the weekday array
            for (int stairsClimbed : weekday) {
                oneYearTotal += stairsClimbed; // Accumulate the sum of stairs climbed in one year
            }
        }

        long twentyYearEstimate = oneYearTotal * 20; // Multiply the one year total by 20 to get the 20-year estimate

        return twentyYearEstimate; // Return the estimated number of stairs climbed in 20 years
    }

    public static void main(String[] args) {
        // Test case 1
        int[][] stairs1 = {
                {6737, 7244, 5776, 9826, 7057, 9247, 5842},
                {5484, 6543, 5153, 6832, 8274, 7148, 6152},
                {5940, 8040, 9174, 7555, 7682, 5252, 8793},
                {8837, 7320, 8478, 6063, 5751, 9716, 5085},
                {7315, 7859, 6628, 5425, 6331, 7097, 6249},
                {8381, 5936, 8496, 6934, 8347, 7036, 6421},
                {6510, 5821, 8602, 5312, 7836, 8032, 9871},
                {5990, 6309, 7825}
        };
        long estimate1 = stairsIn20(stairs1);
        System.out.println("Estimated stairs climbed in 20 years for test case 1: " + estimate1);

        // Test case 2
        int[][] stairs2 = {
                {100, 200, 300, 400, 500, 600, 700},
                {800, 900, 1000, 1100, 1200, 1300, 1400},
                {1500, 1600, 1700, 1800, 1900, 2000, 2100},
                {2200, 2300, 2400, 2500, 2600, 2700, 2800},
                {2900, 3000, 3100, 3200, 3300, 3400, 3500},
                {3600, 3700, 3800, 3900, 4000, 4100, 4200},
                {4300, 4400, 4500, 4600, 4700, 4800, 4900},
                {5000, 5100, 5200}
        };
        long estimate2 = stairsIn20(stairs2);
        System.out.println("Estimated stairs climbed in 20 years for test case 2: " + estimate2);
    }
}
