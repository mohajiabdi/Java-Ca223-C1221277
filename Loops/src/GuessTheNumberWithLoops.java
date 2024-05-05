import java.util.Scanner;

public class GuessTheNumberWithLoops {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100);
        System.out.println("Guess a number between 1 and 100: ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
//        System.out.println(randomNumber);

        while (guess != randomNumber) {


            if (guess > randomNumber) {
                System.out.println("High Guess\n");


            } else {
                System.out.println("Low Guess\n");

            }
            System.out.print("Guess Again: ");
            guess = input.nextInt();

        }

        System.out.println("\nYou guessed the number!");

    }
}
