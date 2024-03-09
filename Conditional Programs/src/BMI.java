import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.*;

public class BMI {
    public static void main(String[] args) {






        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();


        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();
        double bmi = weight/ (height*height);


        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedValue = decimalFormat.format(bmi);
        double roundedValue = Double.parseDouble(formattedValue);

        bmi = roundedValue;



        System.out.println("\nYour BMI is: " + bmi + "    and ");

        if (bmi <= 18.5){
            System.out.println("You are Underweight!!");
        }else if (bmi <= 25.0){
            System.out.println("You are Normal weight!!");
        }else if (bmi <= 30.0){
            System.out.println("You are Overweight!!");
        }else {
            System.out.println("You are Obese!!");
        }

    }
}
