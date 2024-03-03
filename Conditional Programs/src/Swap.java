import java.util.*;
public class Swap {
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);

        if(num1 < num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.print("Waht is "+ num1 + " - "  + num2 + " ");

        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if(answer == num1-num2){
            System.out.println("Correct!");
        }else{
            System.out.printf("Incorrect");
        }

    }
}
