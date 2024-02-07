public class Alarm {
    public static void main(String[] args) {
        System.out.println(setAlarm(true, true));    // Output: false
        System.out.println(setAlarm(true, false));   // Output: true
        System.out.println(setAlarm(false, true));   // Output: false
        System.out.println(setAlarm(false, false));  // Output: false
    }
    public static boolean setAlarm(boolean employed, boolean vacation) {
        // Define a public static method named "setAlarm" that takes two boolean parameters: "employed" and "vacation"

        if (employed && !vacation) {
            // Check if "employed" is true and "vacation" is false
            // If both conditions are true, it means you are employed and not on vacation

            return true;
            // Return true indicating that you need to set an alarm
        } else {
            // If the above condition is not met (either "employed" is false or "vacation" is true), execute the following block

            return false;
            // Return false indicating that you don't need to set an alarm
        }
    }

}