import java.util.*;
public class ifElse {
    public static void main(String[] args) {
        int num1 = (int)(System.currentTimeMillis()%10);
        int num2 = (int)(System.currentTimeMillis()/10%10);
        System.out.print("What is "+num1+" +"+num2+ " ?  ");

        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if(num1 + num2 == answer){
            System.out.println("You are Correct!");

        }else{
            System.out.println("You are Incorrect!");
            System.out.printf(num1 + " + "+num2 + " = "+answer+ "  is Incorrect. The answer Should be "+(num1+num2));
        }
        //System.out.println(num1 + " + "+num2 + " = "+answer+ "  is "+ (num1 + num2 == answer));
    }
}
