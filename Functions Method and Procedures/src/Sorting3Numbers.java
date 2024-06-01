import java.util.Scanner;

public class Sorting3Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = input.nextInt();
        System.out.print("Enter Number 3: ");
        int num3 = input.nextInt();

        System.out.printf("\nBefore Sorting\nNumber 1: %d\nNumber 2: %d\nNumber 3: %d\n", num1, num2, num3);

        Sort(num1, num2, num3);

        System.out.printf("\nAfter Sorting\nNumber 1: %d\nNumber 2: %d\nNumber 3: %d\n", num1, num2, num3);

    }

    public static void Sort(int a, int b, int c){
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        if (a >c) {
            int temp = a;
            a = b;
            c = temp;
        }

        if (b > c){
            int temp = b;
            b = c;
            c = temp;
        }

        /// Very Wrong not Finishes... I will be back...
    }
}
