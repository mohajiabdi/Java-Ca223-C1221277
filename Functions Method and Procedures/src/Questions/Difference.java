package Questions;

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = input.nextInt();

        //Calling Difference Function
        int difference = difference(num1,num2);
        System.out.printf("\n\nThe Difference of %d and %d is %d", num1,num2,difference);
    }

    public static int difference(int num1, int num2) {
        if(num1<num2) return num2-num1;
        else return num1 - num2;

    }
}
