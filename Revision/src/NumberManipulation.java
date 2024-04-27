import java.util.Scanner;

public class NumberManipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        System.out.println("The Max number is: "+ (Math.max(number,number2),(number3)));
    }
}
