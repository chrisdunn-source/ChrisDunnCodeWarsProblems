package July2024;

public class AlphabetWar {
    public static String alphabetWar(String fight) {
        int leftPower = 0;
        int rightPower = 0;

        for (char c : fight.toCharArray()) {
            switch (c) {
                case 'w':
                    leftPower += 4; // Add 4 to the left side power
                    break;
                case 'p':
                    leftPower += 3; // Add 3 to the left side power
                    break;
                case 'b':
                    leftPower += 2; // Add 2 to the left side power
                    break;
                case 's':
                    leftPower += 1; // Add 1 to the left side power
                    break;
                case 'm':
                    rightPower += 4; // Add 4 to the right side power
                    break;
                case 'q':
                    rightPower += 3; // Add 3 to the right side power
                    break;
                case 'd':
                    rightPower += 2; // Add 2 to the right side power
                    break;
                case 'z':
                    rightPower += 1; // Add 1 to the right side power
                    break;
            }
        }

        if (leftPower > rightPower) {
            return "Left side wins!";
        } else if (rightPower > leftPower) {
            return "Right side wins!";
        } else {
            return "Let's fight again!";
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(alphabetWar("z")); // Right side wins!
        System.out.println(alphabetWar("zdqmwpbs")); // Let's fight again!
        System.out.println(alphabetWar("zzzzs")); // Right side wins!
        System.out.println(alphabetWar("wwwwwwz")); // Left side wins!
    }
}
