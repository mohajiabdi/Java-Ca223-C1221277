import java.util.Scanner;

public class bmiWithSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String weightHeightList = "Choose Which Weight and Height Type:\n1. Kilograms and Meters\n" +
                "2. Kilograms and Centimeters\n3. Kilograms and Foot-Inches\n4. Pounds and Meters\n" +
                "5. Pounds and Centimeters\n6. Pounds and Foot-Inches\n";
        //String heightList = "Choose Which Height Type:\n\n1. Meters\n2. Centimeters\n3. Foot and inches";

        System.out.println("\n"+weightHeightList);

        int choice = input.nextInt();

        System.out.print("Enter your weight: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height: ");
        double height = input.nextDouble();

        switch(choice){
            case 1:
                System.out.println("Your BMI is: " + weight / (height * height));
                break;
            case 2:
                System.out.println("Your BMI is: " + weight / (height * height) * 100);
                break;
            case 3:
                System.out.println("Your BMI is: " + weight / (height * height) * 39.37);
                break;
            case 4:
                System.out.println("Your BMI is: " + (weight * 0.453592) / (height * height));
                break;
            case 5:
                System.out.println("Your BMI is: " + (weight * 0.453592) / (height * height) * 100);
                break;
            case 6:
                System.out.println("Your BMI is: " + (weight * 0.453592) / (height * height) * 39.37);
                break;
            default:
                System.out.println("Invalid Choice");
        }


    }
}
