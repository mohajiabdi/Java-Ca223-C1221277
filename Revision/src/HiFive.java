import java.util.Scanner;

public class HiFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int number = input.nextInt();

        if (number %5 ==0){
            System.out.println("Hi Five");
        }
        if(number%2 == 0){
            System.out.println("Hi Even");
        }
    }
}
