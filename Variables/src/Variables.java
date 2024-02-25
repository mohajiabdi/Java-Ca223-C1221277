import java.util.*;
public class Variables {
    public static void main (String[] args){
        // Compute Area of Circles
        // Declare Variables

        double radius;
        double area;

        // Create object From Scanner Class

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius ");
        radius = input.nextDouble();
        area = radius * radius * 3.1415;
        System.out.println("The area is " + area);


    }
}
