import java.util.*;
public class conditionalOneCheckWithoutIfElse {
    public static void main(String[] args) {
        int num1 = (int)(System.currentTimeMillis()%10);
        int num2 = (int)(System.currentTimeMillis()/10%10);
        System.out.print("What is "+num1+" +"+num2+ " ?  ");

        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        System.out.println(num1 + " + "+num2 + " = "+answer+ "  is "+ (num1 + num2 == answer));
    }
}
