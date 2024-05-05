import java.util.Scanner;

public class SubtractionWithLoop {
    public static void main(String[] args) {
        final int NUMBEROFQUESTIONS = 5;
        int count = 0;
        int correct = 0;
        int incorrect = 0;
        String output = "";

        while (count < NUMBEROFQUESTIONS) {
            int num1 = (int)(Math.random() * 10);
            int num2 = (int)(Math.random() * 10);

            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.print("Waht is "+ num1 + " - "  + num2 + " ");
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();

            if (num1 -num2 != answer) {
                System.out.println("Incorrect!");
                incorrect++;
            }else {
                System.out.println("Correct!");
                correct++;
            }
            count++;
            output += "\nWhat is "+ num1 +" - "+ num2 +"?"+ " " + answer+" " + (num1 -num2 == answer? "Right" : "Wrong");
        }
        System.out.println("\n");
        System.out.println(output);
        System.out.println("Total correct answers: "+ correct);
        System.out.println("Total incorrect answers: "+ incorrect);

    }
}
