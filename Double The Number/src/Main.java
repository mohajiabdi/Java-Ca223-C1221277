import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Changing 35 Celcius to Farenheit ");
        System.out.println((9.0/5)*35 +32);
        int a = 35;
        int b = 30;
        int c = a + b;
        System.out.println("The Value of "+a+" + "+b +" is : " +c);

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter Three Different Numbers: ");
        double number1 = inputNumber.nextDouble();
        int number2 = inputNumber.nextInt();
        long number3 = inputNumber.nextLong();
        double total = number1 + number2 *number3;
        System.out.println("The Total Number is: " +total );
        System.out.println("And This is The end!!!");


    }
}
