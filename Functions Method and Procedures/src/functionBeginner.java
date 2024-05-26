import java.util.Scanner;

public class functionBeginner {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = input.nextInt();

        //display();

        // Calling Sum Function
        int sum = sum(num1, num2);
        System.out.printf("\nThe Sum of %d + %d is %d", num1, num2, sum);

        //Calling Difference Function
        int difference = difference(num1,num2);
        System.out.printf("\n\nThe Difference of %d and %d is %d", num1,num2,difference);

        //Calling Product Function
        int product = product(num1,num2);
        System.out.printf("\n\nThe Product of %d and %d is %d", num1,num2,product);

        //Calling Divide Function
        double division = divide(num1,num2);
        System.out.printf("\n\nThe Division of %d and %d is %.2f", num1,num2,division);

        //Calling Max Function
        int max = max(num1,num2);
        System.out.printf("\n\nThe Maximum of %d and %d is %d", num1,num2,max);

        //Calling Max Function
        int min = min(num1,num2);
        System.out.printf("\n\nThe Minimum of %d and %d is %d", num1,num2,min);


        //Calling oddEven Function
        String oddEven = oddEven(num1);
        System.out.printf("\n\nThe %d is %s Number..", num1,oddEven);


        //Calling areaOFRectangle Function
        int area = areaOfREctangle(num1,num2);
        System.out.printf("\n\nThe Area of %d in Width and %d in Length is %d", num1,num2,area);

        //Calling LoopTotal Function
        loopTotal();


    }

    public static void display(){
//        int age = 30;
//        long tel  = 615443767;

        Scanner input = new Scanner (System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        System.out.print("Enter Your Age: ");
        int age = input.nextInt();
        System.out.print("Enter Your Phone Number: ");
        long tel = input.nextLong();

        System.out.printf("Your name is %s \nyour age is %d \nYour Tel is %d",name, age,tel);
    }

public static int sum(int num1, int num2) {
    //Scanner input = new Scanner (System.in);

    return num1 + num2;
    }


    public static int difference(int num1, int num2) {
        if(num1<num2) return num2-num1;
        else return num1 - num2;

    }

    public static int product(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if(num1<num2) return num2/num1;
        else return num1 / num2;
    }

    public static int max(int num1, int num2){
        if(num1>num2) return num1;
        else return num2;
    }

    public static int min(int num1, int num2){
        if(num1<num2) return num1;
        else return num2;
    }

    public static String oddEven(int num1){
        String odd = "odd";
        String even = "even";
        if(num1 %2 ==0) return even;
        else return odd;


    }
public static int areaOfREctangle(int width, int length){
        return width * length;
}


public static void loopTotal(){
        int total = 0;
        for(int i = 1; i <= 10; i++){
            total +=i;
        }
    System.out.println("\n\nLoop Total of 1 to 10 is: "+total);
}


}
