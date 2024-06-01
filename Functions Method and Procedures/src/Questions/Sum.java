package Questions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = input.nextInt();

     

        // Calling Sum Function
        int sum = sum(num1, num2);
        System.out.printf("\nThe Sum of %d + %d is %d", num1, num2, sum);
    }

    public static int sum(int num1, int num2) {
        //Scanner input = new Scanner (System.in);

        return num1 + num2;
    }
}
