import java.util.Scanner;

public class CheckRadius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        if (radius >= 0) {
            System.out.println("The area of the circle is " + (radius * radius * PI));
        } else {
            System.out.println("Radius must be Positive Number");
        }
    }
}
