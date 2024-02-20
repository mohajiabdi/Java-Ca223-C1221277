import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Changing 35 Celcius to Farenheit ");
        System.out.println((9.0/5)*35 +32);
        int a = 35;
        int b = 30;
        int c = a + b;

        System.out.println("The Value of "+a+" + "+b +" is : " +c);

        System.out.println("Enter Any Number: ");
        Scanner inputNumber = new Scanner(System.in);
        double number = inputNumber.nextDouble();
        System.out.println("The Double Of The Number is: " + number*2);


    }
}
