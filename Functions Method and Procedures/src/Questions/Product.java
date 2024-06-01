package Questions;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = input.nextInt();




        //Calling Product Function
        int product = product(num1,num2);
        System.out.printf("\n\nThe Product of %d and %d is %d", num1,num2,product);

    }

    public static int product(int num1, int num2) {
        return num1 * num2;
    }
}
