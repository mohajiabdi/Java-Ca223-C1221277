import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (num > 0) {
            if(num%3==0 && num%5==0){
                System.out.println("FizzBuzz");
            }else if(num%5==0){
                System.out.println("Buzz");
            }else if(num%3==0){
                System.out.println("Fizz");
            }
        }else{
            System.out.println("Please enter a number greater than 0");
        }
    }
}
