package Questions;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = input.nextInt();



        //Calling Divide Function
        double division = divide(num1,num2);
        System.out.printf("\n\nThe Division of %d and %d is %.2f", num1,num2,division);



    }

    public static double divide(double num1, double num2) {
        if(num1<num2) return num2/num1;
        else return num1 / num2;
    }
}
