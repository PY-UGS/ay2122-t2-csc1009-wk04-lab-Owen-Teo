import java.text.DecimalFormat;
import java.util.Scanner;

public class BmiCalc {
    private static String calcBmi(int height, double weight) {
        final double countBmi = (weight * 0.45359237 / Math.pow(height * 0.0254, 2)) ;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(1);
        df.setMinimumFractionDigits(1);

        String outputText = "\nYour BMI is: " + df.format(countBmi);

        if (countBmi < 18.5) {
            return "Underweight" + outputText;
        } else if (countBmi > 18.5 && countBmi < 24.9) {
            return "Normal" + outputText;
        } else if (countBmi > 25 && countBmi < 30) {
            return "Overweight" + outputText;
        } else if (countBmi > 30) {
            return "Obese" + outputText;
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weight: (in pounds)");
        double setWeight = sc.nextDouble();
        System.out.println("Enter your height: (in inches)");
        int setHeight = sc.nextInt();


        System.out.println(calcBmi(setHeight, setWeight));
    }
}