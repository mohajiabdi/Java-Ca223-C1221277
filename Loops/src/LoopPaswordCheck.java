import java.util.Scanner;

public class LoopPaswordCheck {
    public static void main(String[] args) {
        int count = 3;

        int pass = 1234;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Password: ");
        int pin  = input.nextInt();


        while (pin != pass && count >0){
            System.out.printf("\nIncorrect Password.\n" +
                    "You have %d Times left To Try Again!" +
                    "\nEnter Your Password: ",count);
            pin  = input.nextInt();
            count--;
        }

        if(pin == pass){
            System.out.println("Correct Password!");
        }else{
            System.out.println("You Have Entered The Wrong Password 3 Times");
        }
    }
}
