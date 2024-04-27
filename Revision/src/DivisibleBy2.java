import java.util.Scanner;

public class DivisibleBy2 {
    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = inout.nextInt();

        if (num % 2 == 0 && num %3 == 0) {
            System.out.println(num +" is Divisible by 2 and 3");
        }

        if(num % 2 == 0 || num %3 == 0){
            System.out.println(num +" is Divisible by 2 or 3");
        }
        if(num % 2 == 0 ^ num %3 == 0){
            System.out.println(num +" is Divisible by 2 or 3 but not both");
        }
    }
}
