import java.util.Scanner;

public class Assignment_InClassSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Mathematical Operators (+, -, *, /) : ");
        String op = input.next();
        System.out.print("Enter Number one: ");
        double num1 = input.nextDouble();
        System.out.print("Enter Number 2: ");
        double num2 = input.nextDouble();

        switch (op) {
            case "+":
                System.out.println("The Sum is :" + (num1 + num2));
                break;
            case "-":
                System.out.println("The Difference is : " + (num1 - num2));
                break;
            case "*":
                System.out.println("The Product is :" + (num1 * num2));
                break;
            case "/":
                if(num2 != 0){
                System.out.println("The Division is :" + (num1 / num2));
                break;
        }else {
                    System.out.println("Invalid division!!!");
                }
        }
    }
}
