package Questions;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = input.nextInt();

        //Calling areaOFRectangle Function
        int area = areaOfREctangle(num1,num2);
        System.out.printf("\n\nThe Area of %d in Width and %d in Length is %d", num1,num2,area);
    }

    public static int areaOfREctangle(int width, int length){
        return width * length;
    }

}
