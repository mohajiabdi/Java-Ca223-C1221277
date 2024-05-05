import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        //int num1 = 1;
        //int num2 = 2;
        //int num3 = 3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        int max = num1;
        int min = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        System.out.println("");
        System.out.println("Max number is: "+ max);
        System.out.println("Min number is: "+ min);
    }
}
