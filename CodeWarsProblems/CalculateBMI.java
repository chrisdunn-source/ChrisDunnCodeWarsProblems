public class CalculateBMI {
    /*
    Write function bmi that calculates body mass index (bmi = weight / height2).
    if bmi <= 18.5 return "Underweight"
    if bmi <= 25.0 return "Normal"
    if bmi <= 30.0 return "Overweight"
    if bmi > 30 return "Obese"
     */
    public static void main(String[] args) {
        System.out.println(bmi(80,1.8));
    }
    public static String bmi(double weight, double height) {
        //Created a varible to calculate bmi
        double bmi = weight/(height * height);
        //created a default string for result
        String result = "Non-Valid";
        //Used conditionals to determine result from bmi calculation
        if (bmi <= 18.5) {
            result = "Underweight";
        } else if (bmi <= 25.0) {
            result = "Normal";
        } else if (bmi <= 30.0){
            result = "Overweight";
        } else if (bmi > 30) {
            result = "Obese";
        }
        //returned the result when done
        return result;
    }
}
