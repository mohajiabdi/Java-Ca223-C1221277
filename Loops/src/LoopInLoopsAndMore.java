import java.util.Scanner;

public class LoopInLoopsAndMore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i = 1; i <=5; i++) {
            for(int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <=5; i++){
            for (int j = 1; j <=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("--------------------------------");
// Multiplication Table!!
        for (int i = 1; i <=12; i++){
            for (int j = 1; j <=12; j++){
                int total = i *j;
                System.out.printf("%d * %d = %d ", i, j,total);
                System.out.println();
            }
            System.out.println();

        }

        System.out.println("--------------------------------");

        for (int i = 1; i <=5; i++) {
        for (int j = 5; j >=i; j--) {
            System.out.print(j);
        }
        System.out.println();
        }

        for (int i = 1; i <=5; i++) {
            for (int j = 5; j >=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("--------------------------------");

        for (int r = 5; r>=1; r--){
            for (int c = 1; c<=r; c++){
                System.out.print(r);
            }
            System.out.println();
        }

        System.out.println("--------------------------------");
        int num =1;
        for (int r = 1; r<=13; r++){
            for (int c = 1; c<=r; c++){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }


        System.out.println("--------------------------------");

        // Show only Te even numbers

        for (int i  = 30; i >=1; i--){
            if (i %2 == 0){
                System.out.print(i+ " ");
            }
        }

        System.out.println("\n--------------------------------");

        int sum = 0;
        for (int a = 1; a <= 5; a++){
            System.out.print(a);
            sum += a;
        }
        System.out.println("\nThe sum is: " + sum);

        System.out.println("\n--------------------------------");

        System.out.print("Enter Start: ");
        int start = input.nextInt();
        System.out.print("Enter End: ");
        int end = input.nextInt();

        for (int i = start; i <= end; i++){
            System.out.print(i + " ");
        }
        System.out.println("\n--------------------------------");

        int x = 10;
        int z = 7;
        x = ++x +z %5;
        System.out.println(x);


        System.out.println("\n--------------------------------");

        int factorial = 1;
        System.out.print("Enter Factorial Number: ");
        int i = input.nextInt();
        int temp = i;

        while (i>=1){
            factorial = factorial * i;
            i--;
        }
        System.out.println("Factorial of " + temp + "! is: " + factorial);


        System.out.println("\n--------------------------------");

        // Break and Continue in Loops

        for ( i = 1; i <=10; i++){
            if (i ==5){
                break;
            }
            System.out.print(i + " ");

        }
        System.out.println();
        for ( i = 1; i <=10; i++){
            if (i ==5){
                continue;
            }
            System.out.print(i + " ");
        }

    }

}
