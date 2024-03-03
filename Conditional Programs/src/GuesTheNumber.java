import java.util.*;
public class GuesTheNumber {
    public static void main(String[] args) {
        int num = (int)(Math.random()*10);



        System.out.print("Guess The Number: ");

        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        System.out.printf("Number was "+ num+ " ");
        if(num == answer){
            System.out.println("Well Guessed, You are Correct!");
        }else if(answer < num){
            System.out.println("Your guess is less Than the Number");
        }else if(answer > num){
            System.out.println("Your Guess is Greater Than the Number");
        }

    }
}
