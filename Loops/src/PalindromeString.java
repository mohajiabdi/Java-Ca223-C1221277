import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A String: ");
        String str = input.nextLine();

        String reversed = "";

        for(int i = str.length()-1; i>=0; i--) {
        reversed +=str.charAt(i);
        }
        if(str.equalsIgnoreCase(reversed)){
            System.out.println("The String is Palindrome");
        }else{
            System.out.println("The String is not Palindrome");
        }
//        System.out.println(str.charAt(0));
    }
}
