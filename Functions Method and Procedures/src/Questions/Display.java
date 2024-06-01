package Chapter6AllExamplesMethods;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        display();
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
}
