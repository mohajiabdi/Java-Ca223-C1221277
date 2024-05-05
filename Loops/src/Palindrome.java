import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
      //  int num = 121;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        int temp = num;
        int reverse = 0;
        while( num >0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if(temp == reverse){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
