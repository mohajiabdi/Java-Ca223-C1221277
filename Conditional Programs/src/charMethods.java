import java.util.Scanner;

public class charMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String input = scanner.next();
        char ch = input.charAt(0);

        if (('a'<= ch && ch<='z') || ('A'<=ch && ch<='Z') || ('0'<=ch && ch<='9')) {
            System.out.println(ch + " is a Digit or letter");
        }else{
            System.out.println(ch + " is not a Digit or letter");
        }

        if('a'<= ch && ch<='z'){
            int upperCase = ((int)ch -32);
            System.out.println();
            System.out.println((char)upperCase);
        }else if('A'<=ch && ch<='Z'){
            int lowerCase = ((int)ch +32);
            System.out.println();
            System.out.println((char)lowerCase);
        }else{
            System.out.println("Its not a valid Letter!!!");
        }


         }
}
