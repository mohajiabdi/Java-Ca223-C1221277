package Questions;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = input.nextInt();


        int max = max(num1,num2);
        System.out.printf("\n\nThe Maximum of %d and %d is %d", num1,num2,max);


    }

    public static int max(int num1, int num2){
        if(num1>num2) return num1;
        else return num2;
    }
}
