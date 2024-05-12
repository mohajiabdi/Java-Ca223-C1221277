import java.util.Scanner;

public class PracticeWeek6 {
    public static void main(String[] args) {
//        int x = 0;
//        while(x<2){
//            System.out.println("Hello World");
//            x++;
//        }
//
//        for(int i=0; i<2; i++) {
//            System.out.println("Hello World");
//        }
//
//        for(int i=0; i<=20; i++) {
//        if(i%2==0) {
//            System.out.println(i);
//        }
//        }
        Scanner input = new Scanner(System.in);
//    int num1= (int)(Math.random()*10);
//    int num2= (int)(Math.random()*10);
//
//        System.out.println("What is "+num1+ " * " +num2 +"? ");
//
//        int product = input.nextInt();
//        int incorrect = 0;
//
//        while(num1*num2 !=product){
//            incorrect++;
//            System.out.printf("Your Answer is Incorrect\nWhat is %d * %d ",num1,num2);
//            product = input.nextInt();
//        }
//        System.out.println("\nGood Job!");
//        System.out.println("You Made "+incorrect+" Tries!");

        for(int i=1; i<10; i++){
            System.out.println("  ");
            for(int j=1; j<10; j++){
                System.out.printf("%4d", i*j);
            }
        }

        System.out.println("\n\n----------------------------------------------------------------\n");

        for(int i=1; i<=12; i++){
            System.out.println("");
            for(int j=1; j<=12; j++){
                System.out.printf("\n%d * %d = %d",i,j, i*j);
            }
        }
    }
}
