import java.util.*;
public class Average {
    public static void main(String[] args) {
        // Calculate Average

        double num1, num2, num3;
        // Create object from Scanner class

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        double average = (num1 + num2 + num3)/3;

        System.out.println("Average is: "+ average);
    }
}
