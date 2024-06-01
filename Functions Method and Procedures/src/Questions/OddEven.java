package Questions;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Number 1: ");
        int num1 = input.nextInt();



        //Calling oddEven Function
        String oddEven = oddEven(num1);
        System.out.printf("\n\nThe %d is %s Number..", num1,oddEven);



    }

    public static String oddEven(int num1){
        String odd = "odd";
        String even = "even";
        if(num1 %2 ==0) return even;
        else return odd;


    }
}
