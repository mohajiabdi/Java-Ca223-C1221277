import java.util.Scanner;

public class SubtractionApp {
    public static void main(String[] args) {
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }



        Scanner inout = new Scanner(System.in);
        System.out.print("What is "+ num1 + " - "+ num2+ ": ");
        int answer = inout.nextInt();

        if(num1 - num2 == answer){
            System.out.println("You are Correct! ");
        }else {
            System.out.println("You are Wrong!");
            System.out.println(num1 +" - "+ num2 + " Should be "+ answer);
        }
    }
}
